/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character.Races;

import com.blogspot.gameeaterpl.character.AbilityIncrease;
import com.blogspot.gameeaterpl.character.CharacterRace;
import com.blogspot.gameeaterpl.character.Subraces;
import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.enums.Races;
import com.blogspot.gameeaterpl.enums.Sizes;
import java.util.ArrayList;

/**
 *
 * @author sakurazuka
 */
public class HalflingRace extends CharacterRace {
    
    private static final String LUCKY = "Lucky";
    private static final String LUCKY_DESCRIPTION = "When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.";

   
    public HalflingRace(Subraces pmSubrace) {
        super(Races.HALFLING, pmSubrace, Sizes.SMALL, 25, 0);
        
        ArrayList<AbilityIncrease> lvAbilities = new ArrayList<>();

        lvAbilities.add(new AbilityIncrease(Abilities.DEXTERITY, 2));

        mAbilities.put(1, lvAbilities);
    }
    
}
