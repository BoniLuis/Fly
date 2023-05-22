import java.time.LocalDateTime;
import java.time.Duration;

public class Voos {
    //public enum Status {CONFIRMADO, ATRASADO, CANCELADO};

    private LocalDateTime datahora;
    private Duration duracao;
    private Rotas rota;
    private Status status;
    private int cod;
    private String nome;
    public Voos(int umCod, String umNome, Duration umaDuração,Status umStatus) {
      cod = umCod;
      nome = umNome;
      status = umStatus;
      datahora = LocalDateTime.now();
    }
    public  int getCodigo() {
        return cod;
    }
    public LocalDateTime getDatahora() {
        return datahora;
    }
    public Duration getDuracao() {
        return duracao;
    }
    public Rotas getRota() {
        return rota;
    }
    public Status getStatus() {
        return status;
    }
    public int getCod() {
        return cod;
    }
    public String getNome() {
        return nome;
    }

    
}