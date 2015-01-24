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
public enum MartialWeapons {
    
    BATTLEAXE("Battleaxe"),
    HANDAXE("Handaxe"),
    THROWING_HAMMER("Throwing Hammer"),
    WARHAMMER("Warhammer"),
    LONGSWORD("Longsword"),
    SHORTSWORD("Shortsword"),
    LONGBOW("Longbow"),
    RAPIER("Rapier"),
    HANDCROSSBOW("Hand Crossbow");
    
    private final String mName;

    MartialWeapons(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }
}
