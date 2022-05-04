public class Transacao {
    private int montante;
    private String descricao;
    private boolean isDespesa;

    public Transacao(int montante, String descricao, boolean isDespesa) {
        this.montante = montante;
        this.descricao = descricao;
        this.isDespesa = isDespesa;
    }

    public int getMontante() {
        return montante;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isDespesa() {
        return isDespesa;
    }
}
