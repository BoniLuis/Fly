package PACKAGE_NAME;public class GerenciadorDeAeronaves {

public class GerenciadorDeAeronaves {
    private ArrayList<Aeronaves> Lista;
    private StringBuilder rel;

    public GerenciadorDeAeronaves(){Lista = new ArrayList<>();}

    public void Inserir(Aeronaves aero){Lista.add(aero);}

    public String ListarTodas(){
        StringBuilder rel = new StringBuilder("Lista de Aeronaves"+"\n"+"------------------"+"\n");
        for (Aeronaves listar: Lista) {
            rel.append(listar.toString()+"\n");
        }
        return rel.toString();
    }

    public Aeronaves buscarPorCodigo(String umCod){
        for (Aeronaves umaAero: Lista) {
            if(umaAero.getCodigo()==umCod) return umaAero;
        }
            return null;

    }

}
