package modelo;

public class Especialidad {

    private int idEspecialidad;
    private String especialidad;
    private boolean activo;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String especialidad, boolean activo) {
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public Especialidad(String especialidad, boolean activo) {
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return especialidad;
    }

}
