
package foobar;

public class Item {
    private final String concepto;
    private final int cantidad;
    private final double precioUnitario;
    private final double subtotal;

    public Item(String concepto, int cantidad, double precioUnitario) {
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    @Override
    public String toString() {
        return this.cantidad + " x " + this.precioUnitario + "\n" +
               this.concepto + "\t" + this.subtotal;
    }
    
    
}
