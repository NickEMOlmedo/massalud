 package modelo;


/**
 *
 * @author @Fabiana76
 */
public class Prestador {
    
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private int telefono;

   
    private boolean activo;
    private Especialidad especialidad;

    public Prestador() {}

    public Prestador(int idPrestador, String nombre, String apellido, int dni,String domicilio,int telefono, boolean activo, Especialidad especialidad) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio=domicilio;
        this.telefono = telefono;
        this.activo = activo;
        this.especialidad = especialidad;
    }

    public Prestador(String nombre, String apellido, int dni,String domicilio,int telefono, boolean activo, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio=domicilio;
        this.telefono = telefono;
        this.activo = activo;
        this.especialidad = especialidad;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "PRESTADOR: " + "ID: " + idPrestador + " NOMBRE: " + nombre + " APELLIDO: " + apellido + " DNI: " + dni + "DOMICILIO:  " +domicilio +"TELEFONO: "+ telefono + "ACTIVO: " + activo + " ESPECIALIDAD: " + especialidad;
    }
    
    
    
    
    
    
}
