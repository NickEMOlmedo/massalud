package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Afiliado;

/**
 *
 * @author @NickEMOlmedo
 */
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

    public void guardarAfiliado(Afiliado afiliado) {

        String QUERY = "INSERT INTO afiliado(nombre,apellido,dni,domicilio,telefono)"
                + " VALUES(?,?,?,?,?)";

        //Cargamos los datos en el statement y procedemos a enviarlos.
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setString(1, afiliado.getNombre());
            statement.setString(2, afiliado.getApellido());
            statement.setInt(3, afiliado.getDni());
            statement.setString(4, afiliado.getDomicilio());
            statement.setInt(5, afiliado.getTelefono());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();

            //Verificamos si existen resultados en el resultset y agregamos el id al afiliado.
            if (result.next()) {

                afiliado.setIdAfiliado(result.getInt(1));

                JOptionPane.showMessageDialog(null, "¡El afiliado se agrego satisfactoriamente!");
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! " + ex);

        }

    }

    public void eliminarAfiliado(int id) {

        String QUERY = "UPDATE afiliado SET activo = 0 WHERE idAfiliado = ?";

        try {

            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, id);

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente!");

        }

    }

    public void listarAfiliados() {

    }

}
