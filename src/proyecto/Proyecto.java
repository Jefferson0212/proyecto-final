/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import proyecto.Entidades.Mototaxi;
import proyecto.Pantalla.PantallaPrincipal;

public class Proyecto {

    public static List<Mototaxi> listaMototaxis = new ArrayList<>();
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
        
        PantallaPrincipal r = new PantallaPrincipal();
        r.setVisible(true);
    }
}

