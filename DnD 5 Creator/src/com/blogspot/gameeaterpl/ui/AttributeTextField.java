/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.ui;
import javax.swing.JTextField;
/**
 *
 * @author sakurazuka
 */
public class AttributeTextField extends JTextField {

    public AttributeTextField() {
        this.setEditable(false);
        this.setText("0");
        this.setSize(35, 27);
        this.setFocusable(false);
    }
    
    public AttributeTextField(String pmText) {
        this.setEditable(false);
        this.setText(pmText);
        this.setSize(35, 27);
        this.setFocusable(false);
    }
    
    public AttributeTextField(String pmText, boolean pmEditable) {
        this.setEditable(pmEditable);
        this.setText(pmText);
        this.setSize(35, 27);
        this.setFocusable(pmEditable);
    }
    
    
}
