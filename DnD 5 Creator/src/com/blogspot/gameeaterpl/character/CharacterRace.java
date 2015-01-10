/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.Sizes;

/**
 *
 * @author Sakurazuka
 */
public class CharacterRace extends CharacterPart {

    protected Races mRace;
    protected Subraces mSubrace;

    protected Sizes mSize;
    protected Integer mSpeed; //in feet

    protected Integer mDarkVision; //in feet

    protected CharacterRace(Races pmRace, Subraces pmSubrace, Sizes pmSize, Integer pmSpeed, Integer pmDarkVision) {
        
        this.mRace = pmRace;
        this.mSubrace = pmSubrace;
        this.mSize = pmSize;
        this.mSpeed = pmSpeed;
        this.mDarkVision = pmDarkVision;
        
        
    }
    
    @Override
    public String getTestString()
    {
        StringBuilder lvBuilder = new  StringBuilder();
        lvBuilder.append(this.mRace).append("\n");
        lvBuilder.append(this.mSubrace).append("\n\n");
        lvBuilder.append("Size: ").append(this.mSize).append("\n");
        lvBuilder.append("Speed: ").append(this.mSpeed).append("\n");
        lvBuilder.append("Darkvision: ").append(this.mDarkVision).append("\n");
        lvBuilder.append(super.getTestString());
        return lvBuilder.toString();
    }

}
