/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.enums;

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

    private String mName;

    Languages(String pmName) {
        this.mName = pmName;
    }
}
