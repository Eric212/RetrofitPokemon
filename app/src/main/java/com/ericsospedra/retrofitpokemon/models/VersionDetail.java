package com.ericsospedra.retrofitpokemon.models;


public class VersionDetail {
    private int rarity;
    private Version version;

    public VersionDetail(int rarity, Version version) {
        this.rarity = rarity;
        this.version = version;
    }

    public int getRarity() {
        return rarity;
    }

    public Version getVersion() {
        return version;
    }
}
