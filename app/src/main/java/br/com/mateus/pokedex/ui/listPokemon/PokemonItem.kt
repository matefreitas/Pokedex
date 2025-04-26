package br.com.mateus.pokedex.ui.listPokemon

import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mateus.pokedex.R
import br.com.mateus.pokedex.ui.theme.PokedexTheme
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.request.error

@Composable
fun PokemonItem(
    modifier: Modifier = Modifier,
    name: String,
    imgPokemon: String,
    type: String,
    onclick: (id: Int) -> Unit
) {
    Log.d("type", "$type ")
    Card(
        modifier = modifier
            .fillMaxSize()
            .height(200.dp)
            .padding(8.dp)
            .clickable{ onclick },
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.elevatedCardElevation(8.dp)
    ) {
        Column(
            modifier = modifier.background(backgroundColorTypePokemon(type))
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imgPokemon)
                    .crossfade(true)
                    .error(R.drawable.ic_launcher_foreground)
                    .build(),
                contentDescription = "",
                modifier = modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .clip(RoundedCornerShape(8.dp))

            )
            Text(
                text = name,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            )
        }
    }
}

private fun backgroundColorTypePokemon(
    type: String
): Color{
    return when(type) {
        "grass" -> Color(0xFF89D74E)
        "fire" -> Color(0xFFFB5643)
        "water" -> Color(0xFF57ADFF)
        "bug" -> Color(0xFFC3D21E)
        "normal" -> Color(0xFFB6B7A9)
        "poison" -> Color(0xFFA75BA1)
        "electric" -> Color(0xFFFCE53D)
        "ground" -> Color(0xFFE9C654)
        "fighting" -> Color(0xFFA75845)
        "ghost" -> Color(0xFF7A74D6)
        "psychic" -> Color(0xFFF461B0)
        "rock" -> Color(0xFFD0BD72)
        "steel" -> Color(0xFFC4C2DA)
        "flying" -> Color(0xFF7BA4FF)
        "ice" -> Color(0xFF95F1FE)
        "dragon" -> Color(0xFF8974FE)
        "dark" -> Color(0xFF8F6955)
        "fairy" -> Color(0xFFFAADFF)
        else -> Color.Gray
    }
}

@Preview
@Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PokemonItemPreview() {
    PokedexTheme {
        Surface {
            PokemonItem(
                name = "pikachu",
                imgPokemon = "",
                type = "psychic",
                onclick = {}
            )
        }
    }
}