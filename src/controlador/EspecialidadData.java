
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Especialidad;
import org.mariadb.jdbc.Statement;

public class EspecialidadData {

    private Connection nuevaConexion = null;

    static boolean conexionExitosa;

    public EspecialidadData() {

        nuevaConexion = Conexion.getConexion();

        if (nuevaConexion != null) {

            conexionExitosa = true;
        }
    }

    public static boolean conexionExitosa() {

        return conexionExitosa;

    }

    public void guardarEspecialidad(Especialidad especialidad) {
        //Conectamos a la base de datos...
        String QUERY = "INSERT INTO especialidad(especialidad)VALUES(?)";

        //Cargamos los datos en el statement y procedemos a enviarlos..
        try {
            PreparedStatement ps = nuevaConexion.prepareStatement(QUERY,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, especialidad.getEspecialidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            //Verificamos si existen resultados en el resultset y agregamos el id...
            if (rs.next()) {

                especialidad.setIdEspecialidad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Especialidad Cargada");
            }
            //Cerramos Statement...
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Especialidad");
        }
    }
    
    public void eliminarEspecialidad(int idEspecialidad,String especialidad){
    
        String QUERY= "DELETE FROM especialidad WHERE idEspecialidad=? AND especialidad=?";
        
        try {
            PreparedStatement ps=nuevaConexion.prepareStatement(QUERY);
            
            ps.setInt(1,idEspecialidad);
            ps.setString(2, especialidad);
            
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Especialidad Eliminada");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Especialidad");
        }
    }
    
    public Especialidad buscarEspecialidad(int id){
    
        String QUERY= "SELECT especialidad FROM especialidad WHERE idEspecialidad=?";
        Especialidad especialista = null;
        try {
            PreparedStatement ps=nuevaConexion.prepareStatement(QUERY);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            
                especialista=new Especialidad();
                especialista.setIdEspecialidad(id);
                especialista.setEspecialidad(rs.getString("especialidad"));
            } else {
                JOptionPane.showMessageDialog(null, " No esxiste esa Especialidaad");
            }
            ps.close();
                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Especialidad");
        }
        return especialista;
    }
    
    public void modificarEspecialidad(Especialidad especialidad){
    
        String QUERY= "UPDATE especialidad SET especialidad = ? WHERE idEspecialidad = ?";
        
         PreparedStatement ps = null;
         
        try {
            ps= nuevaConexion.prepareStatement(QUERY);
            ps.setString(1, especialidad.getEspecialidad());
            ps.setInt(2,especialidad.getIdEspecialidad());
            
             int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Especialidad Modificada ");
            } else {
                JOptionPane.showMessageDialog(null, " La Especialidad  No Existe ");
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Especialidad");
        }
    }
    
}
