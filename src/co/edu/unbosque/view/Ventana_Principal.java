package co.edu.unbosque.view;

import javax.swing.*;

public class Ventana_Principal extends JFrame {
    public Ventana_Login login;
    public Ventana_Paciente paciente;
    public Ventana_Medico medico;
    public Ventana_Agenda agenda;
    public Ventana_Emergente emergente;
    public Info_medico info;

    public Ventana_horario horario;

    public Ventana_Principal(){
        setSize(1100,800);
        setTitle("Mi Mascota Feliz");
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(getDefaultCloseOperation());
        setLocationRelativeTo(null);
        inicializarComponentes();
        //setIconImage(new ImageIcon(getClass().getResource("./src/Image/Logo.png")).getImage());
        setVisible(true);
    }

    private void inicializarComponentes() {

        login = new Ventana_Login();
        getContentPane().add(login);

        paciente = new Ventana_Paciente();
        getContentPane().add(paciente);

        medico = new Ventana_Medico();
        getContentPane().add(medico);

        agenda = new Ventana_Agenda();
        getContentPane().add(agenda);

        emergente = new Ventana_Emergente();
        getContentPane().add(emergente);

        info = new Info_medico();
        getContentPane().add(info);

        horario = new Ventana_horario();
        getContentPane().add(horario);
    }

}
