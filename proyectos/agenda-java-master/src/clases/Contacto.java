
package clases;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author caemci
 */
public class Contacto {
    private final int id;
    private String nombre;
    private String apellido;
    private String mail;
    private int telefono;
    private String direccion;
    private Date fechaDeNacimiento;
    private Categoria categoria;
    private int edad;

    public Contacto() {
        this.id = 0;
    }
    
    public Contacto(int id, String nombre, String apellido, String mail, int telefono, String direccion, Date fechaDeNacimiento, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.categoria = categoria;
        calcularEdad();
    }

    public int getId() {
        return id;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        calcularEdad();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getEdad() {
        return edad;
    }
    
    private void calcularEdad () {
        LocalDate nacimiento = this.fechaDeNacimiento.toLocalDate();
        LocalDate ahora  = LocalDate.now();
        this.edad = Period.between(nacimiento, ahora).getYears();
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
