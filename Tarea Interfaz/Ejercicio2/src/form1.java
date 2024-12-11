import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnValidar;
    private JLabel Label1;
    private JLabel Label2;
    public JPanel mainPanel;
    private JLabel Total;
    private JLabel lblTotal;
    private JButton btnMostrar;
    private JTextField loginTextField;

    private String resultadoValidacion = "";

    public form1() {
        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lblTotal.setText("Validando...");


                String usuario = textField1.getText();
                String contraseña = textField2.getText();

                if (usuario.equals("APELLIDO") && contraseña.equals("APELLIDO123")) {
                    resultadoValidacion = "Acceso correcto";
                } else {
                    resultadoValidacion = "Acceso incorrecto";
                }
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                lblTotal.setText(resultadoValidacion);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario de Validación");
        form1 form = new form1();
        frame.setContentPane(form.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
