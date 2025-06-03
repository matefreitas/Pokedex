package br.com.mateus.pokedex.ui.detailPokemon.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import br.com.mateus.pokedex.R
import br.com.mateus.pokedex.util.backgroundColorTypePokemon
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.request.error

@Composable
fun PokemonDetailBackdropImage(
    modifier: Modifier = Modifier,
    urlImg: String,
    type: String
) {
    Card(
        shape = RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp),
        colors = CardDefaults.cardColors(
            contentColor = backgroundColorTypePokemon(type),
            containerColor = backgroundColorTypePokemon(type)
        )
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(urlImg)
                .crossfade(true)
                .error(R.drawable.ic_launcher_foreground)
                .build(),
            contentDescription = null,
            modifier = modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}