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
        final String QUERY = "INSERT INTO especialidad (especialidad,activo) VALUES(?,?)";

        //Cargamos los datos en el statement y procedemos a enviarlos..
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, especialidad.getEspecialidad());
            statement.setBoolean(2, especialidad.isActivo());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();

            //Verificamos si existen resultados en el resultset y agregamos el id...
            if (result.next()) {

                especialidad.setIdEspecialidad(result.getInt(1));
                JOptionPane.showMessageDialog(null, "¡La Especialidad se cargo satisfactoriamente!");
            }
            //Cerramos Statement...
            result.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
    }

    public void eliminarEspecialidad(int idEspecialidad, String especialidad) {

        final String QUERY = "DELETE FROM especialidad WHERE idEspecialidad=? AND especialidad=?";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);

            statement.setInt(1, idEspecialidad);
            statement.setString(2, especialidad);

            int filas = statement.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "¡Especialidad eliminada satisfactoriamente!");
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
    }

    public Especialidad buscarEspecialidad(int id) {

        final String QUERY = "SELECT especialidad FROM especialidad WHERE idEspecialidad=?";
        Especialidad especialista = null;
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {

                especialista = new Especialidad();
                especialista.setIdEspecialidad(id);
                especialista.setEspecialidad(result.getString("especialidad"));
            } else {
                JOptionPane.showMessageDialog(null, "¡La especialidad No Existe!");
            }
            result.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
        return especialista;
    }

    public void modificarEspecialidad(Especialidad especialidad) {

        String QUERY = "UPDATE especialidad SET especialidad = ? WHERE idEspecialidad = ?";

        PreparedStatement statement = null;

        try {
            statement = nuevaConexion.prepareStatement(QUERY);
            statement.setString(1, especialidad.getEspecialidad());
            statement.setInt(2, especialidad.getIdEspecialidad());

            int exito = statement.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "¡Especialidad Modificada!");
            } else {
                JOptionPane.showMessageDialog(null, "¡La especialidad No Existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
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
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
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
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
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
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
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

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

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

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

    }

}
