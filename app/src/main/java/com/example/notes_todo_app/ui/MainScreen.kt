package com.example.notes_todo_app.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Note
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.notes_todo_app.data.Note
import com.example.notes_todo_app.data.TodoItem
import com.example.notes_todo_app.viewmodel.AppViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(viewModel: AppViewModel) {
    var selectedTab by remember { mutableStateOf(0) }
    var editingNote by remember { mutableStateOf<Note?>(null) }

    val todos by viewModel.allTodos.collectAsStateWithLifecycle(initialValue = emptyList())
    val notes by viewModel.allNotes.collectAsStateWithLifecycle(initialValue = emptyList())

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.List, contentDescription = "Todos") },
                    label = { Text("Todos") },
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Note, contentDescription = "Notes") },
                    label = { Text("Notes") },
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 }
                )
            }
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            when (selectedTab) {
                0 -> TodoListScreen(
                    todos = todos,
                    onAddTodo = { title, description ->
                        viewModel.insertTodo(title, description)
                    },
                    onToggleTodo = { todo ->
                        viewModel.updateTodo(todo.copy(isCompleted = !todo.isCompleted))
                    },
                    onDeleteTodo = { todo ->
                        viewModel.deleteTodo(todo)
                    }
                )
                1 -> NotesListScreen(
                    notes = notes,
                    onAddNote = { title, content ->
                        viewModel.insertNote(title, content)
                    },
                    onEditNote = { note ->
                        editingNote = note
                    },
                    onDeleteNote = { note ->
                        viewModel.deleteNote(note)
                    }
                )
            }
        }
    }

    // Edit Note Dialog
    editingNote?.let { note ->
        AddEditNoteDialog(
            note = note,
            onDismiss = { editingNote = null },
            onConfirm = { title, content ->
                viewModel.updateNote(note.copy(title = title, content = content, lastModified = System.currentTimeMillis()))
                editingNote = null
            }
        )
    }
}

