/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Virtual
 */
public class ManejadorDeArchivos 
{
    private File archivo;
    private FileReader lector;
    private BufferedReader buffer;
    private FileWriter escritor;
    private JFileChooser explorador = new JFileChooser();
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private String linea = "";
    private VentanaDeProgreso pro = new VentanaDeProgreso();
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");

    public ManejadorDeArchivos() 
    {
        
    }
    
    public ArrayList<Integer> cargarArchivo() throws ExcepcionRango
    {
        try
        {
            array.clear();
            
            String aux;
            explorador.setFileFilter(filtro);
            
            int opc = explorador.showOpenDialog(null);
            
            if (opc == explorador.APPROVE_OPTION)
            {
                archivo = explorador.getSelectedFile();

                if (archivo != null)
                {
                    lector = new FileReader(archivo);
                    buffer = new BufferedReader(lector);
                    
                    while( (aux = buffer.readLine()) != null ) 
                    {
                        aux = aux.substring(0, 2);
                        array.add(Integer.parseInt(aux));
                    }
                    
                    buffer.close();
                    return array;
                }  
            }
            
        }
        catch (IOException ex)
        {
            Cartel.mostrarMensajeError("ERROR 1: No se encontró el archivo", "ERROR");
        }
        
        return null;
    }
    
    public boolean guardarArchivo(ArrayList<Integer> al)
    {
        try
        {
            int aux;
            explorador.setFileFilter(null);
            
            //convertirAString(al);
            
            int opc = explorador.showSaveDialog(null);
            
            if (opc == explorador.APPROVE_OPTION)
            {
                archivo = explorador.getSelectedFile();

                if (archivo != null)
                {
                    escritor = new FileWriter(archivo + ".txt");
                    
                    for (int i = 0; i < al.size(); i++) 
                    {
                        aux = al.get(i);
                        
                        if (aux < 10) escritor.write("0" + al.get(i) + "\n");
                        else escritor.write("" + al.get(i) + "\n");
                    }
                    
                    escritor.close();

                    Cartel.mostrarMensajeInformativo("Archivo guardado", "EXITO");
                }
                
                return true;
            }
            else return false;
             
        }
        catch (IOException ex)
        {
            Cartel.mostrarMensajeError("ERROR 2: El archivo no se ha guardado", "ERROR");
        }
        
        return false;
    }
    
    private void convertirAVector() throws ExcepcionRango
    {
        try
        {
            ArrayList<Integer> numeros = new ArrayList<Integer>();
            int total = linea.length();
            pro.setVisible(true);

            for (int i = 0; i < linea.length(); i+=2) 
            {
                if (Integer.parseInt( linea.substring(i, i+2) ) < 0 || Integer.parseInt( linea.substring(i, i+2) ) > 36 )
                    throw new ExcepcionRango();
                
                numeros.add( Integer.parseInt( linea.substring(i, i+2) ) );

                pro.getjProgressBar1().setValue(i * 100 / total);
                pro.getjProgressBar1().repaint();
            }

            array = numeros;
            pro.setVisible(false);
        }
        catch (NumberFormatException nfe)
        {
            Cartel.mostrarMensajeError("ERROR 3: El archivo contiene uno o más caracteres NO numéricos", "ERROR");
            array = null;
            pro.setVisible(false);
        }
        catch (StringIndexOutOfBoundsException sioobe)
        {
            Cartel.mostrarMensajeError("ERROR 4: El archivo contiene un total de caracteres impares", "ERROR");
            array = null;
            pro.setVisible(false);
        }
        catch (ExcepcionRango er)
        {
            Cartel.mostrarMensajeError(er.getMessage(), "ERROR");
            array = null;
            pro.setVisible(false);
        }
        catch (NullPointerException npe)
        {
            Cartel.mostrarMensajeError("ERROR 5: El archivo está vacío", "ERROR");
            array = null;
            pro.setVisible(false);
        }
    }
    
    private void convertirAString(ArrayList<Integer> al)
    {
        String aux = "";
        int total = al.size();
        pro.setVisible(true);
        
        for (int i = 0; i < al.size(); i++) 
        {
            if (al.get(i) < 10) aux += "0";
            aux += al.get(i);
            
            pro.getjProgressBar1().setValue(i * 100 / total);
            pro.getjProgressBar1().repaint();
        }
        
        linea = aux;
        pro.setVisible(false);
    }

    public ArrayList<Integer> getArray() {
        return array;
    }
    
    
    
}
