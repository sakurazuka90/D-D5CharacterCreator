/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character.Races;

import com.blogspot.gameeaterpl.character.AbilityIncrease;
import com.blogspot.gameeaterpl.character.CharacterRace;
import com.blogspot.gameeaterpl.character.CharacterTextFeature;
import com.blogspot.gameeaterpl.enums.Races;
import com.blogspot.gameeaterpl.character.Subraces;
import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.enums.ArmorTypes;
import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.enums.Dice;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.MartialWeapons;
import com.blogspot.gameeaterpl.enums.Sizes;
import com.blogspot.gameeaterpl.mechanics.DamageFormula;
import java.util.ArrayList;

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
        lvResistances = new ArrayList<>();

        lvResistances.add(DamageType.POISON);
        this.mResistances.put(1, lvResistances);

        ArrayList<AbilityIncrease> lvAbilities;

        lvAbilities = new ArrayList<>();

        lvAbilities.add(new AbilityIncrease(Abilities.CONSTITUTION, 2));

        mAbilities.put(1, lvAbilities);

        CharacterTextFeature lvDvarwenResilience = new CharacterTextFeature(DWARVEN_RESILIENCE, DWARWEN_RESILIENCE_DESCRIPTION);
        CharacterTextFeature lvStonecunning = new CharacterTextFeature(STONECUNNING, STONECUNNING_DESCRIPTION);

        ArrayList<CharacterTextFeature> lvTextFeatures;

        lvTextFeatures = new ArrayList<>();

        lvTextFeatures.add(lvDvarwenResilience);
        lvTextFeatures.add(lvStonecunning);

        mFeatures.put(1, lvTextFeatures);

        ArrayList<MartialWeapons> lvMartialWeapons;

        lvMartialWeapons = new ArrayList<>();

        lvMartialWeapons.add(MartialWeapons.HANDAXE);
        lvMartialWeapons.add(MartialWeapons.BATTLEAXE);
        lvMartialWeapons.add(MartialWeapons.THROWING_HAMMER);
        lvMartialWeapons.add(MartialWeapons.WARHAMMER);

        mMartialWeapons.put(1, lvMartialWeapons);

        ArrayList<Languages> lvLanguages;

        lvLanguages = new ArrayList<>();

        lvLanguages.add(Languages.DWARVISH);
        lvLanguages.add(Languages.COMMON);

        mLanguages.put(1, lvLanguages);

        switch (pmSubrace) {
            case MOUNTAINDWARF:
                lvAbilities = this.mAbilities.get(1);
                lvAbilities.add(new AbilityIncrease(Abilities.STRENGTH, 2));

                mAbilities.put(1, lvAbilities);

                ArrayList<ArmorTypes> lvArmors;

                lvArmors = new ArrayList<>();

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
