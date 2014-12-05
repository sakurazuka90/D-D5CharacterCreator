/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

/**
 *
 * @author sakurazuka
 */
public enum Alignments {

    LAWFULL_GOOD("Lawful Good"),
    NEUTRAL_GOOD("Neutral Good"),
    CHAOTIC_GOOD("Chaotic Good"),
    LAWFUL_NEUTRAL("Lawful Neutral"),
    NEUTRAL("Neutral"),
    CHAOTIC_NEUTRAL("Chaotic Neutral"),
    LAWFUL_EVIL("Lawful Evil"),
    NEUTRAL_EVIL("Neutral Evil"),
    CHAOTIC_EVIL("Chaotic EVIL");

    private final String mName;

    Alignments(String pmName) {
        this.mName = pmName;
    }

    @Override
    public String toString() {
        return mName;
    }
}
