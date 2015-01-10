/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.enums.ArmorTypes;
import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.enums.Dice;
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
public class DwarfRace extends CharacterRace {

    private static final String DWARVEN_RESILIENCE = "Dwarven Resilience";
    private static final String DWARWEN_RESILIENCE_DESCRIPTION = "You have advantage on saving throws against poison.";

    private static final String STONECUNNING = "Stonecunning";
    private static final String STONECUNNING_DESCRIPTION = "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.";

    public DwarfRace(Subraces pmSubrace) {

        super(Races.DWARF, pmSubrace, Sizes.MEDIUM, 25, 60);

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

        ArrayList<Languages> lvLanguages;
        if (this.mLanguages.containsKey(1)) {
            lvLanguages = this.mLanguages.get(1);
        } else {
            lvLanguages = new ArrayList<>();
        }
        lvLanguages.add(Languages.DWARVISH);
        lvLanguages.add(Languages.COMMON);

        mLanguages.put(1, lvLanguages);

        switch (pmSubrace) {
            case MOUNTAINDWARF:
                lvAbilities = this.mAbilities.get(1);
                lvAbilities.add(new AbilityIncrease(Abilities.STRENGTH, 2));

                mAbilities.put(1, lvAbilities);

                ArrayList<ArmorTypes> lvArmors;
                if (this.mArmorTypes.containsKey(1)) {
                    lvArmors = this.mArmorTypes.get(1);
                } else {
                    lvArmors = new ArrayList<>();
                }
                lvArmors.add(ArmorTypes.LIGHT);
                lvArmors.add(ArmorTypes.MEDIUM);
                this.mArmorTypes.put(1, lvArmors);

                break;
            case HILLDWARF:

                lvAbilities = this.mAbilities.get(1);
                lvAbilities.add(new AbilityIncrease(Abilities.WISDOM, 1));

                mAbilities.put(1, lvAbilities);

                ArrayList<DamageFormula> lvHitPoints;

                for (int i = 1; i <= 20; i++) {
                    if (this.mHitPoints.containsKey(i)) {
                        lvHitPoints = this.mHitPoints.get(i);
                    } else {
                        lvHitPoints = new ArrayList<>();
                    }
                    lvHitPoints.add(new DamageFormula((Dice) null, 1, null));
                    this.mHitPoints.put(1, lvHitPoints);
                }

                break;
        }
    }

}
