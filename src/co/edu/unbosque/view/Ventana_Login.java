package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Ventana_Login extends JPanel {

    private JLabel fondo;
    private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;

    private JTextField barra1, barra2;
    private JButton iniciar, paciente;

    public Ventana_Login(){
        setSize(1100,800);
        setLayout(null);
        inicializarComponentes();
        setVisible(true);
    }

    private void inicializarComponentes() {
        etiqueta1 = new JLabel("Bienvenido a Mi Mascota Feliz");
        etiqueta1.setBounds(330,10,550,80);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 38));
        etiqueta1.setForeground(Color.WHITE);
        add(etiqueta1);

        etiqueta2 = new JLabel("Ingresa correo Electronico");
        etiqueta2.setBounds(120,170,500,70);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta2.setForeground(Color.WHITE);
        add(etiqueta2);

        barra1 = new JTextField();
        barra1.setBounds(120,230,700,50);
        barra1.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra1);

        etiqueta3 = new JLabel("Ingresa su contraseña");
        etiqueta3.setBounds(120,400,500,70);
        etiqueta3.setFont(new Font("Arial", Font.BOLD, 30));
        etiqueta3.setForeground(Color.WHITE);
        add(etiqueta3);

        barra2 = new JTextField();
        barra2.setBounds(120,470,700,50);
        barra2.setFont(new Font("Arial", Font.BOLD, 25));
        add(barra2);

        etiqueta4 = new JLabel("Si eres Medico Ingresa Sesion");
        etiqueta4.setBounds(120,550,600,70);
        etiqueta4.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta4.setForeground(Color.WHITE);
        add(etiqueta4);

        ImageIcon imagen1 = new ImageIcon("./src/co/edu/unbosque/image/inicio.png");
        ImageIcon icon1 = new ImageIcon(imagen1.getImage().getScaledInstance(200,100, Image.SCALE_DEFAULT));
        iniciar = new JButton(icon1);
        iniciar.setBounds(170, 600, 200,100);
        iniciar.setActionCommand("INICIAR");
        add(iniciar);

        etiqueta5 = new JLabel("Si eres paciente presiona este boton de una vez");
        etiqueta5.setBounds(510,550,600,70);
        etiqueta5.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta5.setForeground(Color.WHITE);
        add(etiqueta5);

        ImageIcon imagen2 = new ImageIcon("./src/co/edu/unbosque/image/paciente.png");
        ImageIcon icon2 = new ImageIcon(imagen2.getImage().getScaledInstance(200,100, Image.SCALE_DEFAULT));
        paciente = new JButton(icon2);
        paciente.setBounds(630, 600, 200,100);
        paciente.setActionCommand("PACIENTE");
        add(paciente);

        ImageIcon imagen = new ImageIcon("./src/co/edu/unbosque/image/fondo.jpg");
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

    public JButton getIniciar() {
        return iniciar;
    }

    public void setIniciar(JButton iniciar) {
        this.iniciar = iniciar;
    }

    public JButton getPaciente() {
        return paciente;
    }

    public void setPaciente(JButton paciente) {
        this.paciente = paciente;
    }
}
