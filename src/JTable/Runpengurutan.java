package JTable;
import javax.swing.*;

public class Runpengurutan {
        public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                    UnsupportedLookAndFeelException ignored) {
            }
            //set image icon
            ImageIcon imageIcon = new ImageIcon("res/image.jpg");
            JFrame jFrame = new JFrame("form sorting");
            jFrame.setIconImage(imageIcon.getImage());
            jFrame.setContentPane(new Pengurutan().getrootPanel1());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(600, 300);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
        }
    }

