/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.MartialWeapons;
import com.blogspot.gameeaterpl.enums.Sizes;
import com.blogspot.gameeaterpl.enums.Skills;
import com.blogspot.gameeaterpl.mechanics.AutomaterAttack;
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

    protected CharacterRace(Races pmRace, Subraces pmSubrace, Sizes pmSize, Integer pmSpeed, Integer pmDarkVision, HashMap<Integer, ArrayList<AutomaterAttack>> pmAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> pmAbilities, HashMap<Integer, ArrayList<Skills>> pmSkills, HashMap<Integer, ArrayList<SpecialAbility>> pmSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> pmResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> pmFeatures, HashMap<Integer, ArrayList<Languages>> pmLanguages, HashMap<Integer,ArrayList<MartialWeapons>> pmMartialWeapons) {
        
        super(pmAttacks, pmAbilities, pmSkills, pmSpecialAbilities, pmResistances, pmFeatures, pmLanguages, pmMartialWeapons);
        this.mRace = pmRace;
        this.mSubrace = pmSubrace;
        this.mSize = pmSize;
        this.mSpeed = pmSpeed;
        this.mDarkVision = pmDarkVision;
        
        
    }

}
