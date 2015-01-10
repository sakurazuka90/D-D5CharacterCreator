/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.mechanics.AutomaterAttack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Klasa służy do przekazywania danych pochodzących z paneli wyboru użytkownika
 * do obiektów podklas CharacterPart. Wykorzystywana do ograniczenia ilości
 * parametrów w konstruktorach.
 *
 * @author Sakurazuka
 */
public class CharacterChoiceContainer extends CharacterPart {

    public void fillCharacterPart(CharacterPart pmPart) {
        fillHashMap(pmPart.getmAttacks(), this.mAttacks);
        fillHashMap(pmPart.getmAbilities(), this.mAbilities);
        fillHashMap(pmPart.getmSkills(), this.mSkills);
        fillHashMap(pmPart.getmSpecialAbilities(), this.mSpecialAbilities);
        fillHashMap(pmPart.getmResistances(), this.mResistances);
        fillHashMap(pmPart.getmFeatures(), this.mFeatures);
        fillHashMap(pmPart.getmLanguages(), this.mLanguages);
        fillHashMap(pmPart.getmTools(), this.mTools);
        fillHashMap(pmPart.getmLanguages(), this.mLanguages);
        fillHashMap(pmPart.getmMartialWeapons(), this.mMartialWeapons);
        fillHashMap(pmPart.getmArmorTypes(), this.mArmorTypes);
        fillHashMap(pmPart.getmHitPoints(), this.mHitPoints);
    }

    /**
     * Metoda generyczna do uzupełniania HashMap przekazanego CharacterPartu
     * @param <T>
     * @param pmPartMap
     * @param pmContainerMap 
     */
    private static <T> void fillHashMap(HashMap<Integer, ArrayList<T>> pmPartMap, HashMap<Integer, ArrayList<T>> pmContainerMap) {
        for (Entry<Integer, ArrayList<T>> lvMapEntry : pmContainerMap.entrySet()) {
            Integer lvLevel = lvMapEntry.getKey();
            ArrayList<T> lvValues = lvMapEntry.getValue();
            ArrayList<T> lvPartValues;
            if (pmPartMap.containsKey(lvLevel)) {
                lvPartValues = pmPartMap.get(lvLevel);
            } else {
                lvPartValues = new ArrayList<>();
            }
            lvPartValues.addAll(lvValues);
            pmPartMap.put(lvLevel, lvPartValues);

        }
    }
}
