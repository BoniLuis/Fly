public class Aeroporto{

    private  int cod;
    private String nome;
    private Geo loc;
    public Aeroporto(int umCod, String umNome, Geo umLoc) {
        this.cod = umCod;
        this.nome = umNome;
        this.loc = umLoc;
    }

    public Geo getLoc() {
        return loc;
    }

    public  int getCodigo() {
        return cod;
    }
    public String getNome(){return nome;}

}
