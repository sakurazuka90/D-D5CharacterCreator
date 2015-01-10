/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character.Races;

import com.blogspot.gameeaterpl.character.AbilityIncrease;
import com.blogspot.gameeaterpl.character.CharacterRace;
import com.blogspot.gameeaterpl.character.CharacterTextFeature;
import com.blogspot.gameeaterpl.character.Subraces;
import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.MartialWeapons;
import com.blogspot.gameeaterpl.enums.Races;
import com.blogspot.gameeaterpl.enums.Sizes;
import com.blogspot.gameeaterpl.enums.Skills;
import java.util.ArrayList;

/**
 *
 * @author Sakurazuka
 */
public class ElfRace extends CharacterRace {

    private static final String FEY_ANCESTRY = "Fey Ancestry";
    private static final String FEY_ANCESTRY_DESCRIPTION = "You have advantage on saving throws against being charmed, and magic can’t put you to sleep.";

    private static final String TRANCE = "Trance";
    private static final String TRANCE_DESCRIPTION = "Elves don’t need to sleep. Instead, they meditate deeply, remaining sem iconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the sam e benefit that a human does from 8 hours of sleep. ";

    private static final String MASK_OF_THE__WILD = "Mask of the Wild";
    private static final String MASK_OF_THE__WILD_DESCRIPTION = "You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.";

    
    public ElfRace(Subraces pmSubrace) {
        super(Races.ELF, pmSubrace, Sizes.MEDIUM, 30, 60);

        ArrayList<AbilityIncrease> lvAbilities = new ArrayList<>();

        lvAbilities.add(new AbilityIncrease(Abilities.DEXTERITY, 2));

        mAbilities.put(1, lvAbilities);

        ArrayList<Skills> lvSkills = new ArrayList<>();
        lvSkills.add(Skills.PERCEPTION);

        this.mSkills.put(1, lvSkills);

        CharacterTextFeature lvFeyAncestry = new CharacterTextFeature(FEY_ANCESTRY, FEY_ANCESTRY_DESCRIPTION);
        CharacterTextFeature lvTrance = new CharacterTextFeature(TRANCE, TRANCE_DESCRIPTION);

        ArrayList<CharacterTextFeature> lvFeatures = new ArrayList<>();
        lvFeatures.add(lvTrance);
        lvFeatures.add(lvFeyAncestry);

        this.mFeatures.put(1, lvFeatures);

        ArrayList<Languages> lvLanguages = new ArrayList<>();

        lvLanguages.add(Languages.ELVISH);
        lvLanguages.add(Languages.COMMON);

        mLanguages.put(1, lvLanguages);

        ArrayList<MartialWeapons> lvMartialWeapons;
        switch (pmSubrace) {
            case HIGHELF:
                lvAbilities = this.mAbilities.get(1);
                lvAbilities.add(new AbilityIncrease(Abilities.INTELIGENCE, 1));

                mAbilities.put(1, lvAbilities);

                lvMartialWeapons = new ArrayList<>();

                lvMartialWeapons.add(MartialWeapons.SHORTBOW);
                lvMartialWeapons.add(MartialWeapons.SHORTSWORD);
                lvMartialWeapons.add(MartialWeapons.LONGBOW);
                lvMartialWeapons.add(MartialWeapons.LONGSWORD);

                mMartialWeapons.put(1, lvMartialWeapons);
                break;
            case WOODELF:
                lvAbilities = this.mAbilities.get(1);
                lvAbilities.add(new AbilityIncrease(Abilities.WISDOM, 1));

                mAbilities.put(1, lvAbilities);
                
                lvMartialWeapons = new ArrayList<>();

                lvMartialWeapons.add(MartialWeapons.SHORTBOW);
                lvMartialWeapons.add(MartialWeapons.SHORTSWORD);
                lvMartialWeapons.add(MartialWeapons.LONGBOW);
                lvMartialWeapons.add(MartialWeapons.LONGSWORD);

                mMartialWeapons.put(1, lvMartialWeapons);
                
                mSpeed += 5;
                
                lvFeatures = mFeatures.get(1);
                lvFeatures.add(new CharacterTextFeature(MASK_OF_THE__WILD, MASK_OF_THE__WILD_DESCRIPTION));
                mFeatures.put(1, lvFeatures);
                
                break;
            case DARKELF:
                lvAbilities = this.mAbilities.get(1);
                lvAbilities.add(new AbilityIncrease(Abilities.CHARISMA, 1));

                mAbilities.put(1, lvAbilities);
                
                mDarkVision += 60;
                
                //TODO: Drow magic!!!! Drow weapon training!!!!
                
                break;
        }
    }
}
