package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            PreparedStatement ps = nuevaConexion.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS);
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
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
    }

    public void eliminarEspecialidad(int idEspecialidad, String especialidad) {

        String QUERY = "DELETE FROM especialidad WHERE idEspecialidad=? AND especialidad=?";

        try {
            PreparedStatement ps = nuevaConexion.prepareStatement(QUERY);

            ps.setInt(1, idEspecialidad);
            ps.setString(2, especialidad);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Especialidad Eliminada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
    }

    public Especialidad buscarEspecialidad(int id) {

        String QUERY = "SELECT especialidad FROM especialidad WHERE idEspecialidad=?";
        Especialidad especialista = null;
        try {
            PreparedStatement ps = nuevaConexion.prepareStatement(QUERY);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                especialista = new Especialidad();
                especialista.setIdEspecialidad(id);
                especialista.setEspecialidad(rs.getString("especialidad"));
            } else {
                JOptionPane.showMessageDialog(null, " No esxiste esa Especialidaad");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
        return especialista;
    }

    public void modificarEspecialidad(Especialidad especialidad) {

        String QUERY = "UPDATE especialidad SET especialidad = ? WHERE idEspecialidad = ?";

        PreparedStatement ps = null;

        try {
            ps = nuevaConexion.prepareStatement(QUERY);
            ps.setString(1, especialidad.getEspecialidad());
            ps.setInt(2, especialidad.getIdEspecialidad());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Especialidad Modificada ");
            } else {
                JOptionPane.showMessageDialog(null, " La Especialidad  No Existe ");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
    }

    public ArrayList<Especialidad> listarActivos() {

        final String QUERY = "SELECT idEspecialidad, especialidad FROM especialidad WHERE activo = 1";

        ArrayList<Especialidad> listaEspecialidad = new ArrayList<>();

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    Especialidad especialidad = new Especialidad();
                    especialidad.setIdEspecialidad(result.getInt("idEspecialidad"));
                    especialidad.setEspecialidad(result.getString("especialidad"));

                    listaEspecialidad.add(especialidad);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
        return listaEspecialidad;
    }

    public ArrayList<Especialidad> listarInActivos() {

        final String QUERY = "SELECT idEspecialidad, especialidad FROM especialidad WHERE activo = 0";

        ArrayList<Especialidad> listaEspecialidad = new ArrayList<>();

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    Especialidad especialidad = new Especialidad();
                    especialidad.setIdEspecialidad(result.getInt("idEspecialidad"));
                    especialidad.setEspecialidad(result.getString("especialidad"));

                    listaEspecialidad.add(especialidad);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
        return listaEspecialidad;
    }

    public boolean especialidadExiste(String especialidad) {
        boolean yaExiste = false;
        final String QUERY = "SELECT COUNT(*) FROM especialidad WHERE especialidad = ? AND activo = 1 ";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setString(1, especialidad);
            ResultSet result = statement.executeQuery();
            if (result.next()) {

                int count = result.getInt(1);
                yaExiste = (count > 0);
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);
        }
        return yaExiste;

    }
    
    public void eliminarEspecialidad(int id) {

        final String QUERY = "UPDATE especialidad SET activo = 0 WHERE idEspecialidad = ?";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            int envioExitoso = statement.executeUpdate();
            if (envioExitoso == 1) {

                JOptionPane.showMessageDialog(null, "¡La especialidad se dio de baja satisfactoriamente!");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);

        }

    }

    public void recuperarEspecialidad(int id) {

        final String QUERY = "UPDATE especialidad SET activo = 1 WHERE idEspecialidad = ?";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            int envioExitoso = statement.executeUpdate();
            if (envioExitoso == 1) {

                JOptionPane.showMessageDialog(null, "¡La especialidad se dio de alta satisfactoriamente!");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);

        }

    }

}
