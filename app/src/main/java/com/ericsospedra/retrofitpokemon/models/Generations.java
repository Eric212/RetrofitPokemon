package com.ericsospedra.retrofitpokemon.models;

public abstract class Generations {
    private Game game;

    public Generations(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }
}
