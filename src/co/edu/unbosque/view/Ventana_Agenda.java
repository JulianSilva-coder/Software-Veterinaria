package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Ventana_Agenda extends JPanel {

    private JLabel bienvenido, etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5, etiqueta6, etiqueta7;

    private JComboBox barra4;

    private JTextField barra1, barra2, barra3, barra5;

    private JButton agendar, atras, medico, horario;

    private String[] horas = {"8:00 - 9:00 AM", "9:00 - 10:00 AM", "10:00 - 11:00 AM", "11:00 - 12:00 PM", "12:00 - 1:00 PM", "1:00 - 2:00 PM",
            "2:00 - 3:00 PM"};

    public Ventana_Agenda(){

        setSize(1100,800);
        setLayout(null);
        inicializarComponentes();
        setVisible(false);
    }

    private void inicializarComponentes() {
        bienvenido = new JLabel("Ingresa los siguientes campos");
        bienvenido.setBounds(250,10,1000,80);
        bienvenido.setFont(new Font("Arial", Font.BOLD, 38));
        bienvenido.setForeground(Color.white);
        add(bienvenido);

        etiqueta1 = new JLabel("Escribe la identificacion de tu mascota.");
        etiqueta1.setBounds(80,100,1000,70);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta1.setForeground(Color.white);
        add(etiqueta1);

        barra1 = new JTextField();
        barra1.setBounds(680, 120, 300, 30);
        barra1.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra1);

        etiqueta2 = new JLabel("Escribe la identificacion del medico.");
        etiqueta2.setBounds(80,190,1000,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.white);
        add(etiqueta2);

        barra2 = new JTextField();
        barra2.setBounds(680, 210, 300, 30);
        barra2.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra2);

        etiqueta4 = new JLabel("Selecciona la hora que deseas.");
        etiqueta4.setBounds(80,280,1000,70);
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta4.setForeground(Color.white);
        add(etiqueta4);

        barra4 = new JComboBox(horas);
        barra4.setBounds(680, 300, 300, 30);
        barra4.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra4);

        etiqueta6 = new JLabel("Escribe la fecha");
        etiqueta6.setBounds(80,380,1000,70);
        etiqueta6.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta6.setForeground(Color.white);
        add(etiqueta6);

        barra3 = new JTextField();
        barra3.setBounds(680, 400, 300, 30);
        barra3.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra3);

        etiqueta7 = new JLabel("ID:");
        etiqueta7.setBounds(80,450,1000,70);
        etiqueta7.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta7.setForeground(Color.white);
        add(etiqueta7);

        barra5 = new JTextField();
        barra5.setBounds(680, 470, 300, 30);
        barra5.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra5);
        //
        etiqueta5= new JLabel("Revisa los datos de los medicos");
        etiqueta5.setBounds(80,520,1000,70);
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta5.setForeground(Color.white);
        add(etiqueta5);

        medico = new JButton("MEDICO");
        medico.setBounds(680, 540, 200,50);
        medico.setActionCommand("INFOMEDICO");
        add(medico);

        agendar = new JButton("Citar");
        agendar.setBounds(170, 600, 200,100);
        agendar.setActionCommand("CITAR");
        add(agendar);

        atras = new JButton("atras");
        atras.setBounds(430, 600, 200,100);
        atras.setActionCommand("ATRAS1");
        add(atras);

        horario = new JButton("Horario");
        horario.setBounds(700, 600, 200,100);
        horario.setActionCommand("HORARIO");
        add(horario);

        ImageIcon imagen = new ImageIcon("./src/co/edu/unbosque/image/gatitofondo.jpg");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(1100,800, Image.SCALE_DEFAULT));
        JLabel fondo = new JLabel(icon);
        fondo.setBounds(0,0,1100,800);
        add(fondo);
    }

    public JLabel getBienvenido() {
        return bienvenido;
    }

    public void setBienvenido(JLabel bienvenido) {
        this.bienvenido = bienvenido;
    }

    public JLabel getEtiqueta1() {
        return etiqueta1;
    }

    public void setEtiqueta1(JLabel etiqueta1) {
        this.etiqueta1 = etiqueta1;
    }

    public JLabel getEtiqueta2() {
        return etiqueta2;
    }

    public void setEtiqueta2(JLabel etiqueta2) {
        this.etiqueta2 = etiqueta2;
    }

    public JLabel getEtiqueta3() {
        return etiqueta3;
    }

    public void setEtiqueta3(JLabel etiqueta3) {
        this.etiqueta3 = etiqueta3;
    }

    public JLabel getEtiqueta4() {
        return etiqueta4;
    }

    public void setEtiqueta4(JLabel etiqueta4) {
        this.etiqueta4 = etiqueta4;
    }

    public JLabel getEtiqueta5() {
        return etiqueta5;
    }

    public void setEtiqueta5(JLabel etiqueta5) {
        this.etiqueta5 = etiqueta5;
    }

    public JComboBox getBarra4() {
        return barra4;
    }

    public void setBarra4(JComboBox barra4) {
        this.barra4 = barra4;
    }

    public JTextField getBarra1() {
        return barra1;
    }

    public void setBarra1(JTextField barra1) {
        this.barra1 = barra1;
    }

    public JTextField getBarra2() {
        return barra2;
    }

    public void setBarra2(JTextField barra2) {
        this.barra2 = barra2;
    }

    public JTextField getBarra3() {
        return barra3;
    }

    public void setBarra3(JTextField barra3) {
        this.barra3 = barra3;
    }

    public JButton getAgendar() {
        return agendar;
    }

    public void setAgendar(JButton agendar) {
        this.agendar = agendar;
    }

    public JButton getAtras() {
        return atras;
    }

    public void setAtras(JButton atras) {
        this.atras = atras;
    }

    public JButton getMedico() {
        return medico;
    }

    public void setMedico(JButton medico) {
        this.medico = medico;
    }

    public JLabel getEtiqueta6() {
        return etiqueta6;
    }

    public void setEtiqueta6(JLabel etiqueta6) {
        this.etiqueta6 = etiqueta6;
    }

    public JLabel getEtiqueta7() {
        return etiqueta7;
    }

    public void setEtiqueta7(JLabel etiqueta7) {
        this.etiqueta7 = etiqueta7;
    }

    public JTextField getBarra5() {
        return barra5;
    }

    public void setBarra5(JTextField barra5) {
        this.barra5 = barra5;
    }

    public JButton getHorario() {
        return horario;
    }

    public void setHorario(JButton horario) {
        this.horario = horario;
    }

    public String[] getHoras() {
        return horas;
    }

    public void setHoras(String[] horas) {
        this.horas = horas;
    }
}
