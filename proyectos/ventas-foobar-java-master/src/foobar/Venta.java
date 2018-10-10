
package foobar;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private Date fecha;
    private ArrayList<Item> items;
    private double abono;
    private double vuelto;
    private double precioTotal;
    private Ticket ticket;

    public Venta(ArrayList<Item> items) {
        this.items = items;
        calcularPrecioTotal();
    }
    
    public void generarTicket() {
        this.fecha = new Date();
        this.ticket = new Ticket(this.fecha, this.items, this.abono, this.vuelto, this.precioTotal);
    }
    
    private void calcularPrecioTotal()
    {
        for (int i = 0; i < this.items.size(); i++) {
            this.precioTotal += this.items.get(i).getSubtotal();
        }
    }
    
    public void calcularVuelto()
    {
        this.vuelto = this.abono - this.precioTotal;
    }

    public double getVuelto() {
        return vuelto;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }
}
