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
public enum Subraces {
    
    NONE("None"),
    HILLDWARF("Hill Dwarf"),
    MOUNTAINDWARF("Moutain Dwarf"),
    HIGHELF("High Elf"),
    WOODELF("Wood Elf"),
    DARKELF("Dark Elf (Drow)"),
    LOGHTFOOTHALFLING("Lightfoot Halfling"),
    STOUTHALFLING("Stout Halfling"),
    FORESTGNOME("Forest Gnome"),
    ROCKGNOME("Rock Gnome");

    private final String mName;

    Subraces(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }
}
