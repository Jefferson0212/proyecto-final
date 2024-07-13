/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Entidades;


public class MototaxiInformacion {
    private String licencia;
    private String fechaExpiracion;
    private String soat;

    public MototaxiInformacion(String licencia, String fechaExpiracion, String soat) {
        this.licencia = licencia;
        this.fechaExpiracion = fechaExpiracion;
        this.soat = soat;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }  
} 