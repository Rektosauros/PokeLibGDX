package com.lpoo.pokemon.logic;

import com.badlogic.gdx.graphics.Texture;

import com.lpoo.pokemon.logic.Move.ELEMENTS;

public abstract class PokemonBase {
    String Name;
    ELEMENTS ElementType;
    Texture texture;
    
    // Stats
    double MaxHitPoints;
    double HitPoints;
    double Attack;
    double Defense;
    double SpecialAttack;
    double SpecialDefense;
    double Speed;
    

}
