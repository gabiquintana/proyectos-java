
package generador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import vistas.JFrameVistaProgreso;

/**
 *
 * @author caemci
 */
public class Modelo {
    
    private ArrayList<Persona> personas;
    private BibliotecaDeDatos bdd;
    private ManejadorDeBaseDeDatos mbd;
    private ManejadorDeArchivoDeTexto mat;
    private JFrameVistaProgreso vprog;
    
    public Modelo() {
        this.personas = new ArrayList<Persona>();
    }
    
    public void conectarABaseDeDatos(String host, String user, String pass) throws ClassNotFoundException, SQLException {
        this.mbd = new ManejadorDeBaseDeDatos(host,user,pass);
        this.mbd.testear();
    }
    
    public void generarBibliotecaDeDatos () throws SQLException {
        this.bdd = new BibliotecaDeDatos(this.mbd, Configuracion.getGenero());
    }
    
    private void prepararVentanaDeProgreso (int cantidad) {
        this.vprog = new JFrameVistaProgreso(cantidad);
        this.vprog.iniciarVista();
    }
    
    public ArrayList<Persona> obtenerPersonas (int cantidad) throws SQLException {
        limpiarLista();
        this.bdd.resetearListas();
        this.mbd.conectar();
        prepararVentanaDeProgreso(cantidad);
        for (int i = 0; i < cantidad; i++) {
            this.personas.add( generarPersona() );
            this.vprog.contar();
        }
        this.vprog.cerrarVentana();
        this.mbd.desconectar();
        return this.personas;
    }
    
    public Persona generarPersona() throws SQLException {
        String dni = "";
        Nombre nombreElegidoObj;
        String nombre;
        String apellido = "";
        Genero gen = null;
        String fechaDeNacimiento = "";
        String mail = "";
        String movil = "";
        String domicilio = "";
        String barrio = "";
        String formato = "yyyy/MM/dd";
        String nacionalidad = "";
        
        nombreElegidoObj = this.bdd.obtenerNombre();
        nombre = nombreElegidoObj.NOMBRE + " " + this.bdd.obtenerNombre(nombreElegidoObj ).NOMBRE;
        gen = nombreElegidoObj.GENERO;
        
        if (Campo.APELLIDO.isSeleccionado()) {
            Apellido apellidoObj = this.bdd.obtenerApellido();
            nacionalidad = obtenerNacionalidad(apellidoObj);
            apellido = apellidoObj.APELLIDO + this.bdd.obtenerApellido(apellido);
        }
        if (Campo.FECHA_NACIMIENTO.isSeleccionado()) {
            fechaDeNacimiento = this.bdd.obtenerFechaDeNacimiento(formato);
        }
        if (Campo.DNI.isSeleccionado()) {
            dni = this.bdd.obtenerDNI( Integer.parseInt(fechaDeNacimiento.substring( 0, fechaDeNacimiento.indexOf('/') )) );
        }
        if (Campo.MAIL.isSeleccionado()) {
            mail = this.bdd.obtenerMail(nombreElegidoObj.NOMBRE, apellido );
        }
        if (Campo.MOVIL.isSeleccionado()) {
            movil = this.bdd.obtenerMovil();
        }
        if (Campo.DOMICILIO.isSeleccionado()) {
            Domicilio d = this.bdd.obtenerDomicilio();
            domicilio = d.DIRECCION;
            barrio = d.BARRIO;
        }
        return new Persona(dni, nombre, apellido, gen, fechaDeNacimiento, mail, movil, domicilio, barrio, nacionalidad);
    }
    
    private String obtenerNacionalidad (Apellido ape) {
        if (ape.ORIGEN.equals("Alemania") ||
            ape.ORIGEN.equals("Costa Rica") ||
            ape.ORIGEN.equals("Cuba") ||
            ape.ORIGEN.equals("España") ||
            ape.ORIGEN.equals("Estados Unidos") ||
            ape.ORIGEN.equals("Francia") ||
            ape.ORIGEN.equals("Guatemala") ||
            ape.ORIGEN.equals("Honduras") ||
            ape.ORIGEN.equals("Inglaterra") ||
            ape.ORIGEN.equals("Italia") ||
            ape.ORIGEN.equals("Japón") ||
            ape.ORIGEN.equals("México") ||
            ape.ORIGEN.equals("Nicaragua") ||
            ape.ORIGEN.equals("Ecuador") ||
            ape.ORIGEN.equals("Brasil") ||
            ape.ORIGEN.equals("Panamá") ) {
            return "Argentina";
        }
        else return ape.ORIGEN;
    }
    
    private void limpiarLista() {
        this.personas.clear();
    }
    
    public void exportar(Archivo arch) throws IOException {
        this.mat = new ManejadorDeArchivoDeTexto(arch.getRuta());
        switch (arch.getTipo()) {
            case SQL:
                mat.escribirLinea( obtenerSQL(arch.getDatos()) );
                break;
            case CSV:
                mat.escribirLinea( obtenerCSV(arch.getDatos()) );
                break;
        }
    }
    
    private String obtenerSQL (String[][] datos) {
        StringBuilder texto = new StringBuilder("/*Reemplazar nombre_tabla por el verdadero nombre*/\n\nINSERT INTO nombre_tabla VALUES\n");
        for (int i = 0; i < datos.length; i++) {
            texto.append('(');
            for (int j = 0; j < datos[i].length-1; j++) {
                texto.append('"');
                texto.append(datos[i][j]);
                texto.append('"');
                texto.append(',');
            }
            texto.append('"');
            texto.append(datos[i][datos[i].length-1]);
            texto.append("\"),\n");
        }
        texto.delete(texto.length() - 2,texto.length());
        texto.append(';');
        return texto.toString();
    }
    
    private String obtenerCSV (String[][] datos) {
        StringBuilder texto = new StringBuilder("");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length-1; j++) {
                texto.append(datos[i][j]);
                texto.append(',');
            }
            texto.append(datos[i][datos[i].length-1]);
            texto.append("\n");
        }
        texto.delete(texto.length() - 1,texto.length());
        return texto.toString();
    }
}
