package com.example.beritabolaterbaru.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.beritabolaterbaru.model.BeritaBolaTerbaru
import com.example.beritabolatest.R

@Composable
fun MainScreen(beritaList: List<BeritaBolaTerbaru>) {
    // Menggunakan Column untuk menampilkan daftar berita
    Column {
        for (berita in beritaList) {
            BeritaBolaCard(
                berita = berita,
                onDetailClick = { /* TODO: Handle detail click */ },
                onFavoriteClick = { /* TODO: Handle favorite click */ }
            )
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    // Contoh berita untuk pratinjau
    val contohBerita = listOf(
        BeritaBolaTerbaru(
            id = 1,
            stringResourceId = R.string.beritabolaterbaru1,
            imageResourceId = R.drawable.real_madrid_vs_barcelona,
            detail = "El Clasico kembali digelar dengan Real Madrid menghadapi Barcelona."
        ),
        // Tambahkan berita contoh lainnya jika perlu
    )
    MainScreen(beritaList = contohBerita)
}