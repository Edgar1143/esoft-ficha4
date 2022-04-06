import javax.swing.*;
import java.awt.*;

public class JanelaDeEntrada extends JFrame{
    private JPanel panelEntrada;
    private JButton entrarButton;


    public JanelaDeEntrada(String title) {
        super(title);
        setContentPane(panelEntrada);
        pack();
    }

    public static void main(String[] args) {
        new JanelaDeEntrada("Gestão de finanças pessoais").setVisible(true);
    }
}


