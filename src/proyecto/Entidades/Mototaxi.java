/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Entidades;

public class Mototaxi {

    MototaxiDatosBasicos dataB;
    MototaxiDatosContactos dataC;
    MototaxiInformacion dataI;
    MototaxiPlaca dataP;

    // Constructor con todos los datos
    public Mototaxi(MototaxiDatosBasicos dataB, MototaxiDatosContactos dataC, MototaxiInformacion dataI, MototaxiPlaca dataP) {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataI = dataI;
        this.dataP = dataP;
    }

    // Constructor vacío
    public Mototaxi() {
    }

    // Constructor con datos básicos y contactos
    public Mototaxi(MototaxiDatosBasicos dataB, MototaxiDatosContactos dataC) {
        this.dataB = dataB;
        this.dataC = dataC;
    }

    // Getters y setters
    public MototaxiDatosBasicos getDataB() {
        return dataB;
    }

    public void setDataB(MototaxiDatosBasicos dataB) {
        this.dataB = dataB;
    }

    public MototaxiDatosContactos getDataC() {
        return dataC;
    }

    public void setDataC(MototaxiDatosContactos dataC) {
        this.dataC = dataC;
    }

    public MototaxiInformacion getDataI() {
        return dataI;
    }

    public void setDataI(MototaxiInformacion dataI) {
        this.dataI = dataI;
    }

    public MototaxiPlaca getDataP() {
        return dataP;
    }

    public void setDataP(MototaxiPlaca dataP) {
        this.dataP = dataP;
    }

    // Método para obtener texto descriptivo
    public String getTexto() {
        return "Nombre: " + dataB.getNombre() + "\n"
                + "Apellido: " + dataB.getApellido() + "\n"
                + "DNI: " + dataB.getDni() + "\n"
                + "Placa: " + dataP.getPlaca();
    }
}
