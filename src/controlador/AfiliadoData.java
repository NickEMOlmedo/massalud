
package controlador;

import java.sql.Connection;

/**
 *
 * @author @NickEMOlmedo
 */
public class AfiliadoData {
    
    private Connection nuevaConexion = null;
    
    static boolean conexionExitosa;

    public AfiliadoData() {
        
        nuevaConexion = Conexion.getConexion();
        
        if (nuevaConexion != null){
            
            conexionExitosa = true;
            
        }
        
    }
    
    
    
    
    
}
