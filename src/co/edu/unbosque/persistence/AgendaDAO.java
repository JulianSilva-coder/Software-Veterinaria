package co.edu.unbosque.persistence;

import co.edu.unbosque.connection.Connection_Local;
import co.edu.unbosque.model.Agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgendaDAO {
    Connection_Local conexion = new Connection_Local();
    Connection conect;
    PreparedStatement ps;
    ResultSet rs;

    Agenda agenda;

    public int agendar(Agenda agenda) throws Exception {
        String SQL = "INSERT INTO AGENDA (ID, ID_PACIENTE, ID_EMPLEADO, HORA, FECHA) VALUES (?,?,?,?,?);";
        ps = conexion.establecerConexion().prepareStatement(SQL);
        ps.setInt(1,agenda.getId());
        ps.setLong(2,agenda.getId_paciente());
        ps.setLong(3,agenda.getId_empleado());
        ps.setString(5, agenda.getFecha());
        ps.setString(4, agenda.getHora());
        int resultado = ps.executeUpdate();
        conexion.DesconectarBD();

        return resultado;
    }
    public List leerAgenda (){
        ArrayList<Agenda> datos = new ArrayList<>();
        String SQL = "select * from agenda";
        try {
            conect = conexion.establecerConexion();
            ps = conect.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Agenda agenda = new Agenda();
                agenda.setId(rs.getInt(1));
                agenda.setId_paciente(rs.getLong(2));
                agenda.setId_empleado(rs.getLong(3));
                agenda.setFecha(rs.getString(4));
                agenda.setHora(rs.getString(5));
                datos.add(agenda);
                conexion.DesconectarBD();
            }
        }catch (Exception e){
        }
        return datos;
    }
}