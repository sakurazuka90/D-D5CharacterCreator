/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.gameeaterpl.enums;

/**
 *
 * @author sakurazuka
 */
public enum ArmorTypes {
    LIGHT("Light Armor"),MEDIUM("Medium Armor"),HEAVY("Heavy Armor");
    
     private final String mName;

    ArmorTypes(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }
}
