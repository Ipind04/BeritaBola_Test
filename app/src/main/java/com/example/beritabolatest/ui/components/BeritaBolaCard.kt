package com.example.beritabolaterbaru.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.beritabolaterbaru.ui.screens.BeritaBolaTerbaru

@Composable
fun BeritaBolaCard(
    berita: BeritaBolaTerbaru,
    onDetailClick: (String) -> Unit,
    onFavoriteClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.padding(8.dp)) {
        Column {
            Image(
                painter = painterResource(berita.imageResourceId),
                contentDescription = stringResource(berita.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = stringResource(berita.stringResourceId),
                    modifier = Modifier
                        .weight(1f)
                        .padding(16.dp)
                )

                IconButton(onClick = { onFavoriteClick(berita.id) }) {
                    Icon(
                        imageVector = if (berita.isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                        contentDescription = "Favorite"
                    )
                }
            }

            // Tombol Selengkapnya
            Button(
                onClick = { onDetailClick(berita.id.toString()) },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Selengkapnya")
            }
        }
    }
}