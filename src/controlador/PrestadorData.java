
package controlador;

import java.sql.Connection;

/**
 *
 * @author Nickolas
 */
public class PrestadorData {
   
    private Connection nuevaConexion = null;
    
    static boolean conexionExitosa;
    
    public PrestadorData(){
        
        nuevaConexion= Conexion.getConexion();
        
        if (nuevaConexion != null) {

            conexionExitosa = true;
    
    }
    }
    public static boolean conexionExitosa(){
        return conexionExitosa;
    }
    
    
    }

