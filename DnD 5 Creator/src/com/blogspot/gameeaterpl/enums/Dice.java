/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.gameeaterpl.enums;

import java.util.Random;

/**
 *
 * @author sakurazuka
 */
public enum Dice {
    K4("k4",4),K6("k6",6),K8("k8", 8),K10("k8", 8),K12("k12", 12),K20("k20",20);
    
    private final Integer mSides;
    private final String mName;
    private static final Random mRand = new Random();
    
    Dice(String pmName,Integer pmSides)
    {
        this.mName = pmName;
        this.mSides = pmSides;
    }
    
    @Override
    public String toString()
    {
        return this.mName;
    }
    
    public Integer roll()
    {
       return mRand.nextInt((mSides-1))+1;
    }
    
    
}
