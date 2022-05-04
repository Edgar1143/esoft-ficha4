import java.util.LinkedList;

public class DadosApp {

    private static final DadosApp instancia = new DadosApp();

    private Conta conta;
    private LinkedList<Transacao> transacoes;

    private DadosApp(){
        conta = new Conta();
        conta.adicionarDespesa(1000, "Iphone");
        conta.adicionarRecebimento(5000, "Ordenado");
    }

    public static DadosApp getInstancia(){
        return instancia;
    }

    public Conta getConta() {
        return conta;
    }
}
