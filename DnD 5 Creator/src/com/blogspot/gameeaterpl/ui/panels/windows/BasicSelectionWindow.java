/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.ui.panels.windows;

import com.blogspot.gameeaterpl.enums.Abilities;
import com.blogspot.gameeaterpl.enums.Languages;
import com.blogspot.gameeaterpl.enums.Skills;
import com.blogspot.gameeaterpl.enums.Tools;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Sakurazuka
 */
public class BasicSelectionWindow extends javax.swing.JFrame {

    private final Integer mMaxSelected;
    private final Integer mMinSelected;
    private final Integer mExatcSelected;
    private AbilitiesSelectionWindowOpener mAbilitiesSelectionWindowOpener;
    private SkillsSelectionWindowOpener mSkillsSelectionWindowOpener;
    private ToolsSelectionWindowOpener mToolsSelectionWindowOpener;
    private SpellSelectionWindowOpener mSpellsSelectionWindowOpener;
    private LanguagesSelectionWindowOpener mLanguagesSelectionWindowOpener;

    private final AbstractListModel mListModel;
    private HashMap<Object, String> mDescriptions;

    private final String mSingularDesc;
    private final String mPluralDesc;
    //private final DragonbornOptionalRaceChoicePanel mOpener;

    private SelectionWindowMode mMode;

    /**
     * Creates new form BasicSelectionWindow
     */
    public BasicSelectionWindow() {

        this.mListModel = new javax.swing.AbstractListModel() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            @Override
            public int getSize() {
                return strings.length;
            }

            @Override
            public Object getElementAt(int i) {
                return strings[i];
            }
        };

        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        this.mAbilitiesSelectionWindowOpener = null;
        this.mSkillsSelectionWindowOpener = null;
        this.mToolsSelectionWindowOpener = null;
        this.mSpellsSelectionWindowOpener = null;

        this.mMaxSelected = list.getModel().getSize();
        this.mMinSelected = 0;
        this.mExatcSelected = null;

        this.mSingularDesc = "Item";
        this.mPluralDesc = "Items";

        this.mMode = null;

