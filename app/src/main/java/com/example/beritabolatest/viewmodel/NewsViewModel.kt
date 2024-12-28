package com.example.beritabolaterbaru.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.beritabolaterbaru.ui.theme.data.Data

private val id: Any
    get() = Unit
private var isFavorite: Any
    get() {
        TODO("Not yet implemented")
    }
    set(value) = Unit

class NewsViewModel<BeritaBolaTerbaru> : ViewModel() {
    private val _allNews = mutableStateListOf<BeritaBolaTerbaru>()
    private val _favoriteNews = mutableStateListOf<BeritaBolaTerbaru>()

    val allNews: List<BeritaBolaTerbaru> get() = _allNews
    val favoriteNews: List<BeritaBolaTerbaru> get() = _favoriteNews

    init {
        loadNews() // Memuat berita saat ViewModel diinisialisasi
    }

    private fun loadNews() {
        _allNews.addAll(Data().loadBeritaBolaTerbaru())
    }

    fun toggleFavorite(newsId: Int) {
        val news = _allNews.find { id == newsId }
        news?.let {
            isFavorite = !isFavorite
            if (isFavorite as Boolean) {
                _favoriteNews.add(it)
            } else {
                _favoriteNews.remove(it)
            }
        }
    }

    operator fun iterator(): Iterator<BeritaBolaTerbaru> {
        return _allNews.iterator() // Mengembalikan iterator dari _allNews
    }
}

private fun <StateObject> StateObject.addAll(elements: List<Any?>) {

}

private operator fun Any.not() {

}
