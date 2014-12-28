/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.Abilities;
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
public class DwarfRace extends CharacterRace {

    private static final String DWARVEN_RESILIENCE = "Dwarven Resilience";
    private static final String DWARWEN_RESILIENCE_DESCRIPTION = "You have advantage on saving throws against poison.";

    private static final String STONECUNNING = "Stonecunning";
    private static final String STONECUNNING_DESCRIPTION = "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.";

    public DwarfRace(Subraces pmSubrace, HashMap<Integer, ArrayList<AutomaterAttack>> pmAttacks, HashMap<Integer, ArrayList<AbilityIncrease>> pmAbilities, HashMap<Integer, ArrayList<Skills>> pmSkills, HashMap<Integer, ArrayList<SpecialAbility>> pmSpecialAbilities, HashMap<Integer, ArrayList<DamageType>> pmResistances, HashMap<Integer, ArrayList<CharacterTextFeature>> pmFeatures, HashMap<Integer, ArrayList<Languages>> pmLanguages, HashMap<Integer, ArrayList<MartialWeapons>> pmMartialWeapons) {

        super(Races.DWARF, pmSubrace, Sizes.MEDIUM, 25, 60, pmAttacks, pmAbilities, pmSkills, pmSpecialAbilities, pmResistances, pmFeatures, pmLanguages, pmMartialWeapons);

        ArrayList<DamageType> lvResistances;
        if (this.mResistances.containsKey(1)) {
            lvResistances = this.mResistances.get(1);
        } else {
            lvResistances = new ArrayList<>();
        }
        lvResistances.add(DamageType.POISON);
        this.mResistances.put(1, lvResistances);

        ArrayList<AbilityIncrease> lvAbilities;
        if (this.mAbilities.containsKey(1)) {
            lvAbilities = this.mAbilities.get(1);
        } else {
            lvAbilities = new ArrayList<>();
        }
        lvAbilities.add(new AbilityIncrease(Abilities.CONSTITUTION, 2));

        mAbilities.put(1, lvAbilities);

        CharacterTextFeature lvDvarwenResilience = new CharacterTextFeature(DWARVEN_RESILIENCE, DWARWEN_RESILIENCE_DESCRIPTION);
        CharacterTextFeature lvStonecunning = new CharacterTextFeature(STONECUNNING, STONECUNNING_DESCRIPTION);

        ArrayList<CharacterTextFeature> lvTextFeatures;
        if (this.mFeatures.containsKey(1)) {
            lvTextFeatures = this.mFeatures.get(1);
        } else {
            lvTextFeatures = new ArrayList<>();
        }

        lvTextFeatures.add(lvDvarwenResilience);
        lvTextFeatures.add(lvStonecunning);

        mFeatures.put(1, lvTextFeatures);

        ArrayList<MartialWeapons> lvMartialWeapons;
        if (this.mMartialWeapons.containsKey(1)) {
            lvMartialWeapons = this.mMartialWeapons.get(1);
        } else {
            lvMartialWeapons = new ArrayList<>();
        }
        
        lvMartialWeapons.add(MartialWeapons.HANDAXE);
        lvMartialWeapons.add(MartialWeapons.BATTLEAXE);
        lvMartialWeapons.add(MartialWeapons.THROWING_HAMMER);
        lvMartialWeapons.add(MartialWeapons.WARHAMMER);
        
        mMartialWeapons.put(1, lvMartialWeapons);
    }

}
