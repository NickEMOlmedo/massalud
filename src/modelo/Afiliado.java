
package modelo;


public class Afiliado {
    
    private int idAfiliado;
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private boolean activo;

    public Afiliado() {
    }

    public Afiliado(int idAfiliado, String nombre, String apellido, int dni, int telefono, boolean activo) {
        this.idAfiliado = idAfiliado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }

    public Afiliado(String nombre, String apellido, int dni, int telefono, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
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

    @Override
    public String toString() {
        return "AFILIADO: " + "ID: " + idAfiliado + " NOMBRE: " + nombre + " APELLIDO: " + apellido + " DNI: " + dni + " TELEFONO: " + telefono + " ACTIVO: " + activo;
    }

    
}
