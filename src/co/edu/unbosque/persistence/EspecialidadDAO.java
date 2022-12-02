package co.edu.unbosque.persistence;

import co.edu.unbosque.connection.Connection_Local;
import co.edu.unbosque.model.Especialidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadDAO {

    Connection_Local conexion = new Connection_Local();

    Connection conect;
    Especialidad especial;

    PreparedStatement ps;

    ResultSet rs;

    public List especialidadlista() {
        String SQL = "SELECT * FROM ESPECIALIDAD;";
        ArrayList<Especialidad> datos = new ArrayList<>();
        try {
            conect = conexion.establecerConexion();
            ps = conect.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                especial = new Especialidad();
                especial.setId(rs.getInt(1));
                especial.setNombre(rs.getString(2));
                datos.add(especial);
            }
        } catch (Exception e) {
        }
        return datos;
    }
}
