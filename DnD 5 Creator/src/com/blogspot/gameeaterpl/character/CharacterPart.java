/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.ArmorTypes;
import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.MartialWeapons;
import com.blogspot.gameeaterpl.enums.Skills;
import com.blogspot.gameeaterpl.enums.Tools;
import com.blogspot.gameeaterpl.mechanics.AutomaterAttack;
import com.blogspot.gameeaterpl.mechanics.DamageFormula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

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
    protected HashMap<Integer,ArrayList<Tools>> mTools;
    protected HashMap<Integer,ArrayList<MartialWeapons>> mMartialWeapons;
    protected HashMap<Integer,ArrayList<ArmorTypes>> mArmorTypes;
    protected HashMap<Integer,ArrayList<DamageFormula>> mHitPoints;

    protected CharacterPart()
    {
        initializeMaps();
    }
    
    protected CharacterPart(HashMap<Integer, ArrayList<AutomaterAttack>> pmAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> pmAbilities, HashMap<Integer, ArrayList<Skills>> pmSkills, HashMap<Integer, ArrayList<SpecialAbility>> pmSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> pmResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> pmFeatures, HashMap<Integer, ArrayList<Languages>> pmLanguages, HashMap<Integer,ArrayList<MartialWeapons>> pmMartialWeapons, HashMap<Integer,ArrayList<ArmorTypes>> pmArmorTypes, HashMap<Integer,ArrayList<DamageFormula>> pmHitPoints) {
        
        initializeMaps();
        
        this.mAttacks = pmAttacks;
        this.mAbilities = pmAbilities;
        this.mSkills = pmSkills;
        this.mSpecialAbilities = pmSpecialAbilities;
        this.mResistances = pmResistances;
        this.mFeatures = pmFeatures;
        this.mLanguages = pmLanguages;
        this.mMartialWeapons = pmMartialWeapons;
        this.mArmorTypes = pmArmorTypes;
        this.mHitPoints = pmHitPoints;
    }
    
    protected String getTestString()
    {
        StringBuilder lvBuilder = new StringBuilder();
        
        lvBuilder.append("Tools: \n");
        for(Entry lvEntry : mTools.entrySet())
        {
            lvBuilder.append(lvEntry.getKey()).append(":");
            
            for(Tools lvTool : (ArrayList<Tools>)lvEntry.getValue())
            {
                lvBuilder.append(lvTool.toString()).append("\n");
            }
        }
        return lvBuilder.toString();
    }
    
    private void initializeMaps()
    {
        this.mAttacks = new HashMap<>();
        this.mAbilities = new HashMap<>();
        this.mSkills = new HashMap<>();
        this.mSpecialAbilities = new HashMap<>();
        this.mResistances = new HashMap<>();
        this.mFeatures = new HashMap<>();
        this.mLanguages = new HashMap<>();
        this.mTools = new HashMap<>();
        this.mMartialWeapons = new HashMap<>();
        this.mArmorTypes = new HashMap<>();
        this.mHitPoints = new HashMap<>();
    }

    public void setmAttacks(HashMap<Integer, ArrayList<AutomaterAttack>> mAttacks) {
        this.mAttacks = mAttacks;
    }

    public void setmAbilities(HashMap<Integer, ArrayList<AbilityIncrease>> mAbilities) {
        this.mAbilities = mAbilities;
    }

    public void setmSkills(HashMap<Integer, ArrayList<Skills>> mSkills) {
        this.mSkills = mSkills;
    }

    public void setmSpecialAbilities(HashMap<Integer, ArrayList<SpecialAbility>> mSpecialAbilities) {
        this.mSpecialAbilities = mSpecialAbilities;
    }

    public void setmResistances(HashMap<Integer, ArrayList<DamageType>> mResistances) {
        this.mResistances = mResistances;
    }

    public void setmFeatures(HashMap<Integer, ArrayList<CharacterTextFeature>> mFeatures) {
        this.mFeatures = mFeatures;
    }

    public void setmLanguages(HashMap<Integer, ArrayList<Languages>> mLanguages) {
        this.mLanguages = mLanguages;
    }

    public void setmMartialWeapons(HashMap<Integer, ArrayList<MartialWeapons>> mMartialWeapons) {
        this.mMartialWeapons = mMartialWeapons;
    }

    public void setmArmorTypes(HashMap<Integer, ArrayList<ArmorTypes>> mArmorTypes) {
        this.mArmorTypes = mArmorTypes;
    }

    public void setmHitPoints(HashMap<Integer, ArrayList<DamageFormula>> mHitPoints) {
        this.mHitPoints = mHitPoints;
    }

    public HashMap<Integer, ArrayList<AutomaterAttack>> getmAttacks() {
        return mAttacks;
    }

    public HashMap<Integer, ArrayList<AbilityIncrease>> getmAbilities() {
        return mAbilities;
    }

    public HashMap<Integer, ArrayList<Skills>> getmSkills() {
        return mSkills;
    }

    public HashMap<Integer, ArrayList<SpecialAbility>> getmSpecialAbilities() {
        return mSpecialAbilities;
    }

    public HashMap<Integer, ArrayList<DamageType>> getmResistances() {
        return mResistances;
    }

    public HashMap<Integer, ArrayList<CharacterTextFeature>> getmFeatures() {
        return mFeatures;
    }

    public HashMap<Integer, ArrayList<Languages>> getmLanguages() {
        return mLanguages;
    }

    public HashMap<Integer, ArrayList<MartialWeapons>> getmMartialWeapons() {
        return mMartialWeapons;
    }

    public HashMap<Integer, ArrayList<ArmorTypes>> getmArmorTypes() {
        return mArmorTypes;
    }

    public HashMap<Integer, ArrayList<DamageFormula>> getmHitPoints() {
        return mHitPoints;
    }

    public HashMap<Integer, ArrayList<Tools>> getmTools() {
        return mTools;
    }

    public void setmTools(HashMap<Integer, ArrayList<Tools>> mTools) {
        this.mTools = mTools;
    }
    
    
    
    
    
}
