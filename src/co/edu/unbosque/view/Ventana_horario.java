package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Ventana_horario extends JPanel {

    private JLabel fondo;

    private JButton home;

    private JLabel etiqueta1, etiqueta2;
    private DefaultTableModel modelotabla1;
    private JScrollPane jscp1;
    private int cantidad = 0;

    private JTable tabla_horario;
    
    public Ventana_horario(){
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
        home.setActionCommand("HOME2");
        add(home);

        tabla_horario = new JTable(new DefaultTableModel(new Object[] {"ID ", "ID_PACIENTE", "ID_EMPLEADO", "FECHA", "HORA"}, cantidad));
        modelotabla1 = (DefaultTableModel) tabla_horario.getModel();
        jscp1 = new JScrollPane(tabla_horario);
        jscp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscp1.setPreferredSize(new Dimension(400,250));
        jscp1.setBounds(30,120,1000,340);
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

    public JTable getTabla_horario() {
        return tabla_horario;
    }

    public void setTabla_horario(JTable tabla_horario) {
        this.tabla_horario = tabla_horario;
    }
}
