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

    private HashMap<AttributesBrevities, Ability> mAbilities;

    public Character() {
        mAbilities = new HashMap<>();
        mAbilities.put(AttributesBrevities.STR, new Ability("Strength"));
        mAbilities.put(AttributesBrevities.DEX, new Ability("Dexterity"));
        mAbilities.put(AttributesBrevities.CON, new Ability("Constitution"));
        mAbilities.put(AttributesBrevities.INT, new Ability("Inteligence"));
        mAbilities.put(AttributesBrevities.WIS, new Ability("Wisdom"));
        mAbilities.put(AttributesBrevities.CHA, new Ability("Charisma"));
    }

    public void printDataTest() {
        System.out.println("Imię postaci: " + mCharacterName);
        System.out.println("Imię gracza: " + mPlayerName);
        System.out.println("Charakter: " + mAlignment);
        
        System.out.println("STR: " + mAbilities.get(AttributesBrevities.STR).getTestString());
        System.out.println("CON: " + mAbilities.get(AttributesBrevities.CON).getTestString());
        System.out.println("DEX: " + mAbilities.get(AttributesBrevities.DEX).getTestString());
        System.out.println("INT: " + mAbilities.get(AttributesBrevities.INT).getTestString());
        System.out.println("WIS: " + mAbilities.get(AttributesBrevities.WIS).getTestString());
        System.out.println("CHA: " + mAbilities.get(AttributesBrevities.CHA).getTestString());
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

    public void setStrength(Integer pmValue) {
        mAbilities.get(AttributesBrevities.STR).setmScore(pmValue);
    }

    public void setConstitution(Integer pmValue) {
        mAbilities.get(AttributesBrevities.CON).setmScore(pmValue);
    }

    public void setDexterity(Integer pmValue) {
        mAbilities.get(AttributesBrevities.DEX).setmScore(pmValue);
    }

    public void setInteligence(Integer pmValue) {
        mAbilities.get(AttributesBrevities.INT).setmScore(pmValue);
    }

    public void setWisdom(Integer pmValue) {
        mAbilities.get(AttributesBrevities.WIS).setmScore(pmValue);
    }

    public void setCharisma(Integer pmValue) {
        mAbilities.get(AttributesBrevities.CHA).setmScore(pmValue);
    }

    public void setAbilities(Integer pmStrVal, Integer pmConVal, Integer pmDexVal, Integer pmIntVal, Integer pmWisVal, Integer pmChaVal) {
        this.setStrength(pmStrVal);
        this.setConstitution(pmConVal);
        this.setDexterity(pmDexVal);
        this.setInteligence(pmIntVal);
        this.setWisdom(pmWisVal);
        this.setCharisma(pmChaVal);
    }

}
