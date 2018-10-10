/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.onready;

/**
 *
 * @author Hildebrando
 */
public class Auto extends Vehiculo{

    public Auto(String marca, String modelo, String tipo, String precio) {
        super(marca, modelo, tipo, precio);
    }

    @Override
    public void cargaVehiculo() {
        System.out.println("Marca: "+this.getMarca()+" // "+"Modelo: "+this.getModelo()+" // "
                +"Puertas: "+this.getTipo()+" // "+"Precio: "+this.getPrecio());
        
    }

    
}
