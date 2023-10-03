
package modelo;

import java.time.LocalDate;


public class Orden {
   
    private int idOrden;
    private LocalDate fecha;
    private String formaPago;
    private double importe;
    private Afiliado idAfiliado;
    private Prestador idPrestador;

    public Orden() {
    }

    public Orden(int idOrden, LocalDate fecha, String formaPago, double importe, Afiliado idAfiliado, Prestador idPrestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.idAfiliado = idAfiliado;
        this.idPrestador = idPrestador;
    }

    public Orden(LocalDate fecha, String formaPago, double importe, Afiliado idAfiliado, Prestador idPrestador) {
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.idAfiliado = idAfiliado;
        this.idPrestador = idPrestador;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Afiliado getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(Afiliado idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public Prestador getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Prestador idPrestador) {
        this.idPrestador = idPrestador;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", fecha=" + fecha + ", formaPago=" + formaPago + ", importe=" + importe + ", idAfiliado=" + idAfiliado + ", idPrestador=" + idPrestador + '}';
    }
    
    
}
