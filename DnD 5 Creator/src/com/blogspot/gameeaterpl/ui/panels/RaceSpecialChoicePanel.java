/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.blogspot.gameeaterpl.ui.panels;

import com.blogspot.gameeaterpl.character.Character;
import com.blogspot.gameeaterpl.character.Races;
import java.awt.CardLayout;

/**
 *
 * @author sakurazuka
 */
public class RaceSpecialChoicePanel extends javax.swing.JPanel implements CharacterCreatorPanel{

    /**
     * Creates new form RaceSpecialChoicePanel
     */
    public RaceSpecialChoicePanel() {
        initComponents();
    }
    
    public void switchCardByRace(Races pmRace)
    {
        CardLayout lvLayout = (CardLayout) this.getLayout();
        switch(pmRace)
        {
            case HUMAN:
                lvLayout.show(this, "card2");
                break;
            case DRAGONBORN:
                lvLayout.show(this, "card4");
                break;
            default:
                lvLayout.show(this, "card3");
                break;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        humanOptionalRaceChoicePanel1 = new com.blogspot.gameeaterpl.ui.panels.HumanOptionalRaceChoicePanel();
        dragonbornOptionalRaceChoicePanel1 = new com.blogspot.gameeaterpl.ui.panels.DragonbornOptionalRaceChoicePanel();

        setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        add(jPanel1, "card3");
        add(humanOptionalRaceChoicePanel1, "card2");
        add(dragonbornOptionalRaceChoicePanel1, "card4");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.blogspot.gameeaterpl.ui.panels.DragonbornOptionalRaceChoicePanel dragonbornOptionalRaceChoicePanel1;
    private com.blogspot.gameeaterpl.ui.panels.HumanOptionalRaceChoicePanel humanOptionalRaceChoicePanel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void fillCharacterObject(Character pmCharacter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
