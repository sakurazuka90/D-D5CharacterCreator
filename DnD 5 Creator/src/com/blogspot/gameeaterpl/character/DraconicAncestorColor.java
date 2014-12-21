/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character;

import com.blogspot.gameeaterpl.enums.DamageType;

/**
 *
 * @author Sakurazuka
 */
public enum DraconicAncestorColor {

    BLACK("Black", DamageType.ACID),
    BLUE("Blue", DamageType.LIGHTNING),
    BRASS("Brass", DamageType.ACID),
    BRONZE("Bronze", DamageType.LIGHTNING),
    COPPER("Copper", DamageType.ACID),
    GOLD("Gold", DamageType.FIRE),
    GREEN("Green", DamageType.POISON),
    RED("Red", DamageType.FIRE),
    SILVER("Silver", DamageType.COLD),
    WHITE("White", DamageType.COLD);

    private final String mName;
    private final DamageType mType;

    DraconicAncestorColor(String pmName, DamageType pmType) {
        this.mName = pmName;
        this.mType = pmType;
    }

    @Override
    public String toString() {
        return mName;
    }
}
