package co.edu.unbosque.model;

public class Detalle {

    private long id;
    private String fecha;
    private String motivo_consulta;
    private String tratamiento;
    private String diagnostico;
    private long mascota;

    public Detalle(){

    }
    public Detalle(long id,String fecha, String motivo_consulta, String tratamiento, String diagnostico, long mascota){
        this.id = id;
        this.fecha = fecha;
        this.motivo_consulta = motivo_consulta;
        this.tratamiento = tratamiento;
        this.diagnostico = diagnostico;
        this.mascota = mascota;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMascota() {
        return mascota;
    }

    public void setMascota(long mascota) {
        this.mascota = mascota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

}
