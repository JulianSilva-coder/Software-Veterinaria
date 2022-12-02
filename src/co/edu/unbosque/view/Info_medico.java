package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Info_medico extends JPanel {

    private JButton home;
    private JLabel fondo;

    private JLabel etiqueta1, etiqueta2;
    private DefaultTableModel modelotabla1, modelotabla2, modelotabla3;
    private JScrollPane jscp1, jscp2, jscp3;
    private int cantidad = 0;

    private JTable tabla_medicos, tabla_especialidad, tabla_sede;
    public Info_medico(){
        setSize(1100, 800);
        setLayout(null);
        inicializarComponentes();
        setVisible(false);
    }

    private void inicializarComponentes() {

        etiqueta1 = new JLabel("Revisa las historias clinicas que tienes registradas");
        etiqueta1.setBounds(70,50,1000,50);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 40));
        etiqueta1.setForeground(Color.black);
        add(etiqueta1);

        home = new JButton("Home");
        home.setBounds(10,10,150,40);
        home.setFont(new Font("Arial", Font.BOLD, 28));
        home.setActionCommand("HOME1");
        add(home);

        tabla_medicos = new JTable(new DefaultTableModel(new Object[] {"CEDULA ", "NOMBRE", "TELEFONO", "DIRECCION", "ID_SEDE", "ID_ESPECIALDIAD", "ID DETALLE", "ID PACIENTE"}, cantidad));
        modelotabla1 = (DefaultTableModel) tabla_medicos.getModel();
        jscp1 = new JScrollPane(tabla_medicos);
        jscp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp1.setPreferredSize(new Dimension(400,250));
        jscp1.setBounds(30,120,1000,340);
        jscp1.setVisible(true);
        add(jscp1);
        cantidad++;

        tabla_especialidad = new JTable(new DefaultTableModel(new Object[] {"CEDULA ", "NOMBRE"}, cantidad));
        modelotabla2 = (DefaultTableModel) tabla_especialidad.getModel();
        jscp2 = new JScrollPane(tabla_especialidad);
        jscp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp2.setFont(new Font("Arial", Font.BOLD, 25));
        jscp2.setPreferredSize(new Dimension(400,250));
        jscp2.setBounds(100,480,300,120);
        jscp2.setVisible(true);
        add(jscp2);
        cantidad++;


        tabla_sede = new JTable(new DefaultTableModel(new Object[] {"CEDULA ", "NOMBRE"}, cantidad));
        modelotabla3 = (DefaultTableModel) tabla_sede.getModel();
        jscp3 = new JScrollPane(tabla_sede);
        jscp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp3.setFont(new Font("Arial", Font.BOLD, 25));
        jscp3.setPreferredSize(new Dimension(400,250));
        jscp3.setBounds(600,480,380,170);
        jscp3.setVisible(true);
        add(jscp3);
        cantidad++;

        ImageIcon imagen = new ImageIcon("./src/co/edu/unbosque/image/fondo-perro.jpg");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(1100,800, Image.SCALE_DEFAULT));
        JLabel fondo = new JLabel(icon);
        fondo.setBounds(0,0,1100,800);
        add(fondo);
    }


    public JButton getHome() {
        return home;
    }

    public void setHome(JButton home) {
        this.home = home;
    }

    public JLabel getFondo() {
        return fondo;
    }

    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
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

    public JTable getTabla_medicos() {
        return tabla_medicos;
    }

    public void setTabla_medicos(JTable tabla_medicos) {
        this.tabla_medicos = tabla_medicos;
    }

    public DefaultTableModel getModelotabla2() {
        return modelotabla2;
    }

    public void setModelotabla2(DefaultTableModel modelotabla2) {
        this.modelotabla2 = modelotabla2;
    }

    public JScrollPane getJscp2() {
        return jscp2;
    }

    public void setJscp2(JScrollPane jscp2) {
        this.jscp2 = jscp2;
    }

    public JTable getTabla_especialidad() {
        return tabla_especialidad;
    }

    public void setTabla_especialidad(JTable tabla_especialidad) {
        this.tabla_especialidad = tabla_especialidad;
    }

    public DefaultTableModel getModelotabla3() {
        return modelotabla3;
    }

    public void setModelotabla3(DefaultTableModel modelotabla3) {
        this.modelotabla3 = modelotabla3;
    }

    public JScrollPane getJscp3() {
        return jscp3;
    }

    public void setJscp3(JScrollPane jscp3) {
        this.jscp3 = jscp3;
    }

    public JTable getTabla_sede() {
        return tabla_sede;
    }

    public void setTabla_sede(JTable tabla_sede) {
        this.tabla_sede = tabla_sede;
    }
}
