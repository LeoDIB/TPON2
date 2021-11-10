package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author leonardo dibiagi
 */
// Hacemos el mapping de cada uno de los atributos y la propia clase
@Entity
public class Cliente implements Serializable {

    //Declaramos todos los atributos de nuestra clase
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String nroCliente;
    private String nombrePerro;
    private String razaPerro;
    private String colorPelaje;
    private String alergicoSi;
    private String atencionEspecialSi;
    private String nombreDuenio;
    private String celularDuenio;
    private String observacion;

    public Cliente() {
    }

    public Cliente(String nroCliente, String nombrePerro, String razaPerro, String colorPelaje, String alergicoSi, String atencionEspecialSi, String nombreDuenio, String celularDuenio, String observacion) {
        this.nroCliente = nroCliente;
        this.nombrePerro = nombrePerro;
        this.razaPerro = razaPerro;
        this.colorPelaje = colorPelaje;
        this.alergicoSi = alergicoSi;
        this.atencionEspecialSi = atencionEspecialSi;
        this.nombreDuenio = nombreDuenio;
        this.celularDuenio = celularDuenio;
        this.observacion = observacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getAlergicoSi() {
        return alergicoSi;
    }

    public String getAtencionEspecialSi() {
        return atencionEspecialSi;
    }

    public String getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(String nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String isAlergicoSi() {
        return alergicoSi;
    }

    public void setAlergicoSi(String alergicoSi) {
        this.alergicoSi = alergicoSi;
    }

    public String isAtencionEspecialSi() {
        return atencionEspecialSi;
    }

    public void setAtencionEspecialSi(String atencionEspecialSi) {
        this.atencionEspecialSi = atencionEspecialSi;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

   
}
