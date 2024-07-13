/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private Connection cn;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Asegúrate de usar el driver correcto
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_usuarios", "root", "");
            System.out.println("Conectado a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR DE CONEXION BD: " + e.getMessage());
        }
        return cn;
    }
}
