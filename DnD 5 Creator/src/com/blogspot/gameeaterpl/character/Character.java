/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.Abilities;
import java.util.HashMap;

/**
 *
 * @author sakurazuka
 */
public class Character {

    private String mCharacterName;
    private String mPlayerName;
    private String mAlignment;

    private HashMap<Abilities, Ability> mAbilities;

    public Character() {
        mAbilities = new HashMap<>();
        mAbilities.put(Abilities.STRENGTH, new Ability(Abilities.STRENGTH.toString()));
        mAbilities.put(Abilities.DEXTERITY, new Ability(Abilities.DEXTERITY.toString()));
        mAbilities.put(Abilities.CONSTITUTION, new Ability(Abilities.CONSTITUTION.toString()));
        mAbilities.put(Abilities.INTELIGENCE, new Ability(Abilities.INTELIGENCE.toString()));
        mAbilities.put(Abilities.WISDOM, new Ability(Abilities.WISDOM.toString()));
        mAbilities.put(Abilities.CHARISMA, new Ability(Abilities.CHARISMA.toString()));
    }

    public void printDataTest() {
        System.out.println("Imię postaci: " + mCharacterName);
        System.out.println("Imię gracza: " + mPlayerName);
        System.out.println("Charakter: " + mAlignment);
        
        System.out.println("STR: " + mAbilities.get(Abilities.STRENGTH).getTestString());
        System.out.println("CON: " + mAbilities.get(Abilities.CONSTITUTION).getTestString());
        System.out.println("DEX: " + mAbilities.get(Abilities.DEXTERITY).getTestString());
        System.out.println("INT: " + mAbilities.get(Abilities.INTELIGENCE).getTestString());
        System.out.println("WIS: " + mAbilities.get(Abilities.WISDOM).getTestString());
        System.out.println("CHA: " + mAbilities.get(Abilities.CHARISMA).getTestString());
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
        mAbilities.get(Abilities.STRENGTH).setmScore(pmValue);
    }

    public void setConstitution(Integer pmValue) {
        mAbilities.get(Abilities.CONSTITUTION).setmScore(pmValue);
    }

    public void setDexterity(Integer pmValue) {
        mAbilities.get(Abilities.DEXTERITY).setmScore(pmValue);
    }

    public void setInteligence(Integer pmValue) {
        mAbilities.get(Abilities.INTELIGENCE).setmScore(pmValue);
    }

    public void setWisdom(Integer pmValue) {
        mAbilities.get(Abilities.WISDOM).setmScore(pmValue);
    }

    public void setCharisma(Integer pmValue) {
        mAbilities.get(Abilities.CHARISMA).setmScore(pmValue);
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
