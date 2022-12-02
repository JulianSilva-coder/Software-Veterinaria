package co.edu.unbosque.persistence;
import co.edu.unbosque.connection.Connection_Local;
import co.edu.unbosque.model.Detalle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DetalleDAO {

    Connection_Local conexion = new Connection_Local();

    Connection conect;
    PreparedStatement ps;
    ResultSet rs;

    public List leerDetalle (){
        ArrayList<Detalle> datos = new ArrayList<>();
        String SQL = "select * from detalle";
        try {
            conect = conexion.establecerConexion();
            ps = conect.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Detalle d = new Detalle();
                d.setId(rs.getInt(1));
                d.setFecha(rs.getString(2));
                d.setMotivo_consulta(rs.getString(3));
                d.setTratamiento(rs.getString(4));
                d.setDiagnostico(rs.getString(5));
                d.setMascota(rs.getInt(6));
                datos.add(d);
            }
        }catch (Exception e){
        }
        return datos;
    }
    public int registrarDETALLE(Detalle detalle) throws Exception{
        String SQL = "INSERT INTO DETALLE (ID, FECHA_CONSULTA, MOTIVO_CONSULTA, TRATAMIENTO, DIAGNOSTICO, MASCOTA) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = conexion.establecerConexion().prepareStatement(SQL);
        ps.setLong(1, detalle.getId());
        ps.setString(2, detalle.getFecha());
        ps.setString(3, detalle.getMotivo_consulta());
        ps.setString(4, detalle.getTratamiento());
        ps.setString(5, detalle.getDiagnostico());
        ps.setLong(6, detalle.getMascota());
        int resultado = ps.executeUpdate();
        conexion.DesconectarBD();

        return resultado;
    }
}