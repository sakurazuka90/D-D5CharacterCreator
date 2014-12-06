/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import java.util.Random;
/**
 *
 * @author sakurazuka
 */
public class Ability {

    private String mName;
    private Integer mScore;
    private Integer mModifier;
    
    public Ability(String pmName, Integer pmScore){
        mName = pmName;
        mScore = pmScore;
        mModifier = calculateModifier(pmScore);
    }
    
    public Ability(String pmName)
    {
        mName = pmName;
        Random lvTempRadnd = new Random();
        mScore = lvTempRadnd.nextInt((18-3)+1)+3; //Nowa liczba całkowita. Z przedziału od 3 do 18.
        mModifier = calculateModifier(mScore);
    }

    /**
     * Liczy modyfikator atrybutu według wzoru (wartosc-10)/2.
     * @param pmScore
     * @return 
     */
    public static Integer calculateModifier(Integer pmScore) {
        Integer lvSimpleScore;
        if (pmScore % 2 == 0) {
            lvSimpleScore = pmScore;
        }else{
            lvSimpleScore = pmScore-1;
        }
        
        return (lvSimpleScore - 10)/2;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Integer getmScore() {
        return mScore;
    }

    public void setmScore(Integer mScore) {
        this.mScore = mScore;
        this.mModifier = calculateModifier(mScore);
    }

    public Integer getmModifier() {
        return mModifier;
    }
    
    public String getTestString()
    {
        return mScore.toString() + " " + mModifier.toString();
    }
    
    
}
