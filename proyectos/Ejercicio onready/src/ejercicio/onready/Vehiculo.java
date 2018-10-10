/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.onready;


public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String tipo;
    private String precio;

    public Vehiculo(String marca, String modelo, String tipo, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }
    public abstract void cargaVehiculo();

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrecio() {
        return precio;
    }
    
}
