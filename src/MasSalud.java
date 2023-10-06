
import controlador.AfiliadoData;
import controlador.EspecialidadData;
import modelo.Afiliado;
import modelo.Especialidad;


public class MasSalud {

   
    public static void main(String[] args) {
    
//PRUEBA DE ESPECIALIDADDATA        
        //Guardar Especialidad
//        Especialidad medico= new Especialidad("Neurólogo");
//        EspecialidadData esp=new EspecialidadData();
//        esp.guardarEspecialidad(medico);


//PRUEBA DE AFILIADODATA
    //Guardar un afiliado
    //Afiliado jose=new Afiliado("Carlos","Gauna",29456090,"Junín 1800",15349099,true);
    AfiliadoData afil=new AfiliadoData();
    //afil.guardarAfiliado(jose);
   
   //Eliminar Afiliado
   //afil.eliminarAfiliado(4);
   
   //Modificar Afiliado
   Afiliado jose=new Afiliado(6,"Juan Carlos","Gauna",29456090,"Junín 1800",15349099,true);
   afil.modificarAfiliado(jose);
    }
    
}
