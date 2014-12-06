/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.ui;

/**
 *
 * @author sakurazuka
 */
public class CreationStepsPanel extends javax.swing.JPanel {

    private Integer mSelectedIndex = 0;
    /**
     * Creates new form CreationStepsPanel
     */
    public CreationStepsPanel() {
        initComponents();
        jList1.setSelectedIndex(mSelectedIndex); // zaznacz pierwszą pozycję na liście
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        jList1.setForeground(new java.awt.Color(254, 254, 254));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Main Information", "Abilities", "Race" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setEnabled(false);
        jList1.setFocusable(false);
        jList1.setCellRenderer(new StepsListCellRenderer());
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    /**
     * Metoda przesuwa listę na kolejną pozycję. Metoda zapobiega zablokowaniu listy
     */
    public void flipListNext()
    {
        if(this.mSelectedIndex < this.jList1.getModel().getSize()-1)
        {
           this.mSelectedIndex ++; 
           this.jList1.setSelectedIndex(this.mSelectedIndex);
        }
        
    }
    
     /**
     * Metoda przesuwa listę na poprzednią pozycję. Metoda zapobiega zablokowaniu listy
     */
    public void flipListPrevious()
    {
        if(this.mSelectedIndex > 0)
        {
           this.mSelectedIndex --; 
           this.jList1.setSelectedIndex(this.mSelectedIndex);
        }
        
    }
}