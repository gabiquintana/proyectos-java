
package generador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManejadorDeArchivoDeTexto 
{
    private File archivo;
    private FileReader archivoLectura;
    private FileWriter archivoEscritura;
    private BufferedReader bufferDeEntrada;
    private BufferedWriter bufferDeSalida;
    private boolean modoLectura;
    
    public ManejadorDeArchivoDeTexto(String nombre) throws IOException
    {
        this.modoLectura = true;
        crearArchivo(nombre);
    }
    
    private void crearArchivo(String nomArch) throws IOException
    {
        this.archivo = new File(nomArch);
    }
    
    private void cerrarArchivo() throws IOException
    {
        if (modoLectura) archivoLectura.close();
        else archivoEscritura.close();
        
    }
    
    private void prepararLectura() throws IOException
    {
        this.modoLectura = true;
        this.archivoLectura = new FileReader(this.archivo);
        this.bufferDeEntrada = new BufferedReader(this.archivoLectura);
    }
    
    private void prepararEscritura() throws IOException
    {
        this.modoLectura = false;
        this.archivoEscritura = new FileWriter(this.archivo, false);
        this.bufferDeSalida = new BufferedWriter(this.archivoEscritura);
    }
    
    /**
     * Obtiene la siguiente línea de un archivo de texto. 
     *
     * @return Cadena en formato String. Si no hay más lineas o falla, devuelve una cadena vacía.
     */
    public String leerLinea () throws IOException
    {
        try
        {
            String linea;
            prepararLectura();
            if ( (linea = bufferDeEntrada.readLine() ) != null ) return linea;
        }
        finally
        {
            cerrarArchivo();
        }
        return "";
    }
    
    /**
     * Obtiene todas las líneas de un archivo de texto. 
     *
     * @return Una colección (ArrayList) de cadenas en formato String. Si no hay lineas o falla, devuelve null.
     */
    public ArrayList<String> leerLineas () throws IOException
    {
        try 
        {
            prepararLectura();
            String linea;
            ArrayList<String> lineas = new ArrayList<String>();
            while ( (linea = bufferDeEntrada.readLine() ) != null )
            {
                lineas.add( linea );
            }
            return lineas;
        }
        finally
        {
            cerrarArchivo();
        }
    }

    /**
     * Escribe una línea en un archivo de texto, en el renglón siguiente tras la última línea del archivo. 
     *
     * @param s Una cadena en formato String.
     */
    public void escribirLinea (String s) throws IOException
    {
        try
        {
            prepararEscritura();
            this.bufferDeSalida.write(s + "\n");
            this.bufferDeSalida.flush();
        }
        finally
        {
            cerrarArchivo();
        }
    }
    
    /**
     * Escribe líneas en un archivo de texto, separadas por un salto de línea.     *
     * 
     * @param lista Un ArrayList de cadenas en formato String con las líneas que serán escritas en el archivo.
     */
    public void escribirLineas (ArrayList<String> lista) throws IOException
    {
        try
        {
            prepararEscritura();
            if (bufferDeSalida != null) {
                for (int i = 0; i < lista.size(); i++)
                {
                    this.bufferDeSalida.write(lista.get(i) + "\n");
                }
                this.bufferDeSalida.flush();
            }
        }
        finally
        {
            cerrarArchivo();
        }
    }
}
