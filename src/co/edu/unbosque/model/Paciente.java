package co.edu.unbosque.model;

public class Paciente {

    private long cedula_mascota;
    private long cedula_dueño;
    private String nombre_mascota;
    private String nombre_dueño;
    private long telefono;
    private String Direccion;
    private String Especie;
    private String raza;
    private String genero;
    private Boolean Esterilizado;
    private int edad;


    public Paciente(){

    }

    public Paciente(String nombre_dueño , String nombre_mascota, long cedula_mascota, long cedula_dueño, long telefono, String Direccion, String Especie, String raza, String genero, Boolean Esterilizado, int edad, long id_mascota){
        this.cedula_mascota = cedula_mascota;
        this.cedula_dueño = cedula_dueño;
        this.nombre_dueño = nombre_dueño;
        this.nombre_mascota = nombre_mascota;
        this.telefono = telefono;
        this.Direccion = Direccion;
        this.Especie = Especie;
        this.raza = raza;
        this.genero = genero;
        this.Esterilizado = Esterilizado;
        this.edad = edad;

    }

    public long getCedula_mascota() {
        return cedula_mascota;
    }

    public void setCedula_mascota(long cedula_mascota) {
        this.cedula_mascota = cedula_mascota;
    }

    public long getCedula_dueño() {
        return cedula_dueño;
    }

    public void setCedula_dueño(long cedula_dueño) {
        this.cedula_dueño = cedula_dueño;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getEsterilizado() {
        return Esterilizado;
    }

    public void setEsterilizado(Boolean esterilizado) {
        Esterilizado = esterilizado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}