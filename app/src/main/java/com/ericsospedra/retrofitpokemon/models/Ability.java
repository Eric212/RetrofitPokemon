package com.ericsospedra.retrofitpokemon.models;


import java.util.Map;

public class Ability {
    private AbilityDetail ability;
    private boolean is_hidden;
    private int slot;

    public Ability(AbilityDetail ability, boolean is_hidden, int slot) {
        this.ability = ability;
        this.is_hidden = is_hidden;
        this.slot = slot;
    }

    public AbilityDetail getAbility() {
        return ability;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public int getSlot() {
        return slot;
    }
}
