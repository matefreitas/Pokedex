package br.com.mateus.pokedex.data.model

data class PokemonDetail(
    val spritePokemon: String,
    val name: String,
    val types: List<String>,
    val height: Long,
    val weight: Long
)
/*data class PokemonDetail(
    val abilities: List<AbilityResponse>,
    val baseExperience: Long,
    val cries: CriesResponse,
    val forms: List<FormResponse>,
    val gameIndices: List<IndexResponse>,
    val height: Long,
    val heldItems: List<HeldItemResponse>,
    val id: Long,
    val isDefault: Boolean,
    val locationAreaEncounters: String,
    val moves: List<MoveResponse>,
    val name: String,
    val order: Long,
    val pastAbilities: List<AbilityResponse?>,
    val pastTypes: List<TypeResponse?>,
    val species: SpeciesResponse,
    val sprites: SpritesResponse,
    val stats: List<StatResponse>,
    val types: List<TypeResponse>,
    val weight: Long
)*/