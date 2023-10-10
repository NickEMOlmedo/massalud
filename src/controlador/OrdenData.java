package controlador;

import static controlador.EspecialidadData.conexionExitosa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Afiliado;
import modelo.Orden;
import modelo.Prestador;

public class OrdenData {

    private Connection nuevaConexion = null;

    static boolean conexionExitosa;

    AfiliadoData afiData;
    PrestadorData presData;

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
                JOptionPane.showMessageDialog(null, "Orden Cargada");
            }
            statement.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Orden");
        }
    }
    
//    public ArrayList<Orden> Orden_EmitidaPrFecha(LocalDate fecha){
//     ArrayList<Orden> ordenesF=new ArrayList();
//        final String QUERY="SELECT * FROM orden WHERE fecha = ? ";
//        Orden orden= null;
//        try {
//            PreparedStatement statement=nuevaConexion.prepareStatement(QUERY);
//            statement.setDate(1, Date.valueOf("fecha"));
//            ResultSet result=statement.executeQuery();
//            while(result.next()){
//            orden=new Orden();
//            orden.setIdOrden(result.getInt("idOrden"));
//            orden.setFecha(result.getDate("fecha").toLocalDate());
//            orden.setFormaPago(result.getString("formaPago"));
//            orden.setImporte(result.getDouble("importe"));
//            Afiliado afiliado = afiData.buscarAfiliado_id(result.getInt("idAfiliado"));
//            Prestador prestador=presData.buscarPrestador(result.getInt("idPrestador"));//Verificar nombre del metodo buscarPrestador
//            orden.setAfiliado(afiliado);
//            orden.setPrestador(prestador);  
//            ordenesF.add(orden);
//            }
//            statement.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Orden");
//        }
//        return ordenesF;
//        
//    }
    
//    public ArrayList<Orden> Orden_SacadasPorAfilido(int idAfiliado){
//    
//        ArrayList<Orden> ordenesA=new ArrayList();
//        final String QUERY="SELECT * FROM orden WHERE idAfiliado = ? ";
//        Orden orden= null;
//        try {
//            PreparedStatement statement=nuevaConexion.prepareStatement(QUERY);
//            statement.setInt(1, idAfiliado);
//            ResultSet result=statement.executeQuery();
//            while(result.next()){
//            orden=new Orden();
//            orden.setIdOrden(result.getInt("idOrden"));
//            orden.setFecha(result.getDate("fecha").toLocalDate());
//            orden.setFormaPago(result.getString("formaPago"));
//            orden.setImporte(result.getDouble("importe"));
//            Afiliado afiliado = afiData.buscarAfiliado_id(result.getInt("idAfiliado"));
//            Prestador prestador=presData.buscarPrestador(result.getInt("idPrestador"));//Verificar nombre del metodo buscarPrestador
//            orden.setAfiliado(afiliado);
//            orden.setPrestador(prestador);  
//            ordenesA.add(orden);
//            }
//            statement.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Orden");
//        }
//        return ordenesA;
//    }
    
//    public ArrayList<Orden> Orden_SacadasSegunPrestador(int idPrestador){
//     
//         ArrayList<Orden> ordenesP=new ArrayList();
//        final String QUERY="SELECT * FROM orden WHERE idPrestador = ? ";
//        Orden orden= null;
//        try {
//            PreparedStatement statement=nuevaConexion.prepareStatement(QUERY);
//            statement.setInt(1, idPrestador);
//            ResultSet result=statement.executeQuery();
//            while(result.next()){
//            orden=new Orden();
//            orden.setIdOrden(result.getInt("idOrden"));
//            orden.setFecha(result.getDate("fecha").toLocalDate());
//            orden.setFormaPago(result.getString("formaPago"));
//            orden.setImporte(result.getDouble("importe"));
//            Afiliado afiliado = afiData.buscarAfiliado_id(result.getInt("idAfiliado"));
//            Prestador prestador=presData.buscarPrestador(result.getInt("idPrestador"));//Verificar nombre del metodo buscarPrestador
//            orden.setAfiliado(afiliado);
//            orden.setPrestador(prestador);  
//            ordenesP.add(orden);
//            }
//            statement.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Orden");
//        }
//        return ordenesP;
//        
//    }
}
