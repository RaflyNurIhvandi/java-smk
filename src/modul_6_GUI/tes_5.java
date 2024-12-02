package modul_6_GUI;

import javax.swing.*;
import java.awt.*;

public class tes_5 extends JFrame{
    public tes_5() {
        super("Contoh Box Layout Dalam Satu Baris");
        Container c = getContentPane();
        Box box = new Box(BoxLayout.X_AXIS);
        JTextArea t1 = new JTextArea("Praktikum Java", 10, 15);
        JButton b1 = new JButton("Tombol 1");
        JButton b2 = new JButton("Tombol 2");
        JTextArea t2 = new JTextArea("Ilmu Komputer", 10, 15);
        box.add(new JScrollPane(t1));
        box.add(b1);
        box.add(b2);
        box.add(new JScrollPane(t2));
        c.add(box);
    }
    public static void main(String[] args) {
        tes_5 cbl = new tes_5();
        cbl.setSize(300, 300);
        cbl.setVisible(true);
        cbl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
