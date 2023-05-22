public class Rotas {

    private CompanhiasAerias cia;
    private Aeroporto destino;
    private Aeroporto origem;
    private Aeronaves aeronave;
    private  int cod;
    private String nome;
    public Rotas(int umCod, String umNome, CompanhiasAerias umCia, Aeroporto umdestino, Aeroporto umOrigem, Aeronaves umaAeronave) {
        cia = umCia;
        destino = umdestino;
        origem = umOrigem;
        aeronave = umaAeronave;
        cod = umCod;
        nome = umNome;
    }

    public  int getCodigo(){return cod;}
    public CompanhiasAerias getCompanhia(){return cia;}
    public Aeroporto getDestino(){return destino;}
    public Aeroporto getOrigem(){return origem;}
    public String getNome(){return nome;}
    public Aeronaves getAeronave(){return aeronave;}
}

