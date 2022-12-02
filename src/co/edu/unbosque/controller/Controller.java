package co.edu.unbosque.controller;
import co.edu.unbosque.view.Ventana_Principal;
import co.edu.unbosque.connection.Connection_Local;
import co.edu.unbosque.model.*;
import co.edu.unbosque.persistence.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.List;

public class Controller implements ActionListener {

    Ventana_Principal ventana;

    MedicoDAO dao3 = new MedicoDAO();
    PacienteDAO dao4 = new PacienteDAO();
    Paciente p = new Paciente();

    DetalleDAO dao5 = new DetalleDAO();
    Detalle d = new Detalle();

    EspecialidadDAO dao6 = new EspecialidadDAO();
    Especialidad e = new Especialidad();

    SedeDAO dao7 = new SedeDAO();
    Sede sede = new Sede();

    Agenda a = new Agenda();
    AgendaDAO dao8 = new AgendaDAO();

    Connection_Local conexion;
    Connection conect;
    private DefaultTableModel modelo, modelo1, modelo2, modelo3, modelo4;
    public Controller(){
        ventana = new Ventana_Principal();
        conexion = new Connection_Local();
        conect = conexion.establecerConexion();

        asignarOyentes();
    }
    private void asignarOyentes() {
        ventana.login.getPaciente().addActionListener(this::actionPerformed);
        ventana.paciente.getAtras().addActionListener(this::actionPerformed);
        ventana.login.getIniciar().addActionListener(this::actionPerformed);
        ventana.paciente.getRegistrar().addActionListener(this::actionPerformed);
        ventana.paciente.getDetalles().addActionListener(this::actionPerformed);
        ventana.medico.getHome().addActionListener(this::actionPerformed);
        ventana.medico.getDetalle().addActionListener(this::actionPerformed);
        ventana.agenda.getAtras().addActionListener(this::actionPerformed);
        ventana.emergente.getAtras().addActionListener(this::actionPerformed);
        ventana.agenda.getAgendar().addActionListener(this::actionPerformed);
        ventana.agenda.getMedico().addActionListener(this::actionPerformed);
        ventana.info.getHome().addActionListener(this::actionPerformed);
        ventana.emergente.getDetallar().addActionListener(this::actionPerformed);
        ventana.agenda.getAgendar().addActionListener(this::actionPerformed);
        ventana.agenda.getHorario().addActionListener(this::actionPerformed);
        ventana.horario.getHome().addActionListener(this::actionPerformed);
    }

    public void listarDetalle(JTable tabla){
        modelo = ventana.medico.getModelotabla1();
        modelo = (DefaultTableModel) tabla.getModel();
        List<Detalle> lista = dao5.leerDetalle();
        Object[] objeto = new Object[6];
        for (int i = 0; i < lista.size(); i++){
            objeto[0] = lista.get(i).getId();
            objeto[1] = lista.get(i).getFecha();
            objeto[2] = lista.get(i).getMotivo_consulta();
            objeto[3] = lista.get(i).getTratamiento();
            objeto[4] = lista.get(i).getDiagnostico();
            objeto[5] = lista.get(i).getMascota();
            modelo.addRow(objeto);
            System.out.println(modelo);
        }
    }
    public void infomedico(JTable tabla){
        modelo1 = ventana.info.getModelotabla1();
        modelo1 = (DefaultTableModel) tabla.getModel();
        List<Medico> lista1 = dao3.info_medicos();
        Object[] objeto = new Object[9];
        for (int i = 0; i < lista1.size(); i++){
            objeto[0] = lista1.get(i).getCedula();
            objeto[1] = lista1.get(i).getNombre();
            objeto[2] = lista1.get(i).getTelefono();
            objeto[3] = lista1.get(i).getDireccion_casa();
            objeto[4] = lista1.get(i).getId_sede();
            objeto[5] = lista1.get(i).getEspecialidad();
            objeto[6] = lista1.get(i).getId_detalle();
            objeto[7] = lista1.get(i).getId_paciente();
            objeto[8] = lista1.get(i).getId_mascota();
            modelo1.addRow(objeto);
        }
    }

    public void listhorario(JTable tabla){
        modelo4 = ventana.horario.getModelotabla1();
        modelo4 = (DefaultTableModel) tabla.getModel();
        List<Agenda> Lista1 = dao8.leerAgenda();
        Object[] objeto = new Object[5];
        for (int i = 0; i < Lista1.size(); i++){
            objeto[0] = Lista1.get(i).getId();
            objeto[1] = Lista1.get(i).getId_paciente();
            objeto[2] = Lista1.get(i).getId_empleado();
            objeto[3] = Lista1.get(i).getFecha();
            objeto[4] = Lista1.get(i).getHora();
            modelo4.addRow(objeto);
        }
    }

