/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.ui.panels.windows;

import com.blogspot.gameeaterpl.character.DraconicAncestorColor;
import com.blogspot.gameeaterpl.enums.DamageType;
import com.blogspot.gameeaterpl.ui.panels.DragonbornOptionalRaceChoicePanel;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sakurazuka
 */
public class DragonColorSelectionWindow extends javax.swing.JFrame {

    private final String mDescriptionUrl = "/com/blogspot/gameeaterpl/ui/resources/descriptions/";

    DragonbornOptionalRaceChoicePanel mOpener;
    HashMap<DraconicAncestorColor, String> mColorDescription;
    HashMap<DraconicAncestorColor, DamageType> mColorDamageResistance;

    /**
     * Creates new form DragonColorSelectionWindow
     */
    public DragonColorSelectionWindow() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        initHashMaps();

        jList1.setSelectedIndex(0);
        jTextPane1.setText(mColorDescription.get((DraconicAncestorColor) jList1.getSelectedValue()));
    }

    /**
     * Creates new form DragonColorSelectionWindow
     *
     * @param pmOpener
     */
    public DragonColorSelectionWindow(DragonbornOptionalRaceChoicePanel pmOpener) {
        initComponents();
        this.mOpener = pmOpener;
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        initHashMaps();

        jList1.setSelectedIndex(0);
        jTextPane1.setText(mColorDescription.get((DraconicAncestorColor) jList1.getSelectedValue()));
    }

    private void initHashMaps() {
        try {
            mColorDescription = new HashMap<>();

            mColorDescription.put(DraconicAncestorColor.BLACK, readFile(this.getClass().getResource(mDescriptionUrl + "BlackDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.BLUE, readFile(this.getClass().getResource(mDescriptionUrl + "BlueDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.BRASS, readFile(this.getClass().getResource(mDescriptionUrl + "BrassDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.BRONZE, readFile(this.getClass().getResource(mDescriptionUrl + "BronzeDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.COPPER, readFile(this.getClass().getResource(mDescriptionUrl + "CopperDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.GOLD, readFile(this.getClass().getResource(mDescriptionUrl + "GoldDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.GREEN, readFile(this.getClass().getResource(mDescriptionUrl + "GreenDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.RED, readFile(this.getClass().getResource(mDescriptionUrl + "RedDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.SILVER, readFile(this.getClass().getResource(mDescriptionUrl + "SilverDragonDescription.txt"), StandardCharsets.UTF_8));
            mColorDescription.put(DraconicAncestorColor.WHITE, readFile(this.getClass().getResource(mDescriptionUrl + "WhiteDragonDescription.txt"), StandardCharsets.UTF_8));
        
            mColorDamageResistance = new HashMap<>();
            mColorDamageResistance.put(DraconicAncestorColor.BLACK, DamageType.ACID);
            mColorDamageResistance.put(DraconicAncestorColor.BLUE, DamageType.LIGHTNING);
            mColorDamageResistance.put(DraconicAncestorColor.BRASS, DamageType.FIRE);
            mColorDamageResistance.put(DraconicAncestorColor.BRONZE, DamageType.LIGHTNING);
            mColorDamageResistance.put(DraconicAncestorColor.COPPER, DamageType.ACID);
            mColorDamageResistance.put(DraconicAncestorColor.GOLD, DamageType.FIRE);
            mColorDamageResistance.put(DraconicAncestorColor.GREEN, DamageType.POISON);
            mColorDamageResistance.put(DraconicAncestorColor.RED, DamageType.FIRE);
            mColorDamageResistance.put(DraconicAncestorColor.SILVER, DamageType.COLD);
            mColorDamageResistance.put(DraconicAncestorColor.WHITE, DamageType.COLD);
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(DragonColorSelectionWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String readFile(URL path, Charset encoding) throws IOException, URISyntaxException {
        byte[] encoded = Files.readAllBytes(Paths.get(path.toURI()));
        return new String(encoded, encoding);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select Dragon Ancestor Color");

        jLabel1.setText("Draconic ancestor");

        jList1.setModel(new javax.swing.AbstractListModel() {
            DraconicAncestorColor[] colors = {DraconicAncestorColor.BLACK,DraconicAncestorColor.BLUE,DraconicAncestorColor.BRASS,DraconicAncestorColor.BRONZE,DraconicAncestorColor.COPPER,DraconicAncestorColor.GOLD,DraconicAncestorColor.GREEN,DraconicAncestorColor.RED,DraconicAncestorColor.SILVER,DraconicAncestorColor.WHITE};
            public int getSize() { return colors.length; }
            public Object getElementAt(int i) { return colors[i]; }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTextPane1);
        jTextPane1.setText("Opis smoka.\nSmok jest fajny.\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (mOpener != null) {
            DraconicAncestorColor lvSelectedColor = (DraconicAncestorColor) jList1.getSelectedValue();
            mOpener.setFieldsValues(lvSelectedColor, mColorDamageResistance.get(lvSelectedColor));
        }
        
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jTextPane1.setText(mColorDescription.get((DraconicAncestorColor) jList1.getSelectedValue()));
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DragonColorSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DragonColorSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DragonColorSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DragonColorSelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DragonColorSelectionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
