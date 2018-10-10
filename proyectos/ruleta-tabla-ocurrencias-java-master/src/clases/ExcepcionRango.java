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
public class ExcepcionRango extends Exception
{
    public ExcepcionRango ()
    {
        super("ERROR 8: El archivo contiene uno o más números incorrectos");
    }
}
