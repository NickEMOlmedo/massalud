
import controlador.AfiliadoData;
import controlador.EspecialidadData;
import controlador.PrestadorData;
import modelo.Afiliado;
import modelo.Especialidad;
import modelo.Prestador;
public class MasSalud {

    public static void main(String[] args) {

//PRUEBA DE ESPECIALIDADDATA   

        //Guardar Especialidad
//        Especialidad medico= new Especialidad("Neurólogo");
       // EspecialidadData esp = new EspecialidadData();
//        esp.guardarEspecialidad(medico);

        //Eliminar Especialidad
        //esp.eliminarEspecialidad(4,"Medico Clinico");
        
        //Buscar Especialidad por id
//         Especialidad  especialidadEncontrado = esp.buscarEspecialidad(3);
//             System.out.println("Medico :" +especialidadEncontrado.getEspecialidad());

        //Modificar Especialidad
        //Especialidad medico = new Especialidad(2, "Pediatra");
        //esp.modificarEspecialidad(medico);

//PRUEBA DE AFILIADODATA
        //Guardar un afiliado
        //Afiliado jose=new Afiliado("Carlos","Gauna",29456090,"Junín 1800",15349099,true);
      //AfiliadoData afil=new AfiliadoData();
        //afil.guardarAfiliado(jose);
        
        //Eliminar Afiliado
        //afil.eliminarAfiliado(4);
        
        //Modificar Afiliado
//      Afiliado jose=new Afiliado(6,"Juan Carlos","Gauna",29456090,"Junín 1800",15349099,true);
//      afil.modificarAfiliado(jose);

        //Listar Afiliados Activos
//        for(Afiliado afiliado:afil.listarActivos()){
//            System.out.println(afiliado.getIdAfiliado());
//            System.out.println(afiliado.getNombre());
//            System.out.println(afiliado.getApellido());
//            System.out.println(afiliado.getDni());
//            System.out.println(afiliado.getDomicilio());
//            System.out.println(afiliado.getTelefono());                   
//        }

        //Listar afiliados por ID
//        Afiliado afiliadoEncontrado= afil.buscarAfiliado_id(7);
//        System.out.println("apellido :"+afiliadoEncontrado.getApellido());
//        System.out.println("nombre :"+afiliadoEncontrado.getNombre());
//        System.out.println("DNI :"+afiliadoEncontrado.getDni());

        //Listar afiliados por DNI
//         Afiliado afiliadoEncontrado= afil.buscarAfiliado_dni(30748723);
//         System.out.println("apellido :"+afiliadoEncontrado.getApellido());
//         System.out.println("nombre :"+afiliadoEncontrado.getNombre());
//         System.out.println("DNI :"+afiliadoEncontrado.getDni());
         

// PRUEBA DE PRESTADOR DATA
        // Guardar un prestador
        EspecialidadData espD=new EspecialidadData();
        Especialidad especialidad=espD.buscarEspecialidad(5);
        Prestador juan= new Prestador( "Juan", "Sosa",2587963,"Corrientes",8976,true,especialidad);
        PrestadorData prestD= new PrestadorData();
        prestD.guardarPrestador(juan);
       
              
    }

}
