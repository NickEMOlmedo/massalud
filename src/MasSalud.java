
import controlador.AfiliadoData;
import controlador.EspecialidadData;
import controlador.OrdenData;
import controlador.PrestadorData;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import modelo.Afiliado;
import modelo.Especialidad;
import modelo.Orden;
import modelo.Prestador;
public class MasSalud {

    public static void main(String[] args) {

//PRUEBA DE ESPECIALIDAD DATA   

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

//PRUEBA DE AFILIADO DATA
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
//        EspecialidadData espD=new EspecialidadData();
//        Especialidad especialidad=espD.buscarEspecialidad(5);
//        Prestador juan= new Prestador( "Juan", "Sosa",2587963,"Corrientes",8976,true,especialidad);
//        PrestadorData prestD= new PrestadorData();
//        prestD.guardarPrestador(juan);
       
        
        //Eliminar un Prestador
       // prestD.eliminarPrestador(4);
        
        //Modificar un prestador
//        EspecialidadData espD=new EspecialidadData();
//         Especialidad especialidad=espD.buscarEspecialidad(2);
//        Prestador medico=new Prestador(2,"Pablo José","Escalante",18456799,"Av. Castelli 500",15433312,true,especialidad);
//        prestD.modificarPrestador(medico);
        
        
        //Buscar Prestador por Apellido
//        Prestador medico=prestD.buscarPrestadorApellido("Monte");
//        if(medico !=null){
//        System.out.println("ID: "+medico.getIdPrestador());
//        System.out.println("Nombre: "+medico.getNombre());
//        System.out.println("Apellido: "+medico.getApellido());
//        System.out.println("Telefono: "+medico.getTelefono());
//        }
        
        //Buscar Prestador por ID
//        Prestador medico=prestD.buscarPrestador_id(1);
//        if(medico!=null){
//        System.out.println("ID: "+medico.getIdPrestador());
//        System.out.println("Nombre: "+medico.getNombre());
//        System.out.println("Apellido: "+medico.getApellido());
//        System.out.println("Telefono: "+medico.getTelefono());
//        }

//PRUEBA DE ORDEN DATA

        //Cargar una Orden
        AfiliadoData afilD=new AfiliadoData();
        PrestadorData prestD=new PrestadorData();
        Afiliado afiliado=afilD.buscarAfiliado_id(8);
        Prestador prestador=prestD.buscarPrestador_id(7);
        OrdenData ordenD=new OrdenData();
        try{
        Orden orden=new Orden(LocalDate.of(2000, 05, 12),"Debito",3500,afiliado,prestador);
        ordenD.cargarOrden(orden);
        }catch(NullPointerException ex){
        
            JOptionPane.showMessageDialog(null,"Afiliado o Prestador Incorrecto");
        }
    }

}
