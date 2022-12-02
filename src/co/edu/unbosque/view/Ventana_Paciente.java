package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Ventana_Paciente extends JPanel {

    private JLabel fondo;

    private JLabel etiqueta1, etiqueta2;

    private JTextField barra1, barra2, barra3, barra4, barra5, barra6, barra7, barra8, barra10, barra11;

    private JButton registrar, Atras, detalles;

    private JComboBox barra9;

    public Ventana_Paciente(){
        setSize(1100,800);
        setLayout(null);
        inicializarComponentes();
        setVisible(false);
    }

    private void inicializarComponentes() {
        etiqueta1 = new JLabel("Bienvenido a Mi Mascota Feliz");
        etiqueta1.setBounds(300,10,550,80);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 38));
        etiqueta1.setForeground(Color.BLACK);
        add(etiqueta1);

        etiqueta2 = new JLabel("Nombre de Dueño:");
        etiqueta2.setBounds(120,70,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra1 = new JTextField();
        barra1.setBounds(500, 90, 300, 30);
        barra1.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra1);

        etiqueta2 = new JLabel("Identificacion del cliente:");
        etiqueta2.setBounds(120,110,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.RED);
        add(etiqueta2);

        barra11 = new JTextField();
        barra11.setBounds(500, 130, 300, 30);
        barra11.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra11);

        etiqueta2 = new JLabel("Nombre de la Mascota:");
        etiqueta2.setBounds(120,160,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra2 = new JTextField();
        barra2.setBounds(500, 180, 300, 30);
        barra2.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra2);

        etiqueta2 = new JLabel("Identificacion de la mascota:");
        etiqueta2.setBounds(120,210,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.RED);
        add(etiqueta2);

        barra3 = new JTextField();
        barra3.setBounds(500, 230, 300, 30);
        barra3.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra3);

        etiqueta2 = new JLabel("Telefono:");
        etiqueta2.setBounds(120,260,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra4 = new JTextField();
        barra4.setBounds(500, 280, 300, 30);
        barra4.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra4);

        etiqueta2 = new JLabel("Direccion de Residencia:");
        etiqueta2.setBounds(120,310,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra5 = new JTextField();
        barra5.setBounds(500, 330, 300, 30);
        barra5.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra5);

        etiqueta2 = new JLabel("Especie de la Mascota:");
        etiqueta2.setBounds(120,370,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra6 = new JTextField();
        barra6.setBounds(500, 390, 300, 30);
        barra6.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra6);

        etiqueta2 = new JLabel("Raza:");
        etiqueta2.setBounds(120,430,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra7 = new JTextField();
        barra7.setBounds(500, 450, 300, 30);
        barra7.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra7);

        etiqueta2 = new JLabel("Genero:");
        etiqueta2.setBounds(120,490,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra8 = new JTextField();
        barra8.setBounds(500, 510, 300, 30);
        barra8.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra8);

        etiqueta2 = new JLabel("Esterilizado:");
        etiqueta2.setBounds(120,550,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra9 = new JComboBox();
        barra9.setBounds(500, 570, 300, 30);
        barra9.setFont(new Font("Arial", Font.BOLD, 25));
        barra9.addItem("Elige una Opcion");
        barra9.addItem("SI");
        barra9.addItem("NO");
        add(barra9);

        etiqueta2 = new JLabel("Edad:");
        etiqueta2.setBounds(120,610,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra10 = new JTextField();
        barra10.setBounds(500, 630, 300, 30);
        barra10.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra10);

        Atras = new JButton("Atras");
        Atras.setBounds(600, 660, 200,100);
        Atras.setActionCommand("ATRAS1");
        add(Atras);

        ImageIcon imagen1 = new ImageIcon("./src/co/edu/unbosque/image/registrar.png");
        ImageIcon icon1 = new ImageIcon(imagen1.getImage().getScaledInstance(200,100, Image.SCALE_DEFAULT));
        registrar = new JButton(icon1);
        registrar.setBounds(300, 660, 200,100);
        registrar.setActionCommand("REGISTRO");
        add(registrar);

        detalles = new JButton("Historia Clinica");
        detalles.setBounds(850, 350, 200,100);
        detalles.setActionCommand("HISTORIA");
        detalles.setVisible(false);
        add(detalles);

        ImageIcon imagen = new ImageIcon("./src/co/edu/unbosque/image/fondo_paciente.jpg");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(1100,800, Image.SCALE_DEFAULT));
        fondo = new JLabel(icon);
        fondo.setBounds(0,0,1100,800);
        add(fondo);

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

    public JTextField getBarra4() {
        return barra4;
    }

    public void setBarra4(JTextField barra4) {
        this.barra4 = barra4;
    }

    public JTextField getBarra5() {
        return barra5;
    }

    public void setBarra5(JTextField barra5) {
        this.barra5 = barra5;
    }

    public JTextField getBarra6() {
        return barra6;
    }

    public void setBarra6(JTextField barra6) {
        this.barra6 = barra6;
    }

    public JTextField getBarra7() {
        return barra7;
    }

    public void setBarra7(JTextField barra7) {
        this.barra7 = barra7;
    }

    public JTextField getBarra8() {
        return barra8;
    }

    public void setBarra8(JTextField barra8) {
        this.barra8 = barra8;
    }

    public JTextField getBarra10() {
        return barra10;
    }

    public void setBarra10(JTextField barra10) {
        this.barra10 = barra10;
    }

    public JButton getRegistrar() {
        return registrar;
    }

    public void setRegistrar(JButton registrar) {
        this.registrar = registrar;
    }

    public JButton getAtras() {
        return Atras;
    }

    public void setAtras(JButton atras) {
        Atras = atras;
    }

    public JComboBox getBarra9() {
        return barra9;
    }

    public void setBarra9(JComboBox barra9) {
        this.barra9 = barra9;
    }

    public JButton getDetalles() {
        return detalles;
    }

    public void setDetalles(JButton detalles) {
        this.detalles = detalles;
    }

    public JTextField getBarra11() {
        return barra11;
    }

    public void setBarra11(JTextField barra11) {
        this.barra11 = barra11;
    }
}
