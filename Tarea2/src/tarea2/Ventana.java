package tarea2;

import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
    PanelPrincipal a = new PanelPrincipal();

    public Ventana() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Maquina expendedora");
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(a, new BorderLayout().CENTER);
    }
}

