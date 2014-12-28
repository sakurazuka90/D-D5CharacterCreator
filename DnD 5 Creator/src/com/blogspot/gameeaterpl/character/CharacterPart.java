/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.MartialWeapons;
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
    protected HashMap<Integer,ArrayList<MartialWeapons>> mMartialWeapons;

    protected CharacterPart(HashMap<Integer, ArrayList<AutomaterAttack>> pmAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> pmAbilities, HashMap<Integer, ArrayList<Skills>> pmSkills, HashMap<Integer, ArrayList<SpecialAbility>> pmSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> pmResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> pmFeatures, HashMap<Integer, ArrayList<Languages>> pmLanguages, HashMap<Integer,ArrayList<MartialWeapons>> pmMartialWeapons) {
        this.mAttacks = pmAttacks;
        this.mAbilities = pmAbilities;
        this.mSkills = pmSkills;
        this.mSpecialAbilities = pmSpecialAbilities;
        this.mResistances = pmResistances;
        this.mFeatures = pmFeatures;
        this.mLanguages = pmLanguages;
        this.mMartialWeapons = pmMartialWeapons;
    }
    
    
    
}