    public void listespecialidad(JTable tabla){
        modelo2 = ventana.info.getModelotabla2();
        modelo2 = (DefaultTableModel) tabla.getModel();
        List<Especialidad> Lista1 = dao6.especialidadlista();
        Object[] objeto = new Object[2];
        for (int i = 0; i < Lista1.size(); i++){
            objeto[0] = Lista1.get(i).getId();
            objeto[1] = Lista1.get(i).getNombre();
            modelo2.addRow(objeto);
        }
    }

    public void listasede(JTable tabla){
        modelo3 = ventana.info.getModelotabla3();
        modelo3 = (DefaultTableModel) tabla.getModel();
        List<Sede> Lista1 = dao7.sedelista();
        Object[] objeto = new Object[2];
        for (int i = 0; i < Lista1.size(); i++){
            objeto[0] = Lista1.get(i).getId();
            objeto[1] = Lista1.get(i).getNombre();
            modelo3.addRow(objeto);
        }
    }

    public void Agregarpaciente() throws Exception {
        long cedulaM = Long.parseLong(ventana.paciente.getBarra3().getText());
        long cedulaD = Long.parseLong(ventana.paciente.getBarra11().getText());
        String mascota = ventana.paciente.getBarra2().getText();
        String dueño = ventana.paciente.getBarra1().getText();
        long telefono = Long.parseLong(ventana.paciente.getBarra4().getText());
        String direccion = ventana.paciente.getBarra5().getText();
        String especie = ventana.paciente.getBarra6().getText();
        String raza = ventana.paciente.getBarra7().getText();
        String genero = ventana.paciente.getBarra8().getText();
        boolean esterilizado;
        boolean result = false;
        if (ventana.paciente.getBarra8().getText().equals("SI")){
            result = true;
        }else if (ventana.paciente.getBarra8().getText().equals("NO")){
            result = false;
        }
        esterilizado = result;

        int edad = Integer.parseInt(ventana.paciente.getBarra10().getText());

        p.setCedula_mascota(cedulaM);
        p.setCedula_dueño(cedulaD);
        p.setNombre_mascota(mascota);
        p.setNombre_dueño(dueño);
        p.setTelefono(telefono);
        p.setDireccion(direccion);
        p.setEspecie(especie);
        p.setRaza(raza);
        p.setGenero(genero);
        p.setEsterilizado(esterilizado);
        p.setEdad(edad);

        int resultado = dao4.registrar(p);
        if (resultado == 1){
            JOptionPane.showMessageDialog(ventana, "Los datos fueron registrados");
            if (resultado==p.getCedula_mascota()){
                conexion.DesconectarBD();
                JOptionPane.showMessageDialog(ventana, "No puedes registrar, ya existe esta cita");
            }
        }else {
            JOptionPane.showMessageDialog(ventana, "Los datos no fueron registrados");
        }
    }

    public void detalle() throws Exception{
        Long id = Long.parseLong(ventana.emergente.getBarra1().getText());
        String fecha = ventana.emergente.getBarra2().getText();
        String motivo = ventana.emergente.getBarra3().getText();
        String tratamiento = ventana.emergente.getBarra4().getText();
        String diagnostico = ventana.emergente.getBarra5().getText();
        Long id_mascota = Long.parseLong(ventana.emergente.getBarra6().getText());

        d.setId(id);
        d.setFecha(fecha);
        d.setMotivo_consulta(motivo);
        d.setTratamiento(tratamiento);
        d.setDiagnostico(diagnostico);
        d.setMascota(id_mascota);

        int resultado = dao5.registrarDETALLE(d);
        if (resultado == 1){
            JOptionPane.showMessageDialog(ventana, "Los detalles fueron registrados");
        }else {
            JOptionPane.showMessageDialog(ventana, "Los detalles no fueron registrados");
        }
    }

    public boolean validarCorreo() {
        int resultado = 0;
        try {
            String bara1 = ventana.login.getBarra1().getText();
            String bara2 = ventana.login.getBarra2().getText();
            String SQL = "select * from login where nombre_usuario= '"+ bara1 + "'and contrasena='"+bara2+"';";
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            if (rs.next()){
                resultado = 1;
                if (resultado == 1){
                    JOptionPane.showMessageDialog(ventana, "Bienvenido");
                    return true;
                }
            }else {
                JOptionPane.showMessageDialog(ventana, "Error de inicio de sesion");
            }
            rs.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(ventana, e.getMessage());
        }
        return false;
    }

