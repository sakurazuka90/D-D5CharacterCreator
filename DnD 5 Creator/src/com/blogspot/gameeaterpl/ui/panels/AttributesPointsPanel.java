/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.ui.panels;

import com.blogspot.gameeaterpl.character.Character;
import com.blogspot.gameeaterpl.dataWrappers.MutableInteger;

/**
 *
 * @author sakurazuka
 */
public class AttributesPointsPanel extends javax.swing.JPanel implements CharacterCreatorPanel {

    private MutableInteger mPoints;
    private boolean mGlobalPlusButtonStatus = true;

    /**
     * Creates new form AttributesPointsPanel
     */
    public AttributesPointsPanel() {
        mPoints = new MutableInteger(27);
        initComponents();
        this.strRow.setmPointsLeft(mPoints);
        this.strRow.setmPointsLeftField(pointsLeftField);

        this.conRow.setmPointsLeft(mPoints);
        this.conRow.setmPointsLeftField(pointsLeftField);

        this.dexRow.setmPointsLeft(mPoints);
        this.dexRow.setmPointsLeftField(pointsLeftField);

        this.intRow.setmPointsLeft(mPoints);
        this.intRow.setmPointsLeftField(pointsLeftField);

        this.wisRow.setmPointsLeft(mPoints);
        this.wisRow.setmPointsLeftField(pointsLeftField);

        this.chaRow.setmPointsLeft(mPoints);
        this.chaRow.setmPointsLeftField(pointsLeftField);
    }

    /**
     * Blokuje przyciski plusa.
     */
    public void checkPlusButtons() {
        if (this.mPoints.getmValue() == 0) {
            if (mGlobalPlusButtonStatus) {
                this.mGlobalPlusButtonStatus = false;
                this.strRow.disablePlusButton();
                this.conRow.disablePlusButton();
                this.dexRow.disablePlusButton();
                this.intRow.disablePlusButton();
                this.wisRow.disablePlusButton();
                this.chaRow.disablePlusButton();
            }
        } else {
            if (!mGlobalPlusButtonStatus) {
                this.mGlobalPlusButtonStatus = true;
                this.strRow.enablePlusButton();
                this.conRow.enablePlusButton();
                this.dexRow.enablePlusButton();
                this.intRow.enablePlusButton();
                this.wisRow.enablePlusButton();
                this.chaRow.enablePlusButton();
            }
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

        jButton7 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        strRow = new com.blogspot.gameeaterpl.ui.AttributesPointsRow("Strength");
        conRow = new com.blogspot.gameeaterpl.ui.AttributesPointsRow("Constitution");
        dexRow = new com.blogspot.gameeaterpl.ui.AttributesPointsRow("Dexterity");
        intRow = new com.blogspot.gameeaterpl.ui.AttributesPointsRow("Inteligence");
        wisRow = new com.blogspot.gameeaterpl.ui.AttributesPointsRow("Wisdom");
        chaRow = new com.blogspot.gameeaterpl.ui.AttributesPointsRow("Charisma");
        pointsLeftField = new com.blogspot.gameeaterpl.ui.AttributeTextField(mPoints.toString());

        jButton7.setText("+");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField19.setText("0");
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Attributes - allocate points");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel9.setText("Score");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel10.setText("Modifier");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel12.setText("Points left");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dexRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wisRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chaRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(pointsLeftField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pointsLeftField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dexRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wisRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chaRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        this.strRow.reset();
        this.conRow.reset();
        this.dexRow.reset();
        this.intRow.reset();
        this.wisRow.reset();
        this.chaRow.reset();
        this.mPoints.setmValue(27);
        this.pointsLeftField.setText(this.mPoints.toString());
    }//GEN-LAST:event_resetButtonActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.blogspot.gameeaterpl.ui.AttributesPointsRow chaRow;
    private com.blogspot.gameeaterpl.ui.AttributesPointsRow conRow;
    private com.blogspot.gameeaterpl.ui.AttributesPointsRow dexRow;
    private com.blogspot.gameeaterpl.ui.AttributesPointsRow intRow;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField19;
    private com.blogspot.gameeaterpl.ui.AttributeTextField pointsLeftField;
    private javax.swing.JButton resetButton;
    private com.blogspot.gameeaterpl.ui.AttributesPointsRow strRow;
    private com.blogspot.gameeaterpl.ui.AttributesPointsRow wisRow;
    // End of variables declaration//GEN-END:variables

    @Override
    public void fillCharacterObject(Character pmCharacter) {
        pmCharacter.setAbilities(strRow.getmValue(), conRow.getmValue(), dexRow.getmValue(), intRow.getmValue(), wisRow.getmValue(), chaRow.getmValue());
    }
}
