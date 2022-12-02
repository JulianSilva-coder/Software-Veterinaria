package co.edu.unbosque.persistence;

import co.edu.unbosque.connection.Connection_Local;
import co.edu.unbosque.model.Paciente;

import java.sql.PreparedStatement;

public class PacienteDAO {

    Connection_Local conexion = new Connection_Local();
    Paciente p = new Paciente();

    public int registrar(Paciente p) throws Exception{
        String SQL = "INSERT INTO PACIENTE (CEDULA_MASCOTA, CEDULA_DUEÑO, NOMBRE_MASCOTA, NOMBRE_DUEÑO, TELEFONO, DIRECCION, ESPECIE, RAZA, GENERO, ESTERILIZADO, EDAD) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conexion.establecerConexion().prepareStatement(SQL);

        ps.setLong(1, p.getCedula_mascota());
        ps.setLong(2, p.getCedula_dueño());
        ps.setString(3, p.getNombre_mascota());
        ps.setString(4, p.getNombre_dueño());
        ps.setLong(5, p.getTelefono());
        ps.setString(6, p.getDireccion());
        ps.setString(7, p.getEspecie());
        ps.setString(8, p.getRaza());
        ps.setString(9, p.getGenero());
        ps.setBoolean(10, p.getEsterilizado());
        ps.setInt(11, p.getEdad());

        int resultado = ps.executeUpdate();

        conexion.DesconectarBD();

        return resultado;
    }
}