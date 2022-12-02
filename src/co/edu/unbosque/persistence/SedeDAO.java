package co.edu.unbosque.persistence;

import co.edu.unbosque.connection.Connection_Local;
import co.edu.unbosque.model.Sede;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SedeDAO {


    Connection_Local conexion = new Connection_Local();

    Connection conect;
    Sede sede;

    PreparedStatement ps;

    ResultSet rs;

    public List sedelista() {
        String SQL = "SELECT * FROM SEDE;";
        ArrayList<Sede> datos = new ArrayList<>();
        try {
            conect = conexion.establecerConexion();
            ps = conect.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                sede = new Sede();
                sede.setId(rs.getInt(1));
                sede.setNombre(rs.getString(2));
                datos.add(sede);
            }
        } catch (Exception e) {
        }
        return datos;
    }
}
