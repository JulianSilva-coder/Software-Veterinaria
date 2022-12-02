package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Ventana_Medico extends JPanel {

    private JButton Detalle, home;
    private JLabel fondo;

    private JLabel etiqueta1, etiqueta2;
    private DefaultTableModel modelotabla1;
    private JScrollPane jscp1;
    private int cantidad = 0;

    private JTable tabla_pacientes;
    public Ventana_Medico(){
        setSize(1100,800);
        setLayout(null);
        inicializarComponentes();
        setVisible(false);
    }

    private void inicializarComponentes() {

        etiqueta1 = new JLabel("Revisa las historias clinicas que estan registradas");
        etiqueta1.setBounds(70,50,1000,50);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 40));
        etiqueta1.setForeground(Color.black);
        add(etiqueta1);

        home = new JButton("Home");
        home.setBounds(10,10,150,40);
        home.setFont(new Font("Arial", Font.BOLD, 28));
        home.setActionCommand("HOME");
        add(home);

        Detalle = new JButton("Detalle");
        Detalle.setBounds(800, 10, 150, 40);
        Detalle.setFont(new Font("Arial", Font.BOLD, 28));
        Detalle.setActionCommand("DETALLE");
        add(Detalle);

        tabla_pacientes = new JTable(new DefaultTableModel(new Object[] {"Id Historial ", "Fecha", "Motivo Consulta", "Tratamiento", "Diagnostico", "ID Mascota"}, cantidad));
        modelotabla1 = (DefaultTableModel) tabla_pacientes.getModel();
        jscp1 = new JScrollPane(tabla_pacientes);
        jscp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp1.setPreferredSize(new Dimension(400,250));
        jscp1.setBounds(30,120,1000,460);
        jscp1.setVisible(true);
        add(jscp1);
        cantidad++;


        ImageIcon imagen = new ImageIcon("./src/co/edu/unbosque/image/fondo_medico.png");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(1100,800, Image.SCALE_DEFAULT));
        fondo = new JLabel(icon);
        fondo.setBounds(0,0,1100,800);
        add(fondo);
    }
    public JLabel getFondo() {
        return fondo;
    }

    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
    }

    public JButton getDetalle() {
        return Detalle;
    }

    public void setDetalle(JButton detalle) {
        Detalle = detalle;
    }

    public JButton getHome() {
        return home;
    }

    public void setHome(JButton home) {
        this.home = home;
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

    public DefaultTableModel getModelotabla1() {
        return modelotabla1;
    }

    public void setModelotabla1(DefaultTableModel modelotabla1) {
        this.modelotabla1 = modelotabla1;
    }

    public JScrollPane getJscp1() {
        return jscp1;
    }

    public void setJscp1(JScrollPane jscp1) {
        this.jscp1 = jscp1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public JTable getTabla_pacientes() {
        return tabla_pacientes;
    }

    public void setTabla_pacientes(JTable tabla_pacientes) {
        this.tabla_pacientes = tabla_pacientes;
    }
}
