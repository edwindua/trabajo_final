package co.udec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    Connection conectar = null;
    Connection conectar1 = null;
    String Database = "crud";
    String User = "root";
    String Password = "edwin";

    public Connection conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/" + Database, User, Password);
            //Mensaje a usuario 
            JOptionPane.showMessageDialog(null, "BIENVENIDOS A LA BASE DE DATOS", "Conexion", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException Obj1) {
            //Mensaje a usuario 
            JOptionPane.showMessageDialog(null, "NO HA PODIDO INGRESAR A LA BASE DE DATOS " + Obj1, "Conexion", JOptionPane.ERROR_MESSAGE);
        }

        return conectar;
    }

    public Connection Conectar1() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/" + Database, User, Password);
        } catch (ClassNotFoundException | SQLException Obj1) {

        }

        return conectar1;
    }

}
