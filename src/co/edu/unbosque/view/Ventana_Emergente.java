package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Ventana_Emergente extends JPanel {
    private JLabel bienvenida,etiqueta2, fondo;

    private JButton atras, detallar;
    private JTextField barra1,barra2, barra3, barra4, barra5, barra6;
    public Ventana_Emergente() {
        setSize(1100, 800);
        setLayout(null);
        inicializarComponentes();
        setVisible(false);
    }

    private void inicializarComponentes() {

        bienvenida = new JLabel("Por favor ingresa los campos requeridos para sus detalles");
        bienvenida.setBounds(40,50, 1000,50);
        bienvenida.setFont(new Font("Arial", Font.BOLD, 30));
        add(bienvenida);

        etiqueta2 = new JLabel("ID:");
        etiqueta2.setBounds(120,130,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra1 = new JTextField();
        barra1.setBounds(500, 150, 300, 30);
        barra1.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra1);

        etiqueta2 = new JLabel("Fecha_Consulta:");
        etiqueta2.setBounds(120,210,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.RED);
        add(etiqueta2);

        barra2 = new JTextField();
        barra2.setBounds(500, 230, 300, 30);
        barra2.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra2);

        etiqueta2 = new JLabel("Motivo Consulta:");
        etiqueta2.setBounds(120,300,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra3 = new JTextField();
        barra3.setBounds(500, 320, 300, 30);
        barra3.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra3);

        etiqueta2 = new JLabel("Tratamiento:");
        etiqueta2.setBounds(120,360,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.RED);
        add(etiqueta2);

        barra4 = new JTextField();
        barra4.setBounds(500, 380, 300, 30);
        barra4.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra4);

        etiqueta2 = new JLabel("Diagnostico:");
        etiqueta2.setBounds(120,440,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra5 = new JTextField();
        barra5.setBounds(500, 460, 300, 30);
        barra5.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra5);

        etiqueta2 = new JLabel("ID mascota:");
        etiqueta2.setBounds(120,500,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.BLACK);
        add(etiqueta2);

        barra6 = new JTextField();
        barra6.setBounds(500, 520, 300, 30);
        barra6.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra6);

        detallar = new JButton("Anotar");
        detallar.setBounds(170, 600, 200,100);
        detallar.setActionCommand("DETALLAR");
        add(detallar);

        atras = new JButton("Atras");
        atras.setBounds(630, 600, 200,100);
        atras.setActionCommand("DEVOLVER");
        add(atras);

        ImageIcon imagen = new ImageIcon("./src/co/edu/unbosque/image/fondo_medico.png");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(1100,800, Image.SCALE_DEFAULT));
        fondo = new JLabel(icon);
        fondo.setBounds(0,0,1100,800);
        add(fondo);
    }

    public JLabel getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(JLabel bienvenida) {
        this.bienvenida = bienvenida;
    }

    public JLabel getEtiqueta2() {
        return etiqueta2;
    }

    public void setEtiqueta2(JLabel etiqueta2) {
        this.etiqueta2 = etiqueta2;
    }

    public JLabel getFondo() {
        return fondo;
    }

    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
    }

    public JButton getAtras() {
        return atras;
    }

    public void setAtras(JButton atras) {
        this.atras = atras;
    }

    public JButton getDetallar() {
        return detallar;
    }

    public void setDetallar(JButton detallar) {
        this.detallar = detallar;
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
}