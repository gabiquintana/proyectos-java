
package generador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author caemci
 */
public class BibliotecaDeDatos {
    private final ArrayList<Nombre> LISTA_DE_NOMBRES;
    private final ArrayList<Apellido> LISTA_DE_APELLIDOS;
    private final ArrayList<String> LISTA_DE_SERVIDORES_DE_MAIL;
    private final ArrayList<Calle> LISTA_DE_CALLES;
    private final ArrayList<Documento> LISTA_DE_DOCUMENTOS;
    
    private ArrayList<String> moviles;
    private ArrayList<String> dnis;

    public BibliotecaDeDatos(ManejadorDeBaseDeDatos mbd, Genero gen) throws SQLException {
        this.LISTA_DE_NOMBRES = new ArrayList<Nombre> ();
        this.LISTA_DE_APELLIDOS = new ArrayList<Apellido> ();
        this.LISTA_DE_SERVIDORES_DE_MAIL = new ArrayList<String> ();
        this.LISTA_DE_CALLES = new ArrayList<Calle> ();
        this.LISTA_DE_DOCUMENTOS = new ArrayList<Documento> ();
        
        this.moviles = new ArrayList<String>();
        this.dnis = new ArrayList<String>();
        
        cargarListaDeNombres(mbd);
        cargarListaDeApellidos(mbd);
        cargarListaDeServidoresDeMail(mbd);
        cargarListaDeCalles(mbd);
        cargarListaDeDocumentos(mbd);
    }
    
    public void resetearListas() {
        this.moviles.clear();
    }
    
    private int aleatorioEntre (int min, int max) {
        return (int) (Math.random() * (max-min+1) + min);
    }
    
    public Nombre obtenerNombre () {
        return this.LISTA_DE_NOMBRES.get( aleatorioEntre(0, this.LISTA_DE_NOMBRES.size()-1 ) );
    }
    
    public Nombre obtenerNombre (Nombre nombreExceptuado) {
        Nombre nom;
        if ( Math.random() < 0.8 ) // Un 80% de personas tiene segundo nombre
        {
            do {
                nom = this.LISTA_DE_NOMBRES.get( aleatorioEntre(0, this.LISTA_DE_NOMBRES.size()-1 ) );
            } while( nom.NOMBRE.equals(nombreExceptuado.NOMBRE) || nom.GENERO != nombreExceptuado.GENERO );
            return nom;
        }
        else 
        {
            return new Nombre("", Genero.AMBOS);
        }
    }
    
    public Apellido obtenerApellido () {
        return this.LISTA_DE_APELLIDOS.get( aleatorioEntre(0, this.LISTA_DE_APELLIDOS.size()-1 ) );
    }
    
    public String obtenerApellido (String apellidoExceptuado) {
        String ape;
        if ( Math.random() < 0.2 ) // Un 20% de personas tiene segundo apellido
        {
            do {
                ape = this.LISTA_DE_APELLIDOS.get( aleatorioEntre(0, this.LISTA_DE_APELLIDOS.size()-1 ) ).APELLIDO;
            } while( ape.equals(apellidoExceptuado) );
            return " " + ape;
        }
        else 
        {
            return "";
        }
    }
    
    public Domicilio obtenerDomicilio () {
        Calle ca = this.LISTA_DE_CALLES.get( aleatorioEntre(0, this.LISTA_DE_CALLES.size()-1 ) );
        int altura = elegirAltura(ca);
        String piso = obtenerPiso();
        String depto = obtenerDepartamento();
        String domi = ca.NOMBRE + " " + altura + piso + (piso.isEmpty() ? (depto.isEmpty() ? "" : " Depto " + depto) : depto);
        String barrio = altura % 2 == 0 ? ca.BARRIO_LADO_PAR : ca.BARRIO_LADO_IMPAR;
        return new Domicilio(domi,barrio);
    }
    
    private int elegirAltura (Calle ca) {
        int altura;
        if (Math.random() > 0.5) {
            if (ca.ALTURA_FINAL_IMPAR == 0 && ca.ALTURA_INICIAL_IMPAR == 0) {
                altura = aleatorioEntre(11, (ca.ALTURA_FINAL_PAR - ca.ALTURA_INICIAL_PAR) + ca.ALTURA_INICIAL_PAR);
            }
            else {
                altura = aleatorioEntre(11, (ca.ALTURA_FINAL_IMPAR - ca.ALTURA_INICIAL_IMPAR) + ca.ALTURA_INICIAL_IMPAR);
            }
        }
        else {
            if (ca.ALTURA_FINAL_PAR == 0 && ca.ALTURA_INICIAL_PAR == 0) {
                altura = aleatorioEntre(11, (ca.ALTURA_FINAL_IMPAR - ca.ALTURA_INICIAL_IMPAR) + ca.ALTURA_INICIAL_IMPAR);
            }
            else {
                altura = aleatorioEntre(11, (ca.ALTURA_FINAL_PAR - ca.ALTURA_INICIAL_PAR) + ca.ALTURA_INICIAL_PAR);
            }
        }
        return altura;
    }
    
    private String obtenerPiso() {
        int alea = aleatorioEntre(0, 16);
        if (Math.random() < 0.7) {
            return ( alea == 0 ? " PB" : (" " + alea + "º") );
        }
        else {
            return "";
        }
    }
    
    private String obtenerDepartamento() {
        double tipo = Math.random();
        if (tipo < 0.7) {
            int alea = aleatorioEntre(65, 73);
            return " " + (char) alea;
        }
        else if (tipo < 0.9) {
            return " " + aleatorioEntre(0, 20);
        }
        else {
            return "";
        }
    }
    
    public String obtenerMovil () {
        String movil;
        do {
            int caracteristica;
            String resto = "";

            caracteristica = aleatorioEntre(2, 6);
            for (int i = 0; i < 7; i++) {
                int alea = aleatorioEntre(0, 9);
                resto += alea;
            }

            movil = "11" + caracteristica + resto;
        } while ( estaRepetido(movil, this.moviles) );
        this.moviles.add(movil);
        return movil;
    }
    
