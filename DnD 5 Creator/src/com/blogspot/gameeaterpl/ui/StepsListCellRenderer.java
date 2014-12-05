/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.ui;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
/**
 *Zmienia domyślny sposób wyświetlania pozycji na liście. W Tym przypadku zmienia kolor
 * zaznaczonej pozycji dla listy ustawionej na disabled.
 * 
 * @author sakurazuka
 */
public class StepsListCellRenderer extends JLabel implements ListCellRenderer {

    private static final Color HIGHLIGHT_COLOR = new Color(200, 0, 0); //kolor zaznaczonej komórki
    
    public StepsListCellRenderer() {
        setOpaque(true); //umożliwia wyświetlania tła zaznaczenia
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
      setText((String)value);
        
      if (isSelected) {
          //ustawienia zaznaczonej pozycji
        setBackground(HIGHLIGHT_COLOR);
        setForeground(Color.white); //kolor tekstu
      } else {
          //ustawienia niezaznaczonej pozycji
        setBackground(Color.white);
        setForeground(Color.black); //kolor tekstu
      }
      return this;
    }
    
}
