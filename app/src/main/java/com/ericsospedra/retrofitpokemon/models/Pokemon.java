package com.ericsospedra.retrofitpokemon.models;

import com.ericsospedra.retrofitpokemon.models.Ability;

import java.util.List;

public class Pokemon {
    private List<Ability> abilities;
    private int base_experience;
    private List<Form> forms;
    private List<Game_index> game_indices;
    private int height;
    private List<Item> held_items;
    private String location_area_encounters;
    private List<PokemonMove> moves;
    private Species species;
    private Sprites sprites;
}
