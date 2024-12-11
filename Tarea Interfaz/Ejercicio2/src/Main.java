import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicación de login");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,768);
        frame.setPreferredSize(new Dimension(1024,768));
        frame.pack();
        frame.setVisible(true);


    }
}