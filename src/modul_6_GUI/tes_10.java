package modul_6_GUI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class tes_10 {
    private JButton b1, b2;
    private JTextField t1, t2;
    private JPanel panel1, panel2;
    private Label label1, label2;
    private JFrame frame;
    private double a, b, c;
    private String konv1 = "Suhu dalam Celcius adalah...";
    private String konv2 = "Suhu dalam Fahrenheit adalah...";

    public tes_10() {
        frame = new JFrame("Konversi Suhu");
        b1 = new JButton("Konversi ke Fahrenheit");
        b2 = new JButton("Konversi ke Celcius");
        label1 = new Label("Suhu dalam Celcius");
        label2 = new Label("Suhu dalam Fahrenheit");
        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b1.addActionListener(new FahrenheitHandler());
        b2.addActionListener(new CelciusHandler());

        panel1 = new JPanel();
        panel2 = new JPanel();

        panel1.add(label1);
        panel1.add(t1);
        panel1.add(b1);

        panel2.add(label2);
        panel2.add(t2);
        panel2.add(b2);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Celcius ke Fahrenheit", panel1);
        tabbedPane.addTab("Fahrenheit ke Celcius", panel2);

        frame.getContentPane().add(tabbedPane, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 100);
        frame.setVisible(true);
    }

    private class FahrenheitHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                a = Double.parseDouble(t1.getText());
                b = (a * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, konv2 + b, "Hasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Masukkan Angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private class CelciusHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                a = Double.parseDouble(t2.getText());
                c = (a - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, konv1 + c, "Hasil", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Masukkan Angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new tes_10();
        });
    }
}
