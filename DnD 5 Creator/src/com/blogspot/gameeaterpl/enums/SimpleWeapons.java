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
public enum SimpleWeapons {
    SHORTBOW("Shortbow");
    
    private final String mName;

    SimpleWeapons(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }
}
