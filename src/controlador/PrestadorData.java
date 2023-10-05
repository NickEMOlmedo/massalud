
package controlador;

import java.sql.Connection;
import modelo.Prestador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Nickolas
 */
public class PrestadorData {
   
    private Connection nuevaConexion = null;
    
    static boolean conexionExitosa;
    
    public PrestadorData(){
        
        nuevaConexion= Conexion.getConexion();
        
        if (nuevaConexion != null) {

            conexionExitosa = true;
    
    }
    }
    public static boolean conexionExitosa(){
        return conexionExitosa;
    }
    
     public void guardarPrestdor(Prestador prestador) {

        String QUERY = "INSERT INTO prestador(nombre,apellido,dni,domicilio,telefono,activo)"
                + " VALUES(?,?,?,?,?,?)";

        //Cargamos los datos en el statement y procedemos a enviarlos.
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setString(1, prestador.getNombre());
            statement.setString(2, prestador.getApellido());
            statement.setInt(3, prestador.getDni());
            statement.setString(4, prestador.getDomicilio());
            statement.setInt(5, prestador.getTelefono());
            statement.setBoolean(6, prestador.isActivo());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();

            //Verificamos si existen resultados en el resultset y agregamos el id al prestador.
            if (result.next()) {

                prestador.setIdPrestador(result.getInt(1));

                JOptionPane.showMessageDialog(null, "¡El prestador se agregó correctamente!");
            }
        } catch (SQLException ex) {
    
    }

     }}