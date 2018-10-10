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
public class EjercicioOnready {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int posCaro,posBarato;    
    float [] listaPrecios = new float[4];
    Vehiculo [] listaVehiculos2 = new Vehiculo[4];
    Vehiculo Peugeout = new Auto("Peugeot","206","4","$200.000,00");
    Vehiculo Honda = new Moto("Honda","Titan","125c","$60.000,00");
    Vehiculo Peugeout2 = new Auto("Peugeot","208","5","$250.000,00");
    Vehiculo Yamaha = new Moto("Yamaha","YBR","160c","$80.500,50");
    Vehiculo [] listaVehiculos = {Peugeout,Honda,Peugeout2,Yamaha};
    //imprimo Vehiculos
        for (int i = 0; i < listaVehiculos.length; i++) 
        {
            listaVehiculos[i].cargaVehiculo();
        }
    //Paso precios de String a Float    
        for (int i = 0; i < listaVehiculos.length; i++) {
           String x = listaVehiculos[i].getPrecio().replace("$","");
            x= x.replace(".","");
            x= x.replace(",",".");
          listaPrecios[i]=Float.parseFloat(x);
        }
     //Busco cual es el más caro  y cual es el más barato 
        posCaro= masCaro(listaPrecios);
        posBarato= masBarato(listaPrecios);
        System.out.println("======================================================================");
     //Imprimo vehículo más caro y más barato 
        System.out.println("Vehículo más caro: "+listaVehiculos[posCaro].getMarca()+" "+listaVehiculos[posCaro].getModelo());
        System.out.println("Vehículo más barato: "+listaVehiculos[posBarato].getMarca()+" "+listaVehiculos[posBarato].getModelo());
     //Busco cual modelo contiene la 'Y'
        Vehiculo y = contieneY(listaVehiculos);
     //Imprimo Vehículo cuyo modelo contiene 'Y'
        System.out.println("Vehículo que contiene en el modelo la letra 'Y': "+y.getMarca()+" "+y.getModelo()+" "+y.getPrecio());
        System.out.println("======================================================================");
     //Ejercicio Extra
        listaVehiculos2=ordenarMayorMenor(listaPrecios,listaVehiculos);
     //Imprimo vehículos ordenados por precio de mayor a menor
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (int i = 0; i < listaVehiculos2.length; i++) {
            System.out.println(listaVehiculos2[i].getMarca()+" "+listaVehiculos2[i].getModelo());
        }
    }
    
    
    
    public static int masCaro(float [] listaPrecios){
    float max= 0;
    int posicion = 0;
        for (int i = 0; i < listaPrecios.length; i++) {
            if ( max < listaPrecios[i] ){
            max = listaPrecios[i];
            posicion = i;
            }
        }
    return posicion;
    }
    
    public static int masBarato(float [] listaPrecios){
    float min= listaPrecios[0];
    int posicion = 0;
        for (int i = 0; i < listaPrecios.length; i++) {
            if ( min > listaPrecios[i] ){
            min = listaPrecios[i];
            posicion = i;
            }
        }
    return posicion;
    }
    
    public static Vehiculo contieneY(Vehiculo [] listaVehiculos){
        int posicion=0;
        for (int i = 0; i < listaVehiculos.length; i++) {
            if(listaVehiculos[i].getModelo().contains("Y")){
            posicion=i;
            }
        }
    return listaVehiculos[posicion];
    }
    public static Vehiculo[] ordenarMayorMenor(float [] listaPrecios, Vehiculo[] listaVehiculos){
       float temp=0;
      Vehiculo v;
  for (int index= 0; index < listaPrecios.length-1; index++) {
    
   for (int compare = 0; compare< listaPrecios.length-1; compare++) {
    
    
    if (listaPrecios[compare]<listaPrecios[compare+1]){
     
     temp = listaPrecios[compare];
     v=listaVehiculos[compare];
     listaPrecios[compare]=listaPrecios[compare+1];
     listaPrecios[compare+1]=temp;
     listaVehiculos[compare]=listaVehiculos[compare+1];
     listaVehiculos[compare+1] = v;
     }
    
   }
  }
 return listaVehiculos;
 }
 
}

