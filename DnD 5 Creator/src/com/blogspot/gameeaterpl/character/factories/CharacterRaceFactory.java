/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character.factories;

import com.blogspot.gameeaterpl.character.AbilityIncrease;
import com.blogspot.gameeaterpl.character.CharacterRace;
import com.blogspot.gameeaterpl.character.CharacterTextFeature;
import com.blogspot.gameeaterpl.character.DwarfRace;
import com.blogspot.gameeaterpl.character.Races;
import com.blogspot.gameeaterpl.character.SpecialAbility;
import com.blogspot.gameeaterpl.character.Subraces;
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
public class CharacterRaceFactory {

    public static CharacterRace buildCharacterRace(Races pmRace, Subraces pmSubrace, HashMap<Integer, ArrayList<AutomaterAttack>> pmAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> pmAbilities, HashMap<Integer, ArrayList<Skills>> pmSkills, HashMap<Integer, ArrayList<SpecialAbility>> pmSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> pmResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> pmFeatures, HashMap<Integer, ArrayList<Languages>> pmLanguages, HashMap<Integer, ArrayList<MartialWeapons>> pmMartialWeapons) {
        CharacterRace lvRace = null;
        switch (pmRace) {
            case DWARF:
                lvRace = new DwarfRace(pmSubrace, pmAttacks, pmAbilities, pmSkills, pmSpecialAbilities, pmResistances, pmFeatures, pmLanguages, pmMartialWeapons);
                break;
        }

        return lvRace;
    }
}
