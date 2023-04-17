public class Aeronaves {

    private int capacidade;
    private String nome,cod;
public Aeronaves(String umCod, String umNome,int umaCapaci){
    cod = umCod;
    nome = umNome;
    capacidade = umaCapaci;
}

public String getCodigo(){return cod;}

public String toString(){
    return "nome: " + nome + "  Capacidade: "+ capacidade+ "  Codigo: " + cod;
}

}
