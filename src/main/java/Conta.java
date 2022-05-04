import java.util.LinkedList;

public class Conta {
    private LinkedList<Transacao> transacoes;

    public Conta() {
        this.transacoes = new LinkedList<>();
    }

    public LinkedList<Transacao> getTransacoes() {
        return transacoes;
    }

    public int size(){
        return transacoes.size();
    }

    //requisito 1
    public void adicionarDespesa(int montante, String descricao){
        transacoes.add(new Transacao(montante, descricao, true));
    }

    //requisito 2
    public void adicionarRecebimento(int montante, String descricao){
        transacoes.add(new Transacao(montante, descricao, false));
    }


    //requisito 9
    public double getSaldo(){
        double saldo = 0;
        for (Transacao transacao: transacoes) {
            if(transacao.isDespesa()){
                saldo -= transacao.getMontante();
            } else {
                saldo += transacao.getMontante();
            }
        }
        return saldo;
    }
}
