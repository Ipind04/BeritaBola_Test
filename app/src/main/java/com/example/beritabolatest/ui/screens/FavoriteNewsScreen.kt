package com.example.beritabolaterbaru.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru
import com.example.beritabolaterbaru.viewmodel.NewsViewModel

@Composable
fun FavoriteNewsScreen(viewModel: NewsViewModel<List<BeritaBolaTerbaru>>, onDetailClick: (String) -> Unit) {
    LazyColumn {
        items(viewModel.favoriteNews) { berita ->
            BeritaBolaCard(
                berita = berita,
                onDetailClick = onDetailClick,
                onFavoriteClick = { /* Tidak perlu mengubah status favorit di sini */ }
            )
        }
    }
}

fun BeritaBolaCard(berita: List<BeritaBolaTerbaru>, onDetailClick: (String) -> Unit, onFavoriteClick: (Int) -> Unit) {

}

@Composable
fun BeritaBolaCard(berita: BeritaBolaTerbaru, onDetailClick: (String) -> Unit, onFavoriteClick: (Int) -> Unit) {
    // Implementasi tampilan berita di sini
    // Gunakan berita untuk menampilkan informasi yang sesuai
}