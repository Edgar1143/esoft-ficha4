import java.text.SimpleDateFormat;
import java.util.Date;

public class Transacao {
    private int montante;
    private String descricao;
    private boolean isDespesa;
    private String datePattern = "dd-MM-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
    String date;
    private Categoria categoria;

    public Transacao(int montante, String descricao, boolean isDespesa) {
        this(montante, descricao, isDespesa, null);
    }

    public Transacao(int montante, String descricao, boolean isDespesa, Categoria categoria) {
        this.montante = montante;
        this.descricao = descricao;
        this.isDespesa = isDespesa;
        this.categoria = categoria;
        this.date = simpleDateFormat.format(new Date());
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

    public String getDate() {
        return date;
    }


}
