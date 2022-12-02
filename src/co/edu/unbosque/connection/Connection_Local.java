package co.edu.unbosque.connection;

import javax.swing.*;
import java.sql.*;

public class Connection_Local {
    public Connection conexion;
    public String usuario;
    public String contrasena;
    public Statement sentencia;

    public Connection_Local(){
        conexion = null;
        usuario = "ilrsscimpancis";
        contrasena = "24f166a0abbd3f0c923f4bc7228e4d3427fe7e7ba57192f7c0faea7013942272";
        sentencia = null;

    }
    String cadena = "jdbc:postgresql://ec2-54-174-31-7.compute-1.amazonaws.com:5432/d47dershmbtqb";

    public Connection establecerConexion() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(cadena, usuario, contrasena);
            System.out.println("La base de datos esta conectada");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, Error: " + e.toString());
        }
        return conexion;
    }
    public void DesconectarBD() throws Exception{
        try{
            conexion.close();
        }catch (Exception e){
            throw new Exception("ERROR AL DESCONECTAR LA BD");
        }
    }
}
