/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.ui.panels.windows;

import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.utils.FileUtils;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Sakurazuka
 */
public class AbillitiesSelectionWindow extends javax.swing.JFrame {

    private final Integer mMaxSelected;
    private final Integer mMinSelected;
    private final Integer mExatcSelected;
    private final AbilitiesSelectionWindowOpener mOpener;
    private HashMap<Abilities, String> mAbilitiesDescriptions;

    /**
     *
     */
    public AbillitiesSelectionWindow() {
        this.mOpener = null;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        initDescriptions();

        this.mMaxSelected = abilitiesList.getModel().getSize();
        this.mMinSelected = 0;
        mExatcSelected = null;

        setAcceptButtonEnabled();
        setLabelText();
        setDescriptions();
    }

    /**
     * Creates new form AbillitiesSelectionWindow
     *
     * @param pmMaxSelected
     * @param pmMinSelected
     * @param pmOpener
     */
    public AbillitiesSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbilitiesSelectionWindowOpener pmOpener) {

        this.mOpener = pmOpener;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        initDescriptions();

        if (pmMaxSelected != null) {
            this.mMaxSelected = pmMaxSelected;
        } else {
            this.mMaxSelected = abilitiesList.getModel().getSize();
        }

        if (pmMinSelected != null) {
            this.mMinSelected = pmMinSelected;
        } else {
            this.mMinSelected = 0;
        }

        if (Objects.equals(mMinSelected, mMaxSelected)) {
            mExatcSelected = mMinSelected;
            if (mExatcSelected == 1) {
                abilitiesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } else {
            mExatcSelected = null;
        }

        setAcceptButtonEnabled();
        setLabelText();
        setDescriptions();
    }

    private void setAcceptButtonEnabled() {
        if (mExatcSelected != null) {
            if (abilitiesList.getSelectedValuesList().size() != mExatcSelected) {
                acceptButton.setEnabled(false);
            } else {
                acceptButton.setEnabled(true);
            }
        } else {
            if (abilitiesList.getSelectedValuesList().size() >= mMinSelected && abilitiesList.getSelectedValuesList().size() <= mMaxSelected) {
                acceptButton.setEnabled(true);
            } else {
                acceptButton.setEnabled(false);
            }
        }
    }

    private void setLabelText() {

        StringBuilder lvBuilder = new StringBuilder("Select ");

        if (mExatcSelected != null) {
            lvBuilder.append(mExatcSelected);
        } else {
            lvBuilder.append(mMinSelected).append(" to ").append(mMaxSelected);
        }
        lvBuilder.append(" Abilities.");
        label.setText(lvBuilder.toString());
    }

    private void initDescriptions() {
        mAbilitiesDescriptions = new HashMap<>();

        try {
            mAbilitiesDescriptions.put(Abilities.STRENGTH, FileUtils.readFile(this.getClass().getResource(FileUtils.DESCRIPTION_URL + "StrengthAbilityDescription.txt"), StandardCharsets.UTF_8));
            mAbilitiesDescriptions.put(Abilities.CONSTITUTION, FileUtils.readFile(this.getClass().getResource(FileUtils.DESCRIPTION_URL + "ConstitutionAbilityDescription.txt"), StandardCharsets.UTF_8));
            mAbilitiesDescriptions.put(Abilities.DEXTERITY, FileUtils.readFile(this.getClass().getResource(FileUtils.DESCRIPTION_URL + "DexterityAbilityDescription.txt"), StandardCharsets.UTF_8));
            mAbilitiesDescriptions.put(Abilities.INTELIGENCE, FileUtils.readFile(this.getClass().getResource(FileUtils.DESCRIPTION_URL + "InteligenceAbilityDescription.txt"), StandardCharsets.UTF_8));
            mAbilitiesDescriptions.put(Abilities.WISDOM, FileUtils.readFile(this.getClass().getResource(FileUtils.DESCRIPTION_URL + "WisdomAbilityDescription.txt"), StandardCharsets.UTF_8));
            mAbilitiesDescriptions.put(Abilities.CHARISMA, FileUtils.readFile(this.getClass().getResource(FileUtils.DESCRIPTION_URL + "CharismaAbilityDescription.txt"), StandardCharsets.UTF_8));
        } catch (IOException ex) {
            Logger.getLogger(AbillitiesSelectionWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(AbillitiesSelectionWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setDescriptions() {
        List<Abilities> lvSelected = abilitiesList.getSelectedValuesList();
        StringBuilder lvBuilder = new StringBuilder("");

        for (int i = 0; i < lvSelected.size(); i++) {
            lvBuilder.append(mAbilitiesDescriptions.get(lvSelected.get(i)));

            if (i < lvSelected.size() - 1) {
                lvBuilder.append("\n\n\n\n");
            }
        }

        abilitiesDescription.setText(lvBuilder.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        abilitiesList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        abilitiesDescription = new javax.swing.JTextArea();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label.setText("Choose Abilities");

        abilitiesList.setModel(new javax.swing.AbstractListModel() {
            Abilities[] abilities = {Abilities.STRENGTH,Abilities.CONSTITUTION,Abilities.DEXTERITY,Abilities.INTELIGENCE,Abilities.WISDOM,Abilities.CHARISMA};
            public int getSize() { return abilities.length; }
            public Object getElementAt(int i) { return abilities[i]; }
        });
        abilitiesList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                abilitiesListPropertyChange(evt);
            }
        });
        abilitiesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                abilitiesListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(abilitiesList);

        abilitiesDescription.setColumns(20);
        abilitiesDescription.setRows(5);
        jScrollPane2.setViewportView(abilitiesDescription);
        abilitiesDescription.setEditable(false);

        acceptButton.setText("OK");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acceptButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(cancelButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abilitiesListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_abilitiesListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_abilitiesListPropertyChange

    private void abilitiesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_abilitiesListValueChanged
        setAcceptButtonEnabled();
        setDescriptions();
    }//GEN-LAST:event_abilitiesListValueChanged

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        this.mOpener.setAbilitiesFields(abilitiesList.getSelectedValuesList());
        this.dispose();
    }//GEN-LAST:event_acceptButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AbillitiesSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbillitiesSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbillitiesSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbillitiesSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbillitiesSelectionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea abilitiesDescription;
    private javax.swing.JList abilitiesList;
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
