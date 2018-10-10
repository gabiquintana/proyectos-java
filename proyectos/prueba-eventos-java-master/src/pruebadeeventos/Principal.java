
package pruebadeeventos;

public class Principal
{
    public static void main(String[] args)
    {
        Vista vis = new Vista();
        Controlador c = new Controlador(vis);
        c.iniciar();
    }
}
