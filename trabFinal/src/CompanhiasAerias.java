public class CompanhiasAerias {

    private  int cod;
    private String nome;
    public CompanhiasAerias(int umCod, String umNome) {
        cod = umCod;
        nome = umNome;
    }

    public  int getCodigo() {
        return cod;
    }
    public String getNome(){return nome;}
}