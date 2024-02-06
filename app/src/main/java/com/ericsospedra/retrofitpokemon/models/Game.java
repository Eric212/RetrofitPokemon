package com.ericsospedra.retrofitpokemon.models;

public abstract class Game {
    protected String frontDefault;
    protected String frontFemale;
    protected String frontShiny;
    protected String frontShinyFemale;
    protected String backDefault;
    protected String backFemale;
    protected String backShiny;
    protected String backShinyFemale;

    public Game(String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale,
                String backDefault, String backFemale, String backShiny, String backShinyFemale) {
        this.frontDefault = frontDefault;
        this.frontFemale = frontFemale;
        this.frontShiny = frontShiny;
        this.frontShinyFemale = frontShinyFemale;
        this.backDefault = backDefault;
        this.backFemale = backFemale;
        this.backShiny = backShiny;
        this.backShinyFemale = backShinyFemale;
    }

    public abstract void createGame();

    public String getFrontDefault() {
        return frontDefault;
    }

    public String getFrontFemale() {
        return frontFemale;
    }

    public String getFrontShiny() {
        return frontShiny;
    }

    public String getFrontShinyFemale() {
        return frontShinyFemale;
    }

    public String getBackDefault() {
        return backDefault;
    }

    public String getBackFemale() {
        return backFemale;
    }

    public String getBackShiny() {
        return backShiny;
    }

    public String getBackShinyFemale() {
        return backShinyFemale;
    }
}
