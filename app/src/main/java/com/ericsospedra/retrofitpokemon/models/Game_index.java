package com.ericsospedra.retrofitpokemon.models;

import java.util.List;

public class Game_index {
    private int game_index;
    private Version version;

    public Game_index(int game_index, Version version) {
        this.game_index = game_index;
        this.version = version;
    }

    public int getGame_index() {
        return game_index;
    }

    public Version getVersion() {
        return version;
    }
}
