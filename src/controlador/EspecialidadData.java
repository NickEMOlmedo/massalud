
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Especialidad;

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
            PreparedStatement ps = nuevaConexion.prepareStatement(QUERY);
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
    
}
