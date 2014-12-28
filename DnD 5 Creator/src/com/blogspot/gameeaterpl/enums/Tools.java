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
public enum Tools {

    SMITHS_TOOLS("Smith's tools"),
    BREWERS_SUPPLIES("Brewer's supplies"),
    MASONS_TOOLS("Mason's tools");

    private final String mName;

    Tools(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return this.mName;
    }
}
