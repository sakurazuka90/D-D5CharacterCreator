/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.enums;

import java.util.ArrayList;

/**
 *
 * @author Sakurazuka
 */
public enum Languages {

    COMMON("Common"),
    DWARVISH("Dwarvish"),
    ELVISH("Elvish"),
    GIANT("Giant"),
    GNOMISH("Gnomish"),
    GOBLIN("Goblin"),
    HALFLING("Halfling"),
    ORC("Orc"),
    ABYSSAL("Abyssal"),
    CELESTIAL("Celestial"),
    DRACONIC("Draconic"),
    DEEP_SPEECH("Deep Speech"),
    INFERNAL("Infernal"),
    PRIMORDIAL("Primordial"),
    SYLVAN("Sylvan"),
    UNDERCOMMON("Undercommon");

    private final String mName;

    Languages(String pmName) {
        this.mName = pmName;
    }

    @Override
    public String toString() {
        return this.mName;
    }
    
    public static ArrayList<Languages> toList() {
        ArrayList<Languages> lvList = new ArrayList<>();

        lvList.add(Languages.ABYSSAL);
        lvList.add(Languages.CELESTIAL);
        lvList.add(Languages.COMMON);
        lvList.add(Languages.DEEP_SPEECH);
        lvList.add(Languages.DRACONIC);
        lvList.add(Languages.DWARVISH);
        lvList.add(Languages.ELVISH);
        lvList.add(Languages.GIANT);
        lvList.add(Languages.GNOMISH);
        lvList.add(Languages.GOBLIN);
        lvList.add(Languages.HALFLING);
        lvList.add(Languages.INFERNAL);
        lvList.add(Languages.ORC);
        lvList.add(Languages.PRIMORDIAL);
        lvList.add(Languages.SYLVAN);
        lvList.add(Languages.UNDERCOMMON);

        return lvList;
    }
}
