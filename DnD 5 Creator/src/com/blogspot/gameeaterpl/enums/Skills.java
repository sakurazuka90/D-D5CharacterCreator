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
public enum Skills {

    ACROBATICS("Acrobatics"),
    ANIMAL_HANDLING("Animal Handling"),
    ARCANA("Arcana"),
    ATHLETICS("Athletics"),
    DECEPTION("Deception"),
    HISTORY("History"),
    INSIGHT("Insight"),
    INTIMIDATION("Intimidation"),
    INVESTIGATION("Investigation"),
    MEDICINE("Medicine"),
    NATURE("Nature"),
    PERCEPTION("Perception"),
    PERFORMANCE("Performance"),
    PERSUASION("Persuasion"),
    RELIGION("Religion"),
    SLEIGHT_OF_HAND("Sleight of Hand"),
    STEALTH("Stealth"),
    SURVIVAL("Survival");

    private final String mName;

    Skills(String pmName) {
        this.mName = pmName;
    }

    @Override
    public String toString() {
        return this.mName;
    }

    public static ArrayList<Skills> toList() {
        ArrayList<Skills> lvList = new ArrayList<>();

        lvList.add(Skills.ACROBATICS);
        lvList.add(Skills.ANIMAL_HANDLING);
        lvList.add(Skills.ARCANA);
        lvList.add(Skills.ATHLETICS);
        lvList.add(Skills.DECEPTION);
        lvList.add(Skills.HISTORY);
        lvList.add(Skills.INSIGHT);
        lvList.add(Skills.INTIMIDATION);
        lvList.add(Skills.INVESTIGATION);
        lvList.add(Skills.MEDICINE);
        lvList.add(Skills.NATURE);
        lvList.add(Skills.PERCEPTION);
        lvList.add(Skills.PERFORMANCE);
        lvList.add(Skills.PERSUASION);
        lvList.add(Skills.RELIGION);
        lvList.add(Skills.SLEIGHT_OF_HAND);
        lvList.add(Skills.STEALTH);
        lvList.add(Skills.SURVIVAL);

        return lvList;
    }
}
