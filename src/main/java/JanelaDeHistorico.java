import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class JanelaDeHistorico extends JFrame{
    private JPanel panelHistorico;
    private LinkedList<Transacao> transacoes;

    public JanelaDeHistorico(LinkedList<Transacao> transacoes) {
        String[] columns = {"Nome", "Descrição", "Valor"};

        Object[][] data = {};

        JTable table = new JTable(data, columns);

        //panelHistorico.add(table);

        setContentPane(panelHistorico);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    }
}
