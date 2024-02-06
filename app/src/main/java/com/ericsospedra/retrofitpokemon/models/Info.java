package com.ericsospedra.retrofitpokemon.models;

public abstract class Info {
    private String name;
    private String url;

    public Info(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
