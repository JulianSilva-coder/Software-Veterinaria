package co.edu.unbosque.model;

public class Agenda {

    private String hora, fecha;
    private long id_paciente, id_empleado;

    private int id;
    public Agenda(){

    }

    public Agenda(int id, long id_paciente, long id_empleado,String hora, String Fecha){
        this.id = id;
        this.id_paciente = id_paciente;
        this.id_empleado = id_empleado;
        this.hora = hora;
        this.fecha = Fecha;
    }

    public long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
