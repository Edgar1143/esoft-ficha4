import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {
    private JPanel panel1;
    private JButton sairButton;
    private JButton fazerUmRegistoButton;
    private JButton visualizarOHistóricoButton;
    private JTextField textSaldo;


    public JanelaPrincipal(String title) {
        super(title);
        setContentPane(panel1);
        pack();

        mostrarSaldo();

        sairButton.addActionListener(this::buttonSairActionPerformed);
    }

    private void buttonSairActionPerformed(ActionEvent event) {
        System.exit(0);
    }

    public void mostrarSaldo() {
        DadosApp da = DadosApp.getInstancia();

        textSaldo.setText("" + da.getConta().getSaldo());
    }


    public static void main(String[] args) {
        new JanelaPrincipal("Gestão de finanças pessoais").setVisible(true);
    }
}
