/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

/**
 *
 * @author sakurazuka
 */
public enum Races {

    DWARF("Dwarf"),
    ELF("Elf"),
    HALFLING("Halfling"),
    HUMAN("Human"),
    DRAGONBORN("Dragonborn"),
    GNOME("Gnome"),
    HALFELF("Half-elf"),
    HALFORC("Half-orc"),
    TIEFLING("Tiefling");

    private final String mName;

    Races(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }

}
