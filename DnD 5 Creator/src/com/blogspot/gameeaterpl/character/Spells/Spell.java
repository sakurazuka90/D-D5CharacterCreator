/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character.Spells;

import com.blogspot.gameeaterpl.enums.Classes;
import java.util.HashMap;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author sakurazuka
 */
public class Spell {

    private final String mName;
    private final String mDescription;
    private final HashMap<Classes, Integer> mLevels;

    public Spell(Element lvSpellElement) {
        NodeList lvNames = lvSpellElement.getElementsByTagName("Name");
        mName = lvNames.item(0).getTextContent();

        NodeList lvDescriptions = lvSpellElement.getElementsByTagName("Description");
        mDescription = lvDescriptions.item(0).getTextContent();

        NodeList lvLevels = lvSpellElement.getElementsByTagName("Level");
        HashMap<Classes, Integer> lvLevelsMap = new HashMap<>();
        for (int i = 0; i < lvLevels.getLength(); i++) {
            Classes lvClass = null;
            Element lvLevel = (Element) lvLevels.item(i);
            switch (lvLevel.getAttribute("Class")) {
                case "Wizard":
                    lvClass = Classes.WIZARD;
                    break;

            }
            lvLevelsMap.put(lvClass, Integer.parseInt(lvLevel.getAttribute("Value")));

        }

        mLevels = lvLevelsMap;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public HashMap<Classes, Integer> getmLevels() {
        return mLevels;
    }
    
    
}
