package gui.table;

import gui.FormBiodata;

import javax.swing.*;
import java.net.URL;

public class RunExampleTable1 {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/image.jpg");
        JFrame jFrame = new JFrame("surat pernyataan");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new ExampleTable1().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
    }
}
