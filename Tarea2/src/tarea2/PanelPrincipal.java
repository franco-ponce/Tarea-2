package tarea2;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.GridLayout;
public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal() {
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(2,1));
        /*this.add(com);
        this.add(exp);*/
    }
    public void paint(Graphics g) {
        super.paint(g);
        /*com.paint(g);
        exp.paint(g);*/
    }
}