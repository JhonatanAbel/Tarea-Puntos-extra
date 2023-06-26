package Tareas.tareaPoo;

import java.sql.*;

public class ConexionBaseDeDatos {
    public void obtenerEstudiante(){
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo?characterEncoding=UTF-8", "root", "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes");
            while (rs.next()) {
                System.out.println(rs.getString("nombres") + " " + rs.getString("apellidos"));
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void obtenerEstudianteApellido(String apellido) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo?characterEncoding=UTF-8", "root", "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes WHERE apellidos = '" + apellido + "'");
            while (rs.next()) {
                System.out.println(rs.getString("nombres") + " " + rs.getString("apellidos"));
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void obtenerEstudianteNombre(String nombre) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo?characterEncoding=UTF-8", "root", "admin");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiantes WHERE nombres = '" + nombre + "'");
            while (rs.next()) {
                System.out.println(rs.getString("nombres") + " " + rs.getString("apellidos"));
            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
