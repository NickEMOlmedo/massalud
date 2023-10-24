package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Afiliado;
import modelo.Orden;
import modelo.Prestador;

public class OrdenData {

    private Connection nuevaConexion = null;

    static boolean conexionExitosa;

    private AfiliadoData afiData = new AfiliadoData();
    private PrestadorData presData = new PrestadorData();

    public OrdenData() {

        nuevaConexion = Conexion.getConexion();

        if (nuevaConexion != null) {

            conexionExitosa = true;
        }
    }

    public static boolean conexionExitosa() {

        return conexionExitosa;

    }

    public void cargarOrden(Orden orden) {

        final String QUERY = "INSERT INTO orden(fecha,formaPago,importe,idAfiliado,idPrestador)"
                + "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS);

            statement.setDate(1, Date.valueOf(orden.getFecha()));
            statement.setString(2, orden.getFormaPago());
            statement.setDouble(3, orden.getImporte());
            statement.setInt(4, orden.getAfiliado().getIdAfiliado());
            statement.setInt(5, orden.getPrestador().getIdPrestador());

            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();

            if (result.next()) {

                orden.setIdOrden(result.getInt(1));
                JOptionPane.showMessageDialog(null, "¡Orden cargada satisfactoriamente!");
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
    }

    public ArrayList<Orden> Orden_EmitidaPorFecha(LocalDate fecha) {
        ArrayList<Orden> ordenesF = new ArrayList();
        final String QUERY = "SELECT * FROM orden WHERE fecha = ? ";
        Orden orden = null;
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setDate(1, Date.valueOf(fecha));
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                orden = new Orden();
                orden.setIdOrden(result.getInt("idOrden"));
                orden.setFecha(result.getDate("fecha").toLocalDate());
                orden.setFormaPago(result.getString("formaPago"));
                orden.setImporte(result.getDouble("importe"));
                Afiliado afiliado = afiData.buscarAfiliado_id(result.getInt("idAfiliado"));
                Prestador prestador = presData.buscarPrestador_id(result.getInt("idPrestador"));
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);
                ordenesF.add(orden);
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
        return ordenesF;

    }

    public ArrayList<Orden> Orden_SacadasPorAfiliado(int idAfiliado) {

        ArrayList<Orden> ordenesA = new ArrayList();
        final String QUERY = "SELECT * FROM orden WHERE idAfiliado = ? ";
        Orden orden = null;
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, idAfiliado);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                orden = new Orden();
                orden.setIdOrden(result.getInt("idOrden"));
                orden.setFecha(result.getDate("fecha").toLocalDate());
                orden.setFormaPago(result.getString("formaPago"));
                orden.setImporte(result.getDouble("importe"));
                Afiliado afiliado = afiData.buscarAfiliado_id(result.getInt("idAfiliado"));
                Prestador prestador = presData.buscarPrestador_id(result.getInt("idPrestador"));
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);
                ordenesA.add(orden);
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
        return ordenesA;
    }

    public ArrayList<Orden> Orden_SacadasSegunPrestador(int idPrestador) {

        ArrayList<Orden> ordenesP = new ArrayList();
        final String QUERY = "SELECT * FROM orden WHERE idPrestador = ? ";
        Orden orden = null;
        try {
            PreparedStatement statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, idPrestador);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                orden = new Orden();
                orden.setIdOrden(result.getInt("idOrden"));
                orden.setFecha(result.getDate("fecha").toLocalDate());
                orden.setFormaPago(result.getString("formaPago"));
                orden.setImporte(result.getDouble("importe"));
                Afiliado afiliado = afiData.buscarAfiliado_id(result.getInt("idAfiliado"));
                Prestador prestador = presData.buscarPrestador_id(result.getInt("idPrestador"));
                orden.setAfiliado(afiliado);
                orden.setPrestador(prestador);
                ordenesP.add(orden);
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }
        return ordenesP;

    }

    public void eliminarOrden(int idAfiliado, int idPrestador) {

        final String QUERY = "DELETE FROM orden WHERE idAfiliado=? AND idPrestador=?";
        PreparedStatement statement;
        try {
            statement = nuevaConexion.prepareStatement(QUERY);
            statement.setInt(1, idAfiliado);
            statement.setInt(2, idPrestador);

            int fila = statement.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "¡Orden eliminada satisfactoriamente!");
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se pudo realizar la operacion, intente nuevamente! ERROR: " + ex);
        }

    }
}
