
package controlador;

import java.sql.Connection;
import modelo.Prestador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
        //Metodo que guarda un nuevo Prestador a la base de datos
     public void guardarPrestador(Prestador prestador) {

        String QUERY = "INSERT INTO prestador(nombre,apellido,dni,domicilio,telefono,activo)"
                + " VALUES(?,?,?,?,?,?,?)";

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
    
             JOptionPane.showMessageDialog(null, "¡No se pudo agregar el Prestador, intente nuevamente! " + ex);
    }

     }
 //Metodo que modifia el campo "activo" de la tabla "prestador" en 0, esta accion genera que el prestador figure como eliminado.
    public void eliminarPrestador(int id) {

        final String QUERY = "UPDATE prestador SET activo = 0 WHERE idPrestador = ?";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            int envioExitoso = statement.executeUpdate();
            if (envioExitoso == 1) {

                JOptionPane.showMessageDialog(null, "¡El presatdor se elimino correctamente!");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo eliminar el prestador, intente nuevamente!");

        }

    }

    // Metodo que permite MODIFICAR un Prestador
    
    public void modificarPrestador (Prestador prestador) {
        
         String QUERY = "UPDATE prestador SET nombre = ?,apellido = ?,dni = ?,domicilio = ?,telefono = ?,activo  =? WHERE idPrestador=?";
          //Cargamos los datos en el statement
          try{
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);  
            statement.setString(1, prestador.getNombre());
            statement.setString(2, prestador.getApellido());
            statement.setInt(3, prestador.getDni());
            statement.setString(4, prestador.getDomicilio());
            statement.setInt(5, prestador.getTelefono());
            statement.setBoolean(6, prestador.isActivo());
            statement.setInt(7, prestador.getIdPrestador());
             int updateExitoso = statement.executeUpdate();
            if (updateExitoso == 1) {

                JOptionPane.showMessageDialog(null, "!Se modificaron los datos del Prestador correctamente!");
            } else {

                JOptionPane.showMessageDialog(null, "!Error al Modificar los Datos del Prestador, intente Nuevamente!");

            }
          }
        catch (SQLException ex){
            
             JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
    }
    }
       public Prestador buscarPrestadorApellido(String apellido) {

        String QUERY = "SELECT idPrestador, nombre,apellido, dni, domicilio, telefono FROM prestador WHERE apellido = ? AND estado = 1";
        Prestador prestador = null;
        
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
           
            statement.setString(1, apellido);
            ResultSet rs = statement.executeQuery();
            
            if (rs.next()){
                prestador = new Prestador();
            
            prestador.setIdPrestador(rs.getInt("idPrestador"));
            prestador.setNombre(rs.getString("nombre"));
            prestador.setDni(rs.getInt("dni"));
            prestador.setDomicilio(rs.getString("domicilio"));
            prestador.setTelefono(rs.getInt("telefono"));
            prestador.setActivo(true);
            }
             else{
                    JOptionPane.showMessageDialog(null, "No existe ese prestador");
     
            }
         statement.close();
           

              
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
        return prestador;
    }
       
       public Prestador buscarPrestador_id(int id) {

        Prestador prestador = null;

        final String QUERY = "SELECT idPrestador, nombre, apellido, dni, domicilio, telefono, activo FROM prestador WHERE idPrestador = ? AND estado = 1";

        try {

            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                
                 prestador = new Prestador();
                 
               prestador.setIdPrestador(id);
               prestador.setNombre(result.getString("nombre"));
               prestador.setApellido(result.getString("apellido"));
               prestador.setDni(result.getInt("dni"));
               prestador.setDomicilio(result.getString("domicilio"));
               prestador.setTelefono(result.getInt("telefono"));
               prestador.setActivo(result.getBoolean("activo"));

            } else {

                JOptionPane.showMessageDialog(null, "¡El prestador no existe!");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);

        }

        return prestador;
}
}
          
          
