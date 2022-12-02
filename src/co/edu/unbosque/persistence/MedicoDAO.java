package co.edu.unbosque.persistence;
import co.edu.unbosque.connection.Connection_Local;
import co.edu.unbosque.model.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {

    Connection_Local conexion = new Connection_Local();

    Connection conect;
    PreparedStatement ps;
    ResultSet rs;

    public List info_medicos (){
        ArrayList<Medico> datos = new ArrayList<>();
        String SQL = "select * from empleado";
        try {
            conect = conexion.establecerConexion();
            ps = conect.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Medico m = new Medico();
                m.setCedula(rs.getInt(1));
                m.setNombre(rs.getString(2));
                m.setTelefono(rs.getLong(3));
                m.setDireccion_casa(rs.getString(4));
                m.setId_sede(rs.getInt(5));
                m.setEspecialidad(rs.getInt(6));
                m.setId_detalle(rs.getInt(7));
                m.setId_paciente(rs.getInt(8));
                datos.add(m);
            }
        }catch (Exception e){
        }
        return datos;
    }
}
