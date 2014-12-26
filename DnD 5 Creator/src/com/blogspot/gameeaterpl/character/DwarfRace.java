/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.Sizes;
import com.blogspot.gameeaterpl.enums.Skills;
import com.blogspot.gameeaterpl.mechanics.AutomaterAttack;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Sakurazuka
 */
public class DwarfRace extends CharacterRace {

    public DwarfRace(Subraces pmSubrace, HashMap<Integer, ArrayList<AutomaterAttack>> pmAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> pmAbilities, HashMap<Integer, ArrayList<Skills>> pmSkills, HashMap<Integer, ArrayList<SpecialAbility>> pmSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> pmResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> pmFeatures, HashMap<Integer, ArrayList<Languages>> pmLanguages) {

        
        super(Races.DWARF, pmSubrace, Sizes.MEDIUM, 25, 60, pmAttacks, pmAbilities, pmSkills, pmSpecialAbilities, pmResistances, pmFeatures, pmLanguages);

        ArrayList<DamageType> lvResistances;
        if(this.mResistances.containsKey(1))
           lvResistances = this.mResistances.get(1);
        else
            lvResistances = new ArrayList<>();
        lvResistances.add(DamageType.POISON);
        this.mResistances.put(1, lvResistances);
        
        ArrayList<AbilityIncrease> lvAbilities;
        if(this.mAbilities.containsKey(1))
           lvAbilities = this.mAbilities.get(1);
        else
            lvAbilities = new ArrayList<>();
        lvAbilities.add(new AbilityIncrease(Abilities.CONSTITUTION, 2));
        
        
        
        
        
        
    }

}
