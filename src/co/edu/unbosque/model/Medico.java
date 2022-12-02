package co.edu.unbosque.model;

public class  Medico {

    private int cedula;
    private String nombre;
    private long telefono;
    private String direccion_casa;
    private int id_sede;
    private int especialidad;
    private int id_detalle;
    private long id_paciente;
    private long id_mascota;

    public Medico(){

    }

    public Medico(int cedula, String nombre, long telefono, String direccion_casa, int id_sede, int especialidad, int id_detalle, long id_paciente, long id_mascota){
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion_casa = direccion_casa;
        this.id_sede = id_sede;
        this.especialidad = especialidad;
        this.id_detalle = id_detalle;
        this.id_paciente = id_paciente;
        this.id_mascota = id_mascota;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion_casa() {
        return direccion_casa;
    }

    public void setDireccion_casa(String direccion_casa) {
        this.direccion_casa = direccion_casa;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public long getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(long id_mascota) {
        this.id_mascota = id_mascota;
    }
}
