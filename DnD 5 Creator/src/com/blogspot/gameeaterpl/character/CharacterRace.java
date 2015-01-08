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
import com.blogspot.gameeaterpl.enums.Sizes;
import com.blogspot.gameeaterpl.enums.Skills;
import com.blogspot.gameeaterpl.mechanics.AutomaterAttack;
import com.blogspot.gameeaterpl.mechanics.DamageFormula;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sakurazuka
 */
public class CharacterRace extends CharacterPart {

    protected Races mRace;
    protected Subraces mSubrace;

    protected Sizes mSize;
    protected Integer mSpeed; //in feet

    protected Integer mDarkVision; //in feet

    protected CharacterRace(Races pmRace, Subraces pmSubrace, Sizes pmSize, Integer pmSpeed, Integer pmDarkVision, HashMap<Integer, ArrayList<AutomaterAttack>> pmAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> pmAbilities, HashMap<Integer, ArrayList<Skills>> pmSkills, HashMap<Integer, ArrayList<SpecialAbility>> pmSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> pmResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> pmFeatures, HashMap<Integer, ArrayList<Languages>> pmLanguages, HashMap<Integer,ArrayList<MartialWeapons>> pmMartialWeapons, HashMap<Integer,ArrayList<ArmorTypes>> pmArmorTypes, HashMap<Integer,ArrayList<DamageFormula>> pmHitPoints) {
        
        super(pmAttacks, pmAbilities, pmSkills, pmSpecialAbilities, pmResistances, pmFeatures, pmLanguages, pmMartialWeapons, pmArmorTypes, pmHitPoints);
        this.mRace = pmRace;
        this.mSubrace = pmSubrace;
        this.mSize = pmSize;
        this.mSpeed = pmSpeed;
        this.mDarkVision = pmDarkVision;
        
        
    }
    
    @Override
    public String getTestString()
    {
        StringBuilder lvBuilder = new  StringBuilder();
        lvBuilder.append(this.mRace).append("\n");
        lvBuilder.append(this.mSubrace).append("\n\n");
        lvBuilder.append("Size: ").append(this.mSize).append("\n");
        lvBuilder.append("Speed: ").append(this.mSpeed).append("\n");
        lvBuilder.append("Darkvision: ").append(this.mDarkVision).append("\n");
        lvBuilder.append(super.getTestString());
        return lvBuilder.toString();
    }

}
