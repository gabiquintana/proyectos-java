
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caemci
 */
public class ManejadorDeBaseDeDatos {
    private String direccion;
    private String usuario;
    private String clave;
    private Connection conexion;

    public ManejadorDeBaseDeDatos(String direccion, String usuario, String clave) {
        this.direccion = direccion;
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public void testear() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
	this.conectar();
        this.desconectar();
    }
    
    public void conectar() throws SQLException {
        this.conexion = DriverManager.getConnection("jdbc:mysql://"+this.direccion,this.usuario,this.clave);
    }
    
    public void desconectar() throws SQLException {
        this.conexion.close();
    }
    
    public ResultSet procesarConsulta (String sql) throws SQLException {
        this.conectar();
        Statement s = conexion.createStatement();
        ResultSet rs = s.executeQuery(sql);
        return rs;
    }
    
    public void procesarAccion (String sql) throws SQLException {
        this.conectar();
        Statement s = conexion.createStatement();
        s.executeUpdate(sql);
    }
    
    public PreparedStatement procesarActualizacion (String sql) throws SQLException {
        this.conectar();
        PreparedStatement ps = conexion.prepareStatement(sql);
        return ps;
    }
}
