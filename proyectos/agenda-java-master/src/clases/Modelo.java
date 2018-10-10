
package clases;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author caemci
 */
public class Modelo {
    private ManejadorDeBaseDeDatos mbd;
    
    public void conectarABaseDeDatos(String host, String user, String pass) throws ClassNotFoundException, SQLException {
        this.mbd = new ManejadorDeBaseDeDatos(host,user,pass);
        this.mbd.testear();
    }
    
    public ArrayList<Contacto> obtenerContactos (Categoria cat) throws SQLException {
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        String condWhere;
        switch (cat) {
            case TODOS:
                condWhere = ""; break;
            case OTROS:
                condWhere = "WHERE categoria IS NULL"; break;
            default:
                condWhere = "WHERE categoria = \'" + cat.name() + "\'"; break;
        }
        
        ResultSet resultado = mbd.procesarConsulta("SELECT * FROM contactos " + condWhere );
        
        while (resultado.next()) {
            contactos.add( generarContacto(resultado) );
        }
        
        return contactos;
    }
    
    private Contacto generarContacto (ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nom = rs.getString("nombre");
        String ape = rs.getString("apellido");
        String mail = rs.getString("mail");
        int tel = rs.getInt("telefono");
        String dir = rs.getString("direccion");
        Date fecha = Date.valueOf( rs.getString("fecha_nacimiento") );
        Categoria c = Categoria.OTROS; 
        if (rs.getString("categoria") != null) {
            c = Categoria.valueOf( rs.getString("categoria") );
        }
        return new Contacto(id,nom,ape,mail,tel,dir,fecha,c);
    }
    
    public ArrayList<Integer> obtenerCantidadesParaEstadistica() throws SQLException {
        ResultSet resultado = mbd.procesarConsulta(
                "SELECT COUNT(*) AS 'Cantidad' FROM contactos GROUP BY categoria");
        ArrayList<Integer> valores = new ArrayList<Integer>();
        
        while (resultado.next()) {
            valores.add( resultado.getInt("Cantidad") );
        }
        
        return valores;
    }
    
    public int obtenerEdadPromedio() throws SQLException {
        ResultSet resultado = mbd.procesarConsulta(
                "SELECT AVG( TIMESTAMPDIFF(YEAR,fecha_nacimiento,CURDATE()) ) AS 'Promedio' "
              + "FROM contactos");
        resultado.next();
        return resultado.getInt("Promedio");
    }
    
    public Contacto obtenerContacto (int id) throws SQLException {
        ResultSet resultado = mbd.procesarConsulta("SELECT * FROM contactos WHERE id =" + id );
        resultado.next();
        Contacto contacto = generarContacto(resultado);
        return contacto;
    }
    
    public void agregarContacto (Contacto co) throws SQLException {
        String campos = "(nombre, apellido, mail, telefono, direccion, fecha_nacimiento, categoria)";
        String consulta = "INSERT INTO contactos " + campos + " VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = mbd.procesarActualizacion(consulta);
        ps.setString(1, co.getNombre());
        ps.setString(2, co.getApellido());
        ps.setString(3, co.getMail());
        ps.setInt(4, co.getTelefono());
        ps.setString(5, co.getDireccion());
        ps.setString(6, co.getFechaDeNacimiento().toString());
        if (co.getCategoria() == Categoria.OTROS) {
            ps.setString(7, co.getCategoria().getSingular());
        }
        else {
            ps.setString(7, co.getCategoria().name());
        }
        ps.executeUpdate();
    }
    
    public void actualizarContacto (Contacto co) throws SQLException {
        String campos = "nombre = ?, apellido = ?, mail = ?, telefono = ?";
        campos += ", direccion = ?, fecha_nacimiento = ?, categoria = ?";
        String consulta = "UPDATE contactos SET " + campos + " WHERE id = " + co.getId();
        PreparedStatement ps = mbd.procesarActualizacion(consulta);
        ps.setString(1, co.getNombre());
        ps.setString(2, co.getApellido());
        ps.setString(3, co.getMail());
        ps.setInt(4, co.getTelefono());
        ps.setString(5, co.getDireccion());
        ps.setString(6, co.getFechaDeNacimiento().toString());
        if (co.getCategoria() == Categoria.OTROS) {
            ps.setString(7, co.getCategoria().getSingular());
        }
        else {
            ps.setString(7, co.getCategoria().name());
        }
        ps.executeUpdate();
    }
    
    public void borrarContacto (Contacto co) throws SQLException {
        mbd.procesarAccion("DELETE FROM contactos WHERE contactos.id = " + co.getId());
    }
    
    public void vaciarListaDeContactos() throws SQLException {
        mbd.procesarAccion("TRUNCATE contactos");
        mbd.procesarAccion("ALTER TABLE contactos AUTO_INCREMENT = 1");
    }
}
