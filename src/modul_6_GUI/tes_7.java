package modul_6_GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class tes_7 extends JFrame{
    private JButton tombol[];
    private String m[] = {"Satu", "Dua", "Tiga", "Empat", "Lima", "Enam"};
    private Container c;
    private GridLayout g;
    public tes_7(){
        super("Demonstrasi GridLayout");
        g = new GridLayout(2,3,5,5);
        c = getContentPane();
        c.setLayout(g);
        tombol = new JButton[m.length];
        for (int i = 0; i < m.length; i++) {
            tombol[i] = new JButton(m[i]);
            c.add(tombol[i]);
        }
        setSize(300, 300);
        show();
    }
    public static void main(String[] args) {
        tes_7 gtl = new tes_7();
        gtl.addWindowListener(new WindowAdapter(){
            public void windowsClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
