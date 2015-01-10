/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.gameeaterpl.ui.panels;

import com.blogspot.gameeaterpl.character.Character;
import com.blogspot.gameeaterpl.character.CharacterChoiceContainer;
import com.blogspot.gameeaterpl.character.Races;
import com.blogspot.gameeaterpl.character.Subraces;

/**
 *
 * @author sakurazuka
 */
public interface RaceSpecialChoicePanelInterface {
    public void addRace(Character pmCharacter, Races pmRace, Subraces pmSubrace);   
}
