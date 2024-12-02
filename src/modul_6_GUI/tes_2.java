package modul_6_GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class tes_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Contoh Dialog");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JOptionPane.showConfirmDialog(f, "Ini adalah sebuah contoh dialog..", "Ini contoh dialognya tau!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }
}
