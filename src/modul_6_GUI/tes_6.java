package modul_6_GUI;
import javax.swing.*;
import java.awt.*;
public class tes_6 extends JFrame{
    JPanel p1;
    JPanel p2;
    JRadioButton pil1, pil2, pil3;
    ButtonGroup radioGroup;
    JTextArea g;
    public tes_6(){
        super("Uji Coba Card Layout");
        p1 = new JPanel();
        p2 = new JPanel();
        pil1 = new JRadioButton("Pilihan 1", true);
        pil2 = new JRadioButton("Pilihan 2", false);
        pil3 = new JRadioButton("Pilihan 3", false);
        p1.add(pil1);
        p1.add(pil2);
        p1.add(pil3);
        radioGroup = new ButtonGroup();
        radioGroup.add(pil1);
        radioGroup.add(pil2);
        radioGroup.add(pil3);
        g = new JTextArea("Text area");
        p2.add(g);
        JTabbedPane tab = new JTabbedPane();
        tab.add(p1, "Tab dengan Radio Button");
        tab.add(p2, "Tab dengan Text Area");
        Container c = getContentPane();
        c.add(tab, BorderLayout.NORTH);
    }
    public static void main(String[] args) {
        tes_6 tcl = new tes_6();
        tcl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tcl.setSize(500, 100);
        tcl.setVisible(true);
    }
}
