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
public enum AttackTemplate {

    CONE("Cone"),
    LINE("Line");

    private final String mName;

    AttackTemplate(String pmName) {
        this.mName = pmName;
    }
    
    @Override
    public String toString()
    {
        return mName;
    }
}
