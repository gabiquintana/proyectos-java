/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Virtual
 */
public class ExcepcionLimites extends Exception
{
    public ExcepcionLimites ()
    {
        super("ERROR 7: Número ingresado fuera de los límites");
    }
}
