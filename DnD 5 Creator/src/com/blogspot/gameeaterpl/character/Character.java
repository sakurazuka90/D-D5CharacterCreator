/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import java.util.HashMap;
/**
 *
 * @author sakurazuka
 */
public class Character {
    
    private String mCharacterName;
    private String mPlayerName;
    private String mAlignment;
    
    private HashMap<String,Ability> mAbilities;
    
    public Character(){
        mAbilities = new HashMap<>();
        mAbilities.put("STR", new Ability("Strength"));
        mAbilities.put("DEX", new Ability("Dexterity"));
        mAbilities.put("CON", new Ability("Constitution"));
        mAbilities.put("INT", new Ability("Inteligence"));
        mAbilities.put("WIS", new Ability("Wisdom"));
        mAbilities.put("CHA", new Ability("Charisma"));
    }
    
    public void printDataTest()
    {
        System.out.println("Imię postaci: "+mCharacterName);
        System.out.println("Imię gracza: "+mPlayerName);
        System.out.println("Charakter: "+mAlignment);
    }

    public String getmCharacterName() {
        return mCharacterName;
    }

    public void setmCharacterName(String mCharacterName) {
        this.mCharacterName = mCharacterName;
    }

    public String getmPlayerName() {
        return mPlayerName;
    }

    public void setmPlayerName(String mPlayerName) {
        this.mPlayerName = mPlayerName;
    }

    public String getmAlignment() {
        return mAlignment;
    }

    public void setmAlignment(String mAlignment) {
        this.mAlignment = mAlignment;
    }
    
    
    
    
}
