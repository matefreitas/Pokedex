package br.com.mateus.pokedex.ui.detailPokemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mateus.pokedex.R
import br.com.mateus.pokedex.model.PokemonDetail
import br.com.mateus.pokedex.ui.theme.PokedexTheme
import br.com.mateus.pokedex.util.FunctionUtil
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.request.error

@Composable
fun DetailPokemonContent(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    type: String,
    urlImg: String,
    name: String
) {
    Column(
        modifier = modifier.padding(paddingValues)
    ) {
        Card(
            shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 10.dp),
            colors = CardDefaults.cardColors(
                contentColor = FunctionUtil.backgroundColorTypePokemon(type),
                containerColor = FunctionUtil.backgroundColorTypePokemon(type)
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
        Text(
            name,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )
    }

}

/*@Preview
@Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DetailPokemonContentPreview() {
    PokedexTheme {
        Surface {
            DetailPokemonContent(

            )
        }
    }
}*/