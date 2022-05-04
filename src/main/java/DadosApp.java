import java.util.LinkedList;

public class DadosApp {

    private static final DadosApp instancia = new DadosApp();

    private Conta conta;
    private LinkedList<Transacao> transacoes;

    private DadosApp(){
        conta = new Conta(transacoes);
    }

    public static DadosApp getDados(){
        return instancia;
    }
}
