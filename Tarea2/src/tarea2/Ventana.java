package tarea2;

import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
    public Ventana(){
        super();
        this.setTitle("Maquina Expendedora");
        // se cambia Layout por defecto a BorderLayout
        this.setLayout(new BorderLayout());
        // se agregan botones no Ãºtiles para demostrar las zonas del Layout
        this.add(new JButton("PRUEBA"),BorderLayout.SOUTH);
        this.add(new JButton("PRUEBA"),BorderLayout.CENTER);
        this.add(new JButton("PRUEBA"),BorderLayout.NORTH);
        this.add(new JButton("PRUEBA"),BorderLayout.EAST);
        this.add(new JButton("PRUEBA"),BorderLayout.WEST);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setVisible(true);
    }
}
