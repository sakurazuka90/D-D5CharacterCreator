/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character.factories;

import com.blogspot.gameeaterpl.character.CharacterRace;
import com.blogspot.gameeaterpl.character.Races.DwarfRace;
import com.blogspot.gameeaterpl.character.Races.ElfRace;
import com.blogspot.gameeaterpl.enums.Races;
import com.blogspot.gameeaterpl.character.Subraces;

/**
 *
 * @author Sakurazuka
 */
public class CharacterRaceFactory {

    public static CharacterRace buildCharacterRace(Races pmRace, Subraces pmSubrace) {
        CharacterRace lvRace = null;
        switch (pmRace) {
            case DWARF:
                lvRace = new DwarfRace(pmSubrace);
                break;
            case ELF:
                lvRace = new ElfRace(pmSubrace);
                break;
        }

        return lvRace;
    }
}