        setAcceptButtonEnabled();
        setLabelText();
        setDescriptions();
    }

    private BasicSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbstractListModel pmListModel, HashMap<Object, String> pmDescriptions, String pmSingularDesc, String pmPluralDesc) {
        this.mListModel = pmListModel;
        this.mDescriptions = pmDescriptions;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        if (pmMaxSelected != null) {
            this.mMaxSelected = pmMaxSelected;
        } else {
            this.mMaxSelected = list.getModel().getSize();
        }

        if (pmMinSelected != null) {
            this.mMinSelected = pmMinSelected;
        } else {
            this.mMinSelected = 0;
        }

        if (Objects.equals(mMinSelected, mMaxSelected)) {
            mExatcSelected = mMinSelected;
            if (mExatcSelected == 1) {
                list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } else {
            mExatcSelected = null;
        }

        //just to avoid compilation errors
        this.mAbilitiesSelectionWindowOpener = null;
        this.mSkillsSelectionWindowOpener = null;
        this.mToolsSelectionWindowOpener = null;
        this.mMode = null;
        //just to avoid compilation errors

        this.mSingularDesc = pmSingularDesc;
        this.mPluralDesc = pmPluralDesc;

        setAcceptButtonEnabled();
        setLabelText();
        setDescriptions();

    }

    public BasicSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbstractListModel pmListModel, HashMap<Object, String> pmDescriptions, String pmSingularDesc, String pmPluralDesc, AbilitiesSelectionWindowOpener pmOpener) {
        this(pmMaxSelected, pmMinSelected, pmListModel, pmDescriptions, pmSingularDesc, pmPluralDesc);

        this.mMode = SelectionWindowMode.ABILITIES;
        this.mAbilitiesSelectionWindowOpener = pmOpener;

    }

    public BasicSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbstractListModel pmListModel, HashMap<Object, String> pmDescriptions, String pmSingularDesc, String pmPluralDesc, SkillsSelectionWindowOpener pmOpener) {
        this(pmMaxSelected, pmMinSelected, pmListModel, pmDescriptions, pmSingularDesc, pmPluralDesc);

        this.mMode = SelectionWindowMode.SKILLS;
        this.mSkillsSelectionWindowOpener = pmOpener;

    }

    public BasicSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbstractListModel pmListModel, HashMap<Object, String> pmDescriptions, String pmSingularDesc, String pmPluralDesc, ToolsSelectionWindowOpener pmOpener) {
        this(pmMaxSelected, pmMinSelected, pmListModel, pmDescriptions, pmSingularDesc, pmPluralDesc);

        this.mMode = SelectionWindowMode.TOOLS;
        this.mToolsSelectionWindowOpener = pmOpener;

    }

    public BasicSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbstractListModel pmListModel, HashMap<Object, String> pmDescriptions, String pmSingularDesc, String pmPluralDesc, LanguagesSelectionWindowOpener pmOpener) {
        this(pmMaxSelected, pmMinSelected, pmListModel, pmDescriptions, pmSingularDesc, pmPluralDesc);

        this.mMode = SelectionWindowMode.LANGUAGES;
        this.mLanguagesSelectionWindowOpener = pmOpener;

    }

    public BasicSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbstractListModel pmListModel, HashMap<Object, String> pmDescriptions, String pmSingularDesc, String pmPluralDesc, SpellSelectionWindowOpener pmOpener) {
        this(pmMaxSelected, pmMinSelected, pmListModel, pmDescriptions, pmSingularDesc, pmPluralDesc);

        this.mMode = SelectionWindowMode.SPELLS;
        this.mSpellsSelectionWindowOpener = pmOpener;

    }

    private void setAcceptButtonEnabled() {
        if (mExatcSelected != null) {
            if (list.getSelectedValuesList().size() != mExatcSelected) {
                acceptButton.setEnabled(false);
            } else {
                acceptButton.setEnabled(true);
            }
        } else {
            if (list.getSelectedValuesList().size() >= mMinSelected && list.getSelectedValuesList().size() <= mMaxSelected) {
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
            if (mExatcSelected == 1) {
                lvBuilder.append(" ").append(mSingularDesc);
            } else {
                lvBuilder.append(" ").append(mPluralDesc);
            }
        } else {
            lvBuilder.append(mMinSelected).append(" to ").append(mMaxSelected);
            lvBuilder.append(" ").append(mPluralDesc);
        }

        label.setText(lvBuilder.toString());
    }

    private void setDescriptions() {

        StringBuilder lvBuilder = new StringBuilder("");

        List<Object> lvSelected = list.getSelectedValuesList();

        for (int i = 0; i < lvSelected.size(); i++) {
            lvBuilder.append(mDescriptions.get(lvSelected.get(i)));

            if (i < lvSelected.size() - 1) {
                lvBuilder.append("\n\n\n\n");
            }
        }

        descriptionArea.setText(lvBuilder.toString());
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
        list = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label.setText("jLabel1");

        list.setModel(this.mListModel);
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        jScrollPane2.setViewportView(descriptionArea);
        descriptionArea.setEditable(false);

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(cancelButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        setAcceptButtonEnabled();
        setDescriptions();
    }//GEN-LAST:event_listValueChanged

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        switch (this.mMode) {
            case ABILITIES:
                this.mAbilitiesSelectionWindowOpener.setAbilitiesFields((List<Abilities>) list.getSelectedValuesList());
                break;
            case SKILLS:
                this.mSkillsSelectionWindowOpener.setSkillsFields((List<Skills>) list.getSelectedValuesList());
                break;
            case TOOLS:
                this.mToolsSelectionWindowOpener.setToolsFields((List<Tools>) list.getSelectedValuesList());
                break;
            case LANGUAGES:
                this.mLanguagesSelectionWindowOpener.setLanguagesFields((List<Languages>) list.getSelectedValuesList());
            case SPELLS:
                this.mSpellsSelectionWindowOpener.setSpellsFields((List<String>)list.getSelectedValuesList());
        }

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
            java.util.logging.Logger.getLogger(BasicSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicSelectionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JList list;
    // End of variables declaration//GEN-END:variables

    private BasicSelectionWindow(Integer pmMaxSelected, Integer pmMinSelected, AbstractListModel pmListModel, String pmSingularDesc, String pmPluralDesc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
