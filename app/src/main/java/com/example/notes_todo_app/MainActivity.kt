package com.example.notes_todo_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.notes_todo_app.data.AppDatabase
import com.example.notes_todo_app.ui.MainScreen
import com.example.notes_todo_app.ui.theme.NotesTodoAppTheme
import com.example.notes_todo_app.viewmodel.AppViewModel
import com.example.notes_todo_app.viewmodel.AppViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val database = AppDatabase.getDatabase(this)
        val appDao = database.appDao()
        val viewModelFactory = AppViewModelFactory(appDao)
        
        setContent {
            NotesTodoAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel: AppViewModel = viewModel(factory = viewModelFactory)
                    MainScreen(viewModel = viewModel)
                }
            }
        }
    }
}

