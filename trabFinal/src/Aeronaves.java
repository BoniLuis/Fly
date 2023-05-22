public class Aeronaves {

    private int capacidade;
    private String descrição,cod;
public Aeronaves(String umCod, String umaDescrição,int umaCapaci){
    cod = umCod;
    descrição = umaDescrição;
    capacidade = umaCapaci;
}

public String getCodigo(){return cod;}

public String toString(){
    return "Descrição: " + descrição + "  Capacidade: "+ capacidade+ "  Codigo: " + cod;
}

}
