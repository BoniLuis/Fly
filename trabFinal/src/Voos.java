import java.time.LocalDateTime;
import java.time.Duration;

public class Voos {
    public enum Status {CONFIRMADO, ATRASADO, CANCELADO};

    private LocalDateTime datahora;
    private Duration duracao;
    private Rotas rota;
    private Status status;
    public Voos(int umCod, String umNome) {

    }
    public static int getCodigo() {
        return getCodigo();
    }
}