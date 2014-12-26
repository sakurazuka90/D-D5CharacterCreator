/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.Abilities;

/**
 *
 * @author Sakurazuka
 */
public class AbilityIncrease {
    
    private final Abilities mAbility;
    private final Integer mValue;
    
    public AbilityIncrease(Abilities pmAbility, Integer pmValue)
    {
        this.mAbility = pmAbility;
        this.mValue = pmValue;
    }

    public Abilities getmAbility() {
        return mAbility;
    }

    public Integer getmValue() {
        return mValue;
    }
    
    
}
