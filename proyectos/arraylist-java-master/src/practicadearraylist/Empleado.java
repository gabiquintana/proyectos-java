
package practicadearraylist;

import java.io.Serializable;

public class Empleado implements Serializable
{
    private static int cuentaDeLegajos = 0;
    private int legajo;
    private String nombre;
    private String apellido;
    private Sector sector;
    private double sueldoPorHora;
    private int horasAlMes;

    public Empleado(String nombre, String apellido, Sector sector, double sueldoPorHora, int horasAlMes)
    {
        this.legajo = ++cuentaDeLegajos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sector = sector;
        this.sueldoPorHora = sueldoPorHora;
        this.horasAlMes = horasAlMes;
    }

    public static int getCuentaDeLegajos()
    {
        return cuentaDeLegajos;
    }
    
    public int getLegajo()
    {
        return legajo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public Sector getSector()
    {
        return sector;
    }

    public void setSector(Sector sector)
    {
        this.sector = sector;
    }

    public double getSueldoPorHora()
    {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora)
    {
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getHorasAlMes()
    {
        return horasAlMes;
    }

    public void setHorasAlMes(int horasAlMes)
    {
        if (horasAlMes >= 80 && horasAlMes <= 200)
        {
            this.horasAlMes = horasAlMes;
        }
    }

    public String toString()
    {
        return "#" + legajo + " | " + nombre + " " + apellido + ", de " + sector + ". $" + sueldoPorHora + "/h | " + horasAlMes + " hs/mes";
    }
    
    
}
