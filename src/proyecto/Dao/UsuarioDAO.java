/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto.ConexionBD;
import proyecto.Entidades.Usuario;

public class UsuarioDAO {

    public void RegistrarUsuario(Usuario usu) {
        //instanciar la clase conectar..
        ConexionBD cn = new ConexionBD();
        //realizamos la cadena en mysql...
        String sql = "INSERT INTO usuarios (nombre, apellido, email, clave, tipo_usuario) VALUES (?, ?, ?, ?, ?)";
        //aplicamos la interface preparedstatement para base de datos...
        PreparedStatement ps = null;
        //asignamos la conexion y cadena...
        try {
            ps = cn.conectar().prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setString(3, usu.getEmail());
            ps.setString(4, usu.getClave());
            ps.setString(5, usu.getTipoUsuario());
            //ejecutamos
            int filasInsertadas = ps.executeUpdate();

            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR EL USUARIO");
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR EL USUARIO: " + e.getMessage());
        }
    }
    
    public String obtenerTipoUsuario(String email, String clave) {
        ConexionBD cn = new ConexionBD();
        String sql = "SELECT tipo_usuario FROM usuarios WHERE email = ? AND clave = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        String tipoUsuario = null;

        try {
            ps = cn.conectar().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, clave);
            rs = ps.executeQuery();

            if (rs.next()) {
                tipoUsuario = rs.getString("tipo_usuario");
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener tipo de usuario: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexión: " + e.getMessage());
            }
        }

        return tipoUsuario;
    }
}