    public void agendar() throws Exception {
        int id = Integer.parseInt(ventana.agenda.getBarra5().getText());
        long id_mascota = Long.parseLong(ventana.agenda.getBarra1().getText());
        long id_medico = Long.parseLong(ventana.agenda.getBarra2().getText());
        String fecha = ventana.agenda.getBarra3().getText();
        String hora = String.valueOf(ventana.agenda.getBarra4().getSelectedItem()   );

        a.setId(id);
        a.setId_paciente(id_mascota);
        a.setId_empleado(id_medico);
        a.setFecha(fecha);
        a.setHora(hora);

        int resultado = dao8.agendar(a);
        if (resultado == 1){
            JOptionPane.showMessageDialog(ventana, "La cita fue registrada");
        }else {
            JOptionPane.showMessageDialog(ventana, "La cita no fue registrada");
        }
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("PACIENTE")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(true);
            ventana.info.setVisible(false);
        } else if (command.equals("INICIAR")) {
            if (validarCorreo() == true) {
                ventana.login.setVisible(false);
                ventana.medico.setVisible(false);
                ventana.paciente.setVisible(true);
                ventana.agenda.setVisible(false);
                ventana.info.setVisible(false);
            } else {
                ventana.login.setVisible(true);
                ventana.medico.setVisible(false);
                ventana.paciente.setVisible(false);
                ventana.agenda.setVisible(false);
                ventana.info.setVisible(false);
            }
        } else if (command.equals("ATRAS1")) {
            ventana.login.setVisible(true);
            ventana.paciente.setVisible(false);
            ventana.agenda.setVisible(false);
            ventana.info.setVisible(false);
        } else if (command.equals("REGISTRO")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(true);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(false);
            ventana.paciente.getDetalles().setVisible(true);
            ventana.info.setVisible(false);
            try {
                Agregarpaciente();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            ventana.paciente.getBarra1().setText("");
            ventana.paciente.getBarra2().setText("");
            ventana.paciente.getBarra3().setText("");
            ventana.paciente.getBarra4().setText("");
            ventana.paciente.getBarra5().setText("");
            ventana.paciente.getBarra6().setText("");
            ventana.paciente.getBarra7().setText("");
            ventana.paciente.getBarra8().setText("");
            ventana.paciente.getBarra10().setText("");
        } else if (command.equals("HISTORIA")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(true);
            ventana.agenda.setVisible(false);
            ventana.info.setVisible(false);
            listarDetalle(ventana.medico.getTabla_pacientes());
        } else if (command.equals("HOME")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(true);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(false);
            ventana.agenda.setVisible(false);
            ventana.info.setVisible(false);
        } else if (command.equals("DETALLE")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(false);
            ventana.emergente.setVisible(true);
            ventana.info.setVisible(false);
        } else if (command.equals("ATRAS1")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(true);
            ventana.agenda.setVisible(false);
            ventana.emergente.setVisible(false);
            ventana.info.setVisible(false);
        } else if (command.equals("DEVOLVER")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(true);
            ventana.agenda.setVisible(false);
            ventana.emergente.setVisible(false);
            ventana.info.setVisible(false);
        } else if (command.equals("INFOMEDICO")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(false);
            ventana.emergente.setVisible(false);
            ventana.info.setVisible(true);
            infomedico(ventana.info.getTabla_medicos());
            listespecialidad(ventana.info.getTabla_especialidad());
            listasede(ventana.info.getTabla_sede());
        } else if (command.equals("HOME1")) {
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(true);
            ventana.emergente.setVisible(false);
            ventana.info.setVisible(false);
        } else if (command.equals("DETALLAR")) {
            try {
                detalle();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            ventana.emergente.getBarra1().setText("");
            ventana.emergente.getBarra2().setText("");
            ventana.emergente.getBarra3().setText("");
            ventana.emergente.getBarra4().setText("");
            ventana.emergente.getBarra5().setText("");

        } else if (command.equals("CITAR")) {
            try {
                agendar();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
            ventana.agenda.getBarra1().setText("");
            ventana.agenda.getBarra2().setText("");
            ventana.agenda.getBarra3().setText("");
            ventana.agenda.getBarra5().setText("");
        }else if(command.equals("HORARIO")){
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(false);
            ventana.emergente.setVisible(false);
            ventana.info.setVisible(false);
            ventana.horario.setVisible(true);
            listhorario(ventana.horario.getTabla_horario());
        }else if (command.equals("HOME2")){
            ventana.login.setVisible(false);
            ventana.paciente.setVisible(false);
            ventana.medico.setVisible(false);
            ventana.agenda.setVisible(true);
            ventana.emergente.setVisible(false);
            ventana.info.setVisible(false);
            ventana.horario.setVisible(false);
        }
    }
}