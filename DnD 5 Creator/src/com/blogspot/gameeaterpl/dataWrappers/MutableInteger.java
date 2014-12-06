/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.dataWrappers;

/**
 * Klasa opakowująca Integer, do przekazywania przez referencję
 * @author sakurazuka
 */
public class MutableInteger {
    
    private Integer mValue;

    public MutableInteger() {
        mValue = 0;
    }
    
    public MutableInteger(Integer pmValue){
        mValue = pmValue;
    }
    
    /**
     * Zwiększa wartość o podaną liczbę.
     * Javo, javo, czemu nie masz przeciążania operatorów?
     * @param pmValue 
     */
    public void Increase(Integer pmValue)
    {
        this.mValue += pmValue;
    }
    
    /**
     * Zmniejsza wartość o podaną liczbę.
     * Javo, javo, czemu nie masz przeciążania operatorów?
     * @param pmValue 
     */
    public void Decrease(Integer pmValue)
    {
        this.mValue -= pmValue;
    }
    
    @Override
    public String toString()
    {
        return this.mValue.toString();
    }

    public Integer getmValue() {
        return mValue;
    }

    public void setmValue(Integer mValue) {
        this.mValue = mValue;
    }
    
    
    
    
}
