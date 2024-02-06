package com.ericsospedra.retrofitpokemon.models.generations;

import com.ericsospedra.retrofitpokemon.models.Game;
import com.ericsospedra.retrofitpokemon.models.Generations;
import com.ericsospedra.retrofitpokemon.models.generations.games.Red_Blue;

public class Generation_I extends Generations {
    private Red_Blue red_blue;
    public Generation_I(Game game) {
        super(game);
    }
}
