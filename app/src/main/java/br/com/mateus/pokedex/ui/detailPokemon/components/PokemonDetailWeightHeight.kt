package br.com.mateus.pokedex.ui.detailPokemon.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.mateus.pokedex.R

@Composable
fun PokemonDetailWeightHeight(
    modifier: Modifier = Modifier,
    weight: Long,
    height: Long
) {
    Column{
        Row(
            modifier = modifier.fillMaxWidth()
        ){
            Text(
                text = "${height.toDouble()/10} M",
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = modifier.weight(1f)
            )
            Text(
                text = "${weight.toDouble()/10} KG",
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = modifier.weight(1f)
            )
        }
        Row(
            modifier = modifier.fillMaxWidth()
        ){
            Text(
                text = stringResource(id = R.string.height),
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .weight(1f)
                    .padding(bottom = 5.dp)
            )
            Text(
                text = stringResource(id = R.string.weight),
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .weight(1f)
                    .padding(bottom = 5.dp)
            )
        }
    }
}

@Preview(locale = "pt-rBR")
@Composable
private fun PokemonDetailWeightHeightPreview() {
    PokemonDetailWeightHeight(
        weight = 80,
        height = 30
    )
}