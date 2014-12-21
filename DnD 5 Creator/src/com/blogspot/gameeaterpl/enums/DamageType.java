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
public enum DamageType {
    
    ACID("Acid"),
    LIGHTNING("Lightning"),
    FIRE("Fire"),
    COLD("Cold"),
    POISON("Poison");
    
    private final String mName;
    
    DamageType(String pmName)
{
    this.mName = pmName;
}
}
