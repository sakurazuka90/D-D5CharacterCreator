/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.enums;

/**
 *
 * @author Sakurazuka
 */
public enum Abilities {

    STRENGTH("Strength"),
    DEXTERITY("Dexterity"),
    CONSTITUTION("Constitution"),
    INTELIGENCE("Inteligence"),
    WISDOM("Wisdom"),
    CHARISMA("Charisma");

    private final String mName;

    Abilities(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }
}
