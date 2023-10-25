package controlador;

import java.sql.Connection;
import modelo.Prestador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Especialidad;
import java.util.ArrayList;

public class PrestadorData {

    private Connection nuevaConexion = null;

    static boolean conexionExitosa;

    private EspecialidadData especialidadD = new EspecialidadData();

    public PrestadorData() {

        nuevaConexion = Conexion.getConexion();

        if (nuevaConexion != null) {

            conexionExitosa = true;

        }
    }

    public static boolean conexionExitosa() {
        return conexionExitosa;
    }
    //Metodo que guarda un nuevo Prestador a la base de datos

    public void guardarPrestador(Prestador prestador) {

        String QUERY = "INSERT INTO prestador(nombre,apellido,dni,domicilio,telefono,activo,idEspecialidad)"
                + " VALUES(?,?,?,?,?,?,?)";

        //Cargamos los datos en el statement y procedemos a enviarlos.
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, prestador.getNombre());
            statement.setString(2, prestador.getApellido());
            statement.setInt(3, prestador.getDni());
            statement.setString(4, prestador.getDomicilio());
            statement.setLong(5, prestador.getTelefono());
            statement.setBoolean(6, prestador.isActivo());
            statement.setInt(7, prestador.getEspecialidad().getIdEspecialidad());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();

            //Verificamos si existen resultados en el resultset y agregamos el id al prestador.
            if (result.next()) {

                prestador.setIdPrestador(result.getInt(1));

                JOptionPane.showMessageDialog(null, "¡El prestador se agregó correctamente!");
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }

    }

    public ArrayList<Prestador> listarActivos() {

        final String QUERY = "SELECT idPrestador, nombre, apellido, dni, domicilio, telefono FROM prestador WHERE activo = 1 ";

        ArrayList<Prestador> listaPrestadores = new ArrayList<>();

        try {

            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    Prestador prestador = new Prestador();
                    prestador.setIdPrestador(result.getInt("idPrestador"));
                    prestador.setNombre(result.getString("nombre"));
                    prestador.setApellido(result.getString("apellido"));
                    prestador.setDni(result.getInt("dni"));
                    prestador.setDomicilio(result.getString("domicilio"));
                    prestador.setTelefono(result.getLong("telefono"));
                    prestador.setActivo(true);

                    listaPrestadores.add(prestador);
                }
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "!Error al Modificar los Datos del Prestador, intente Nuevamente! " + ex);

        }

        return listaPrestadores;

    }

    public ArrayList<Prestador> listarInActivos() {

        final String QUERY = "SELECT idPrestador, nombre, apellido, dni, domicilio, telefono FROM prestador WHERE activo = 0 ";

        ArrayList<Prestador> listaPrestadores = new ArrayList<>();

        try {

            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    Prestador prestador = new Prestador();
                    prestador.setIdPrestador(result.getInt("idPrestador"));
                    prestador.setNombre(result.getString("nombre"));
                    prestador.setApellido(result.getString("apellido"));
                    prestador.setDni(result.getInt("dni"));
                    prestador.setDomicilio(result.getString("domicilio"));
                    prestador.setTelefono(result.getLong("telefono"));
                    prestador.setActivo(true);

                    listaPrestadores.add(prestador);
                }
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

        return listaPrestadores;

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

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

    }
     public void recuperarPrestador(int id) {

        final String QUERY = "UPDATE afiliado SET activo = 1 WHERE idPrestador = ?";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            int envioExitoso = statement.executeUpdate();
            if (envioExitoso == 1) {

                JOptionPane.showMessageDialog(null, "¡El prestador se dio de alta satisfactoriamente!");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

    }

    // Metodo que permite MODIFICAR un Prestador
    public void modificarPrestador(Prestador prestador) {

        String QUERY = "UPDATE prestador SET nombre = ?,apellido = ?,dni = ?,domicilio = ?,telefono = ?,activo  =?,idEspecialidad =? WHERE idPrestador=?";
        //Cargamos los datos en el statement
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setString(1, prestador.getNombre());
            statement.setString(2, prestador.getApellido());
            statement.setInt(3, prestador.getDni());
            statement.setString(4, prestador.getDomicilio());
            statement.setLong(5, prestador.getTelefono());
            statement.setBoolean(6, prestador.isActivo());
            statement.setInt(7, prestador.getEspecialidad().getIdEspecialidad());
            statement.setInt(8, prestador.getIdPrestador());
            int updateExitoso = statement.executeUpdate();
            if (updateExitoso == 1) {

                JOptionPane.showMessageDialog(null, "!Se modificaron los datos del Prestador correctamente!");
            } else {

                JOptionPane.showMessageDialog(null, "!Error al Modificar los Datos del Prestador, intente Nuevamente!");

            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
    }

    public Prestador buscarPrestadorApellido(String apellido) {

        String QUERY = "SELECT idPrestador, nombre,apellido,dni, domicilio, telefono,activo,idEspecialidad FROM prestador WHERE apellido = ? AND activo = 1";
        Prestador prestador = null;

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);

            statement.setString(1, apellido);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                prestador = new Prestador();

                prestador.setIdPrestador(result.getInt("idPrestador"));
                prestador.setNombre(result.getString("nombre"));
                prestador.setApellido(result.getString("apellido"));
                prestador.setDni(result.getInt("dni"));
                prestador.setDomicilio(result.getString("domicilio"));
                prestador.setTelefono(result.getLong("telefono"));
                prestador.setActivo(true);
                Especialidad especialidad = especialidadD.buscarEspecialidad(result.getInt("idEspecialidad"));
                prestador.setEspecialidad(especialidad);
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese prestador");

            }
            statement.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
        return prestador;
    }

    public Prestador buscarPrestador_id(int id) {

        Prestador prestador = null;

        final String QUERY = "SELECT idPrestador, nombre, apellido, dni, domicilio, telefono, activo,idEspecialidad FROM prestador WHERE idPrestador = ? AND activo = 1";

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
                prestador.setTelefono(result.getLong("telefono"));
                prestador.setActivo(result.getBoolean("activo"));
                Especialidad especialidad = especialidadD.buscarEspecialidad(result.getInt("idEspecialidad"));
                prestador.setEspecialidad(especialidad);

            } else {

                JOptionPane.showMessageDialog(null, "¡El prestador no existe!");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

        return prestador;
    }

    public boolean prestadorExiste(int dni) {
        boolean yaExiste = false;

        final String QUERY = "SELECT COUNT(*) FROM afiliado WHERE dni = ? AND activo = 1 ";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, dni);
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
    
    public Prestador buscarPrestador_especialidad(int idEspecialidad) {

        String QUERY = "SELECT idPrestador, nombre,apellido,dni, domicilio, telefono,activo,idEspecialidad FROM prestador WHERE idEspecialidad = ? AND activo = 1";
        Prestador prestador = null;

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);

            statement.setInt(1, idEspecialidad);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                prestador = new Prestador();

                prestador.setIdPrestador(result.getInt("idPrestador"));
                prestador.setNombre(result.getString("nombre"));
                prestador.setApellido(result.getString("apellido"));
                prestador.setDni(result.getInt("dni"));
                prestador.setDomicilio(result.getString("domicilio"));
                prestador.setTelefono(result.getLong("telefono"));
                prestador.setActivo(true);
                Especialidad especialidad = especialidadD.buscarEspecialidad(result.getInt("idEspecialidad"));
                prestador.setEspecialidad(especialidad);
            } else {
                JOptionPane.showMessageDialog(null, "¡No existen prestadores para esa especialidad!");

            }
            statement.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
        return prestador;
    }
}
