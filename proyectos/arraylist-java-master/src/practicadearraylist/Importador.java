package practicadearraylist;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;

public class Importador
{
    private static ObjectInputStream entrada;

    public static void abrirArchivo(String nomArch)
    {
        try
        {
            entrada = new ObjectInputStream(new FileInputStream(nomArch));

        }
        catch (IOException e)
        {
            System.err.println("Error al abrir el archivo.");
        }
    }
    
    public static void abrirArchivo()
    {
        JFileChooser explorador = new JFileChooser();
        try
        {
            explorador.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int resultado = explorador.showOpenDialog(null);
            if (resultado != JFileChooser.CANCEL_OPTION)
            {
                File archivo = explorador.getSelectedFile();
                entrada = new ObjectInputStream(new FileInputStream(archivo));
            }
        }
        catch (IOException ex)
        {
            System.out.println("Error al abrir el archivo");
        }
    }

    public static ArrayList obtenerColeccion()
    {
        ArrayList arL = null;
        try
        {
            arL = (ArrayList) entrada.readObject();                   /////////////////
        }
        catch (EOFException e)
        {
            // se llegó al fin del archivo
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("No se pudo crear el objeto.");
        }
        catch (IOException e)
        {
            System.err.println("Error al leer del archivo.");
        }
        return arL;
    }

    public static void cerrarArchivo()
    {
        try
        {
            if (entrada != null)
            {
                entrada.close();                                            /////////////////
            }

        } // fin de try
        catch (IOException e)
        {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
