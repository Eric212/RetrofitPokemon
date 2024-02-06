package com.ericsospedra.retrofitpokemon.models.generations.games;

import com.ericsospedra.retrofitpokemon.models.Game;

public class Red_Blue extends Game {
    public Red_Blue(String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale, String backDefault, String backFemale, String backShiny, String backShinyFemale) {
        super(frontDefault, frontFemale, frontShiny, frontShinyFemale, backDefault, backFemale, backShiny, backShinyFemale);
    }

    @Override
    public void createGame() {

    }
}
