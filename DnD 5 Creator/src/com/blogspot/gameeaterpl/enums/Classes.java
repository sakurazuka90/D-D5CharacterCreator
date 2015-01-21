/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.gameeaterpl.enums;

/**
 *
 * @author sakurazuka
 */
public enum Classes {
    WIZARD("Wizard");

    private final String mName;

    Classes(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }
}
