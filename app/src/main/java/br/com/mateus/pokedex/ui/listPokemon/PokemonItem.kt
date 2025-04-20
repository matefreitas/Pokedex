package br.com.mateus.pokedex.ui.listPokemon

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade

@Composable
fun PokemonItem(
    modifier: Modifier = Modifier,
    name: String,
    imgPokemon: String,
    id: Long
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .height(200.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.elevatedCardElevation(8.dp)
    ) {
        Box(){
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imgPokemon)
                    .crossfade(true)
                    .build(),
                contentDescription = "",
                modifier = modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .align(Alignment.Center)
                    .clip(RoundedCornerShape(8.dp))
            )
            Text(
                text = name,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(top = 30.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PokemonItemPreview() {
    PokemonItem(
        name = "pikachu",
        imgPokemon = "",
        id = 1
    )
}