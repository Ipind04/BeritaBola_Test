package com.example.beritabolaterbaru

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.beritabolaterbaru.navigation.NavigationGraph
import com.example.beritabolaterbaru.viewmodel.NewsViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val newsViewModel: NewsViewModel<Any?> = viewModel()

            NavigationGraph(navController = navController, viewModel = newsViewModel)
        }
    }
}