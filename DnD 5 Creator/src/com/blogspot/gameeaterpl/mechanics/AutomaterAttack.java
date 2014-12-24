/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.mechanics;

import com.blogspot.gameeaterpl.character.InventoryItem;
import com.blogspot.gameeaterpl.enums.AttackTemplate;
import com.blogspot.gameeaterpl.enums.DamageType;
import java.util.ArrayList;

/**
 *
 * @author Sakurazuka
 */
public class AutomaterAttack {
    
    private String mName;
    private String mDescriptionFileName;
    
    private DamageType mDamageType;
    private DamageFormula mDamageFormula;
    private AttackTemplate mTemplate;
    
    private InventoryItem mItem;
    private ArrayList<Double> mDimensions;
    
    public AutomaterAttack(String pmName, DamageType pmDmgType, AttackTemplate pmTemplate, ArrayList<Double> pmDimensions)
    {
        this.mName = pmName;
        this.mDamageType = pmDmgType;
        this.mTemplate = pmTemplate;
        this.mDimensions = pmDimensions;
    }
    
    public String toFieldString()
    {
        String lvDimensions = "";
        
        for(int i = 0; i < this.mDimensions.size(); i++)
        {
            lvDimensions+= this.mDimensions.get(i)+" ft. ";
            if(i<this.mDimensions.size()-1)
                lvDimensions += "x ";
        }
        
        return mDamageType.toString() + " " + this.mTemplate.toString() + " (" + lvDimensions + ")";
    }
    
}
