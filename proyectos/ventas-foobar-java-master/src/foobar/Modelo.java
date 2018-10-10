
package foobar;

import java.util.ArrayList;

public class Modelo {
    private Stock stock;
    private Venta venta;

    public Modelo() {
        this.stock = new Stock(24,12,17,31,2);
    }
    
    public void generarNuevaVenta(int[] cantidades) {
        this.venta = new Venta( generarItems(cantidades) );
    }
    
    private ArrayList<Item> generarItems (int[] cantidades) {
        Item i1 = new Item("Empanada de carne",cantidades[0],stock.PRECIO_EMP);
        Item i2 = new Item("Empanada de pollo",cantidades[1],stock.PRECIO_EMP);
        Item i3 = new Item("Empanada de jamón",cantidades[2],stock.PRECIO_EMP);
        Item i4 = new Item("Medialuna de manteca",cantidades[3],stock.PRECIO_MED);
        Item i5 = new Item("Medialuna de grasa",cantidades[4],stock.PRECIO_MED);
        
        ArrayList<Item> laVenta = new ArrayList<Item>();
        laVenta.add(i1);
        laVenta.add(i2);
        laVenta.add(i3);
        laVenta.add(i4);
        laVenta.add(i5);
        return laVenta;
    }
    
    public Stock getStock() {
        return stock;
    }

    public Venta getVenta() {
        return venta;
    }
}
