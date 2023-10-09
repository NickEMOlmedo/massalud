
package controlador;

import static controlador.EspecialidadData.conexionExitosa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Orden;


public class OrdenData {
    
    private Connection nuevaConexion = null;

    static boolean conexionExitosa;
    
    AfiliadoData afiData;
    PrestadorData presData;
    
    public OrdenData(){
    
         nuevaConexion = Conexion.getConexion();

        if (nuevaConexion != null) {

            conexionExitosa = true;
        }
    }
    
    public static boolean conexionExitosa() {

        return conexionExitosa;

    }
    
    public void cargarOrden(Orden orden){
    
        final String QUERY="INSERT INTO orden(fecha,formaPago,importe,idAfiliado,idPrestador)"
                + "VALUES(?,?,?,?,?)";
        
        try {
            PreparedStatement statement=nuevaConexion.prepareStatement(QUERY,Statement.RETURN_GENERATED_KEYS);
            
            statement.setDate(1,Date.valueOf(orden.getFecha()));
            statement.setString(2,orden.getFormaPago());
            statement.setDouble(3,orden.getImporte());
            statement.setInt(4,orden.getAfiliado().getIdAfiliado());
            statement.setInt(5,orden.getPrestador().getIdPrestador());
            
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            
            if(result.next()){
            
                orden.setIdOrden(result.getInt(1));
                JOptionPane.showMessageDialog(null,"Orden Cargada");
            }
            statement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla Orden");
        }
    }
}
