
package foobar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Ticket {
    private String encabezado = "";
    private String cuerpo = "";
    private String pie = "";

    public Ticket(Date fecha, ArrayList<Item> items, double abono, double vuelto, double precioTotal) {
        armarEncabezado(fecha);
        armarCuerpo(items);
        armarPie(abono, vuelto, precioTotal);
    }
    
    private void armarEncabezado(Date fecha)
    {
        this.encabezado = "Foobar\n" +
                          "CUIT Nro 30-12345678-9\n" +
                          "IVA RESPONSABLE INSCRIPTO\n" +
                          devolverFechaFormateada(fecha) + "\n\n";
    }
    
    private void armarCuerpo(ArrayList<Item> items)
    {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getCantidad() > 0) {
                this.cuerpo += items.get(i).toString() + "\n";
            }
        }
        this.cuerpo += "\n";
    }
    
    private void armarPie(double abono, double vuelto, double precioTotal)
    {
        this.pie = "TOTAL:\t\t\t" + precioTotal + "\n" +
                          "Abona con:\t\t" + abono + "\n" +
                          "Su vuelto:\t\t" + vuelto + "\n\n" +
                          "GRACIAS POR CONFIAR EN NOSOTROS !";
    }
    
    private String devolverFechaFormateada(Date fecha)
    {
        fecha = new Date();
        DateFormat miFormato = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        return miFormato.format(fecha);
    }

    @Override
    public String toString() {
        return this.encabezado + this.cuerpo + this.pie;
    }
}
