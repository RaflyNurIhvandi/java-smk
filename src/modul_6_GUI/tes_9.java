package modul_6_GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class tes_9 {
    JFrame f;
    Container c;
    SpringLayout l;
    JLabel label;
    JTextField t;

    public tes_9(){
        f = new JFrame("Demo SpringLayout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = f.getContentPane();
        l = new SpringLayout();
        c.setLayout(l);
        label = new JLabel("Ini label");
        t = new JTextField("Tuliskan Text", 20);
        c.add(label);
        c.add(t);
        l.putConstraint(SpringLayout.WEST, label, 20, SpringLayout.WEST, c);
        l.putConstraint(SpringLayout.NORTH, label, 10, SpringLayout.NORTH, c);
        l.putConstraint(SpringLayout.WEST, t, 10, SpringLayout.WEST, label);
        l.putConstraint(SpringLayout.NORTH, t, 10, SpringLayout.NORTH, c);
        l.putConstraint(SpringLayout.WEST, c, 5, SpringLayout.WEST, t);
        l.putConstraint(SpringLayout.NORTH, c, 5, SpringLayout.NORTH, t);
        f.pack();
        f.show();
    }
    public static void main(String[] args) {
        tes_9 cs = new tes_9();
    }
}
