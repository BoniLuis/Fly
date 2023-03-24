import java.util.ArrayList;

public class CadastroCias {

    private ArrayList<Companhias> lista;

    private CadastroCias() {
        lista = new ArrayList<>();
    }

    private static CadastroCias instance;

    public static CadastroCias getInstance() {
        if (instance == null)
            instance = new CadastroCias();
        return instance;

    }

    public void inserir(Companhias cia) {
        lista.add( cia );
    }

    public void inserir(int umCod, String umNome) {
        lista.add( new Companhias(umCod, umNome) );
    }

    public Companhias pesquisar(int cod) {
        for (Companhias cia: lista) {
            if (Companhias.getCodigo() == cod)
                return cia;
        }
        return null;
    }

    public String toString() {
        StringBuilder aux = new StringBuilder("\nCadastro de Companhias Aéreas\n- - - - - - - - - - -\n");
        for (Companhias umaCia : lista) {
            aux.append( umaCia.toString() + "\n");
        }
        return aux.toString();
    }
}