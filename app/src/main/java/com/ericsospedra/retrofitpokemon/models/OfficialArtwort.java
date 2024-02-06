package com.ericsospedra.retrofitpokemon.models;

public class OfficialArtwort {
    private String front_default;
    private String front_shiny;

    public OfficialArtwort(String front_default, String front_shiny) {
        this.front_default = front_default;
        this.front_shiny = front_shiny;
    }

    public String getFront_default() {
        return front_default;
    }

    public String getFront_shiny() {
        return front_shiny;
    }
}
