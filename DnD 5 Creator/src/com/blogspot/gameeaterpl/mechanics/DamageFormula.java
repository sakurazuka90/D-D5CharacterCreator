/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.mechanics;

import com.blogspot.gameeaterpl.character.Ability;
import com.blogspot.gameeaterpl.enums.Dice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Sakurazuka
 */
public class DamageFormula {

    private HashMap<Dice,Integer> mDice; //kości obrażeń formuły
    private Integer mConstant; //stałe
    private Ability mAbility; // atrybut, jeśli formuła potrzebuje modyfikatora z atrybutu

    public DamageFormula() {
        this.mDice = new HashMap<>();
        this.mConstant = 0;
        this.mAbility = null;
    }

    public DamageFormula(HashMap<Dice,Integer> pmDice, Integer pmConstant, Ability pmAbility) {
        this.mDice = pmDice;
        this.mConstant = pmConstant;
        this.mAbility = pmAbility;
    }
    
    public DamageFormula(Dice pmDice,Integer pmConstant, Ability pmAbility)
    {
        this.mDice = new HashMap<>();
        this.mDice.put(pmDice, 1);
        this.mConstant = pmConstant;
        this.mAbility = pmAbility;
    }
    
    @Override
    public String toString()
    {
        StringBuilder lvBuilder = new StringBuilder();
                
        for(Entry mDiceEntry : mDice.entrySet())
        {
            lvBuilder.append(mDiceEntry.getKey());
            lvBuilder.append(mDiceEntry.getValue());
            lvBuilder.append(" + ");
        }
        
        lvBuilder.append(mConstant + (mAbility != null ? mAbility.getmModifier(): 0));
        
        
        return "";
    }
    
    public void append(Dice pmDice)
    {
        if(this.mDice.containsKey(pmDice))
        {
            this.mDice.put(pmDice,this.mDice.get(pmDice)+1);
        }else{
            this.mDice.put(pmDice, 1);
        }
    }
    
    public void append(Integer pmConstant)
    {
        this.mConstant += pmConstant;
    }

    public void setmDice(HashMap<Dice, Integer> mDice) {
        this.mDice = mDice;
    }

    public void setmConstant(Integer mConstant) {
        this.mConstant = mConstant;
    }

    public void setmAbility(Ability mAbility) {
        this.mAbility = mAbility;
    }

    

}
