package com.example.notes_todo_app.viewmodel

import androidx.lifecycle.*
import com.example.notes_todo_app.data.AppDao
import com.example.notes_todo_app.data.Note
import com.example.notes_todo_app.data.TodoItem
import kotlinx.coroutines.launch

class AppViewModel(private val appDao: AppDao) : ViewModel() {

    // Mengambil semua data To-Do dan Notes sebagai Flow
    val allTodos = appDao.getAllTodos()
    val allNotes = appDao.getAllNotes()

    // Fungsi untuk menyisipkan data baru
    fun insertTodo(title: String, description: String) = viewModelScope.launch {
        val newTodo = TodoItem(title = title, description = description)
        appDao.insertTodo(newTodo)
    }

    fun insertNote(title: String, content: String) = viewModelScope.launch {
        val newNote = Note(title = title, content = content)
        appDao.insertNote(newNote)
    }

    // Fungsi untuk memperbarui item
    fun updateTodo(todo: TodoItem) = viewModelScope.launch {
        appDao.updateTodo(todo)
    }

    fun updateNote(note: Note) = viewModelScope.launch {
        appDao.updateNote(note)
    }
    
    // Fungsi untuk menghapus item
    fun deleteTodo(todo: TodoItem) = viewModelScope.launch {
        appDao.deleteTodo(todo)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        appDao.deleteNote(note)
    }
}

// Factory untuk membuat instance ViewModel dengan parameter (DAO)
class AppViewModelFactory(private val appDao: AppDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AppViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AppViewModel(appDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

