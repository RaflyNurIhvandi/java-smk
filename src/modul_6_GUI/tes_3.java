package modul_6_GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class tes_3 extends JFrame implements ActionListener{
    private JButton tombol[];
    private String names[]={"Hilangkan North", "Hilangkan South", "Hilangkan East", "Hilangkan West", "Hilangkan Center"};
    private BorderLayout lout;
    public tes_3(){
        super("Ini adalah contoh border layout");
        Container c = getContentPane();
        lout = new BorderLayout(10, 10);
        c.setLayout(lout);
        tombol = new JButton[names.length];
        for (int i = 0; i < names.length; i++) {
            tombol[i] = new JButton(names[i]);
            tombol[i].addActionListener(this);
        }
        c.add(tombol[0], BorderLayout.NORTH);
        c.add(tombol[1], BorderLayout.SOUTH);
        c.add(tombol[2], BorderLayout.EAST);
        c.add(tombol[3], BorderLayout.WEST);
        c.add(tombol[4], BorderLayout.CENTER);
        setSize(500, 300);
    }
    public void actionPerformed(ActionEvent e){
        for (int i = 0; i < tombol.length; i++) {
            if (e.getSource()==tombol[i]) {
                tombol[i].setVisible(false);
            } else {
                tombol[i].setVisible(true);
                lout.layoutContainer(getContentPane());
            }
        }
    }
    public static void main(String[] args) {
        tes_3 dbl = new tes_3();
        dbl.setVisible(true);
        dbl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
