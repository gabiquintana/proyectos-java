/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Virtual
 */
public class MiRender extends JFormattedTextField implements TableCellRenderer 
{
    
    @Override
    public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected,boolean hasFocus,int row, int column)
    {
        Font fuente1 = new Font("Arial", 1, 13);
        Font fuente2 = new Font("Calibri", 1, 12);
        JFormattedTextField campoTexto = new JFormattedTextField();
        
        campoTexto.setBorder(BorderFactory.createEmptyBorder());
        campoTexto.setText("" + value);
        campoTexto.setHorizontalAlignment(CENTER);
        
        campoTexto.setFont(fuente2);
        
        if (column == 0) 
        {
            campoTexto.setForeground(Color.WHITE);
            campoTexto.setFont(fuente1);
            
            switch ((int) value)
            {
                case 0: campoTexto.setBackground(new java.awt.Color(58, 148, 74)); break;

                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 12:
                case 14:
                case 16:
                case 18:
                case 19:
                case 21:
                case 23:
                case 25:
                case 27:
                case 30:
                case 32:
                case 34:
                case 36: campoTexto.setBackground(new java.awt.Color(225, 0, 26)); break;

                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 15:
                case 17:
                case 20:
                case 22:
                case 24:
                case 26:
                case 28:
                case 29:
                case 31:
                case 33:
                case 35: campoTexto.setBackground(new java.awt.Color(0, 0, 0)); break;
            }
        }
        
         
      return campoTexto;
    }

}
