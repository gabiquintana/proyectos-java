/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Cartel 
{
    public static String mostrarIntroducirNumero(String mensaje, String titulo)
    {
        return JOptionPane.showInputDialog(null,mensaje,titulo,1);
    }
    
    public static String mostrarIntroducirString(String mensaje, String titulo)
    {
        return JOptionPane.showInputDialog(null,mensaje,titulo,1);
    }
    
    public static void mostrarMensajeError(String mensaje, String titulo)
    {
        JOptionPane.showMessageDialog(null, mensaje, titulo, 0);    
    }    
    
    public static void mostrarMensajeInformativo(String mensaje, String titulo)
    {
        JOptionPane.showMessageDialog(null, mensaje, titulo, 1);    
    }    
    
    public static void mostrarMensajeAdvertencia(String mensaje, String titulo)
    {
        JOptionPane.showMessageDialog(null, mensaje, titulo, 2);    
    }
    
    public static int mostrarCartelConfirmacion(String mensaje, String titulo)
    {
        return JOptionPane.showConfirmDialog(null, mensaje, titulo, 0);
    }
}
