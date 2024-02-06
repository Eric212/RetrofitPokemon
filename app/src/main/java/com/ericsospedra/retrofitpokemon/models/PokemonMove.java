package com.ericsospedra.retrofitpokemon.models;

import java.util.List;

public class PokemonMove {
    private Move move;
    private List<VersionGroupDetail> version_group_details;

    public PokemonMove(Move move, List<VersionGroupDetail> version_group_details) {
        this.move = move;
        this.version_group_details = version_group_details;
    }

    public Move getMove() {
        return move;
    }

    public List<VersionGroupDetail> getVersion_group_details() {
        return version_group_details;
    }
}
