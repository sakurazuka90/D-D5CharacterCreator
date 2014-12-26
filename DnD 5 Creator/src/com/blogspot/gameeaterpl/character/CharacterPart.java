/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.Skills;
import com.blogspot.gameeaterpl.mechanics.AutomaterAttack;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sakurazuka
 */
public abstract class CharacterPart {
    
    protected HashMap<Integer,ArrayList<AutomaterAttack>> mAttacks;
    protected HashMap<Integer,ArrayList<AbilityIncrease>> mAbilities;
    protected HashMap<Integer,ArrayList<Skills>> mSkills;
    protected HashMap<Integer,ArrayList<SpecialAbility>> mSpecialAbilities;
    protected HashMap<Integer,ArrayList<DamageType>> mResistances;
    protected HashMap<Integer,ArrayList<CharacterTextFeature>> mFeatures;
    protected HashMap<Integer,ArrayList<Languages>> mLanguages;

    public CharacterPart(HashMap<Integer, ArrayList<AutomaterAttack>> mAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> mAbilities, HashMap<Integer, ArrayList<Skills>> mSkills, HashMap<Integer, ArrayList<SpecialAbility>> mSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> mResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> mFeatures, HashMap<Integer, ArrayList<Languages>> mLanguages) {
        this.mAttacks = mAttacks;
        this.mAbilities = mAbilities;
        this.mSkills = mSkills;
        this.mSpecialAbilities = mSpecialAbilities;
        this.mResistances = mResistances;
        this.mFeatures = mFeatures;
        this.mLanguages = mLanguages;
    }
    
    
    
}
