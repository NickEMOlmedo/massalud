package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Afiliado;

public class AfiliadoData {

    private Connection nuevaConexion = null;

    static boolean conexionExitosa;

    public AfiliadoData() {

        //Probamos si la conexion se ha realizado correctamente y lo almacenamos en una variable.
        nuevaConexion = Conexion.getConexion();

        if (nuevaConexion != null) {

            conexionExitosa = true;

        }
    }

    public static boolean conexionExitosa() {

        return conexionExitosa;

    }

    //Metodo que guarda un nuevo afiliado en la base de datos.
    public void guardarAfiliado(Afiliado afiliado) {

        final String QUERY = "INSERT INTO afiliado(nombre,apellido,dni,domicilio,telefono,activo)"
                + "VALUES(?,?,?,?,?,?)";

        //Cargamos los datos en el statement y procedemos a enviarlos.
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, afiliado.getNombre());
            statement.setString(2, afiliado.getApellido());
            statement.setInt(3, afiliado.getDni());
            statement.setString(4, afiliado.getDomicilio());
            statement.setLong(5, afiliado.getTelefono());
            statement.setBoolean(6, afiliado.isActivo());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();

            //Verificamos si existen resultados en el resultset y agregamos el id al afiliado.
            if (result.next()) {

                afiliado.setIdAfiliado(result.getInt(1));

                JOptionPane.showMessageDialog(null, "¡El afiliado se agrego satisfactoriamente!");
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

    }

    //Metodo que setea el campo "activo" de la tabla "afiliado" en 0, esta accion genera que el afiliado figure como eliminado.
    public void eliminarAfiliado(int id) {

        final String QUERY = "UPDATE afiliado SET activo = 0 WHERE idAfiliado = ?";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            int envioExitoso = statement.executeUpdate();
            if (envioExitoso == 1) {

                JOptionPane.showMessageDialog(null, "¡El afiliado se dio de baja satisfactoriamente!");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

    }

    public void recuperarAfiliado(int id) {

        final String QUERY = "UPDATE afiliado SET activo = 1 WHERE idAfiliado = ?";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            int envioExitoso = statement.executeUpdate();
            if (envioExitoso == 1) {

                JOptionPane.showMessageDialog(null, "¡El afiliado se dio de alta satisfactoriamente!");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

    }

    //Metodo que nos permite la modificacion de los datos de un afiliado.
    public void modificarAfiliado(Afiliado afiliado) {

        final String QUERY = "UPDATE afiliado SET nombre = ?, apellido = ?, dni = ?, domicilio = ?, telefono = ?, activo = ? WHERE idAfiliado = ? ";

        try {
            PreparedStatement statement;
            statement = nuevaConexion.prepareStatement(QUERY);
            statement.setString(1, afiliado.getNombre());
            statement.setString(2, afiliado.getApellido());
            statement.setInt(3, afiliado.getDni());
            statement.setString(4, afiliado.getDomicilio());
            statement.setLong(5, afiliado.getTelefono());
            statement.setBoolean(6, afiliado.isActivo());
            statement.setInt(7, afiliado.getIdAfiliado());
            int updateExitoso = statement.executeUpdate();
            if (updateExitoso == 1) {

                JOptionPane.showMessageDialog(null, "!Se modificaron los datos del afiliado Satisfactoriamente!");
                
            } else {

                JOptionPane.showMessageDialog(null, "!Error al Modificar los Datos del Afiliado, intente Nuevamente!");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }

    }

    public ArrayList<Afiliado> listarActivos() {

        final String QUERY = "SELECT idAfiliado, nombre, apellido, dni, domicilio, telefono FROM afiliado WHERE activo = 1 ";

        ArrayList<Afiliado> listaAfiliados = new ArrayList<>();

        try {

            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    Afiliado afiliado = new Afiliado();
                    afiliado.setIdAfiliado(result.getInt("idAfiliado"));
                    afiliado.setNombre(result.getString("nombre"));
                    afiliado.setApellido(result.getString("apellido"));
                    afiliado.setDni(result.getInt("dni"));
                    afiliado.setDomicilio(result.getString("domicilio"));
                    afiliado.setTelefono(result.getLong("telefono"));
                    afiliado.setActivo(true);

                    listaAfiliados.add(afiliado);
                }
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

        return listaAfiliados;

    }

    public ArrayList<Afiliado> listarInActivos() {

        final String QUERY = "SELECT idAfiliado, nombre, apellido, dni, domicilio, telefono FROM afiliado WHERE activo = 0 ";

        ArrayList<Afiliado> listaAfiliados = new ArrayList<>();

        try {

            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    Afiliado afiliado = new Afiliado();
                    afiliado.setIdAfiliado(result.getInt("idAfiliado"));
                    afiliado.setNombre(result.getString("nombre"));
                    afiliado.setApellido(result.getString("apellido"));
                    afiliado.setDni(result.getInt("dni"));
                    afiliado.setDomicilio(result.getString("domicilio"));
                    afiliado.setTelefono(result.getLong("telefono"));
                    afiliado.setActivo(true);

                    listaAfiliados.add(afiliado);
                }
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

        return listaAfiliados;

    }

    public Afiliado buscarAfiliado_id(int id) {

        Afiliado afiliado = null;

        final String QUERY = "SELECT idAfiliado, nombre, apellido, dni, domicilio, telefono, activo FROM afiliado WHERE idAfiliado = ? && activo = 1";

        try {

            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(result.getInt("idAfiliado"));
                afiliado.setNombre(result.getString("nombre"));
                afiliado.setApellido(result.getString("apellido"));
                afiliado.setDni(result.getInt("dni"));
                afiliado.setDomicilio(result.getString("domicilio"));
                afiliado.setTelefono(result.getLong("telefono"));
                afiliado.setActivo(result.getBoolean("activo"));

            } else {

                JOptionPane.showMessageDialog(null, "¡El afiliado no existe!");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

        }

        return afiliado;

    }

    public Afiliado buscarAfiliado_dni(int dni) {

        Afiliado afiliado = null;

        final String QUERY = "SELECT idAfiliado, nombre, apellido, dni, domicilio, telefono, activo FROM afiliado WHERE dni = ? ";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, dni);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                afiliado = new Afiliado();
                afiliado.setIdAfiliado(result.getInt("idAfiliado"));
                afiliado.setNombre(result.getString("nombre"));
                afiliado.setApellido(result.getString("apellido"));
                afiliado.setDni(dni);
                afiliado.setDomicilio(result.getString("domicilio"));
                afiliado.setTelefono(result.getLong("telefono"));
                afiliado.setActivo(result.getBoolean("activo"));

            } else {

                JOptionPane.showMessageDialog(null, "¡El afiliado no existe!");

            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);

            System.out.println(ex);

        }

        return afiliado;

    }

    public boolean afiliadoExiste(int dni) {
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

}