    private boolean estaRepetido(String candidato, ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (candidato.equals(lista.get(i))) {
                return true;
            }
        }
        return false;
    }
    
    public String obtenerMail (String nombre, String apellido) {
        char[] separadores = {'.','_',(char) 0};
        String mail = "";
        nombre = nombre.toLowerCase();
        apellido = apellido.toLowerCase();
        if (apellido.contains(" ")) {
            apellido = apellido.substring(0, apellido.indexOf(' '));
        } // ME QUEDO SOLO CON EL PRIMER NOMBRE
        
        // GENERAR NICK SEGUN EL NOMBRE
        if (Math.random() < 0.7) mail += nombre + separadores[aleatorioEntre(0, 1)] + apellido;
        else mail += apellido + separadores[aleatorioEntre(0, 1)] + nombre;
        // AGREGAR O NO UN NUMERO AL NICK
        if (Math.random() < 0.7) mail += separadores[aleatorioEntre(0, 1)] + aleatorioEntre(10, 99);
        // ARMO EL MAIL
        mail += '@' + this.LISTA_DE_SERVIDORES_DE_MAIL.get(aleatorioEntre(0, this.LISTA_DE_SERVIDORES_DE_MAIL.size()-1));
        return mail;
    }
    
    public String obtenerFechaDeNacimiento (String formato) {
        Date fechaAleatoria = new Date();
        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();
        min.setTime( fechaAleatoria );
        max.setTime( fechaAleatoria );
        min.add(Calendar.YEAR, -Configuracion.getEdadMaxima() - 1);
        max.add(Calendar.YEAR, -Configuracion.getEdadMinima());
        min.add(Calendar.DAY_OF_MONTH, 1);
        long milisMin = min.getTimeInMillis();
        long milisMax = max.getTimeInMillis();
        long aleatorio = (long) (Math.random() * (milisMax - milisMin) + milisMin);
        fechaAleatoria.setTime(aleatorio);
        
        return fechaAString(fechaAleatoria, formato);
    }
    
    private String fechaAString (Date fecha, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format( fecha );
    }
    
    public String obtenerDNI (int anio) {
        String dni;
        try {
            do {
                Documento docu = buscarPorAnio(anio);
                dni = aleatorioEntre(docu.MINIMO, docu.MAXIMO) + "";
            } while ( estaRepetido(dni, this.dnis) );
            this.dnis.add(dni);
        }
        catch (NullPointerException npe) {
            do {
                dni = aleatorioEntre(47000000, 50000000) + "";
            } while ( estaRepetido(dni, this.dnis) );
        }
        return dni;
    }
    
    private Documento buscarPorAnio (int anio) {
        for (int i = 0; i < this.LISTA_DE_DOCUMENTOS.size(); i++) {
            if (  this.LISTA_DE_DOCUMENTOS.get(i).ANIO == anio) return this.LISTA_DE_DOCUMENTOS.get(i);
        }
        System.out.println(anio + " no se encontro");
        return null;
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////// Carga de datos ////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    
    private void cargarListaDeNombres(ManejadorDeBaseDeDatos mbd) throws SQLException {
        ResultSet resultado = mbd.procesarConsulta("SELECT nombre,genero FROM nombres "
        + (Configuracion.getGenero() == Genero.AMBOS ? "" : "WHERE genero = '" + Configuracion.getGenero().name() + "'"));
        while ( resultado.next() ) {
            String n = resultado.getString("nombre");
            Genero g = Genero.valueOf( resultado.getString("genero") );
            this.LISTA_DE_NOMBRES.add( new Nombre(n, g) );
        }
    }

    private void cargarListaDeApellidos(ManejadorDeBaseDeDatos mbd) throws SQLException {
        ResultSet resultado = mbd.procesarConsulta("SELECT * FROM apellidos");
        while ( resultado.next() ) {
            this.LISTA_DE_APELLIDOS.add( new Apellido(
                                              resultado.getString("apellido"), 
                                              resultado.getString("origen")
                                             )
                                  );
        }
    }

    private void cargarListaDeServidoresDeMail(ManejadorDeBaseDeDatos mbd) throws SQLException {
        ResultSet resultado = mbd.procesarConsulta("SELECT nombre FROM servidores_mail");
        while ( resultado.next() ) {
            this.LISTA_DE_SERVIDORES_DE_MAIL.add( resultado.getString("nombre") );
        }
    }
    
    private void cargarListaDeCalles(ManejadorDeBaseDeDatos mbd) throws SQLException {
        ResultSet resultado = mbd.procesarConsulta("SELECT * FROM calles");
        while ( resultado.next() ) {
            this.LISTA_DE_CALLES.add( new Calle(
                                              resultado.getString("nombre_oficial"), 
                                              resultado.getInt("alt_izq_ini"), 
                                              resultado.getInt("alt_izq_fin"), 
                                              resultado.getInt("alt_der_ini"), 
                                              resultado.getInt("alt_der_fin"), 
                                              resultado.getString("barrio_lado_par"), 
                                              resultado.getString("barrio_lado_impar") 
                                             )
                                  );
        }
    }
    
    private void cargarListaDeDocumentos(ManejadorDeBaseDeDatos mbd) throws SQLException {
        ResultSet resultado = mbd.procesarConsulta("SELECT * FROM documentos");
        while ( resultado.next() ) {
            this.LISTA_DE_DOCUMENTOS.add( new Documento(
                                              resultado.getInt("menor"), 
                                              resultado.getInt("mayor"), 
                                              resultado.getInt("anio") 
                                             )
                                  );
        }
    }
}
