import java.util.ArrayList;

public class GerenciadorCias {

    private ArrayList<CompanhiasAerias> lista;

    private GerenciadorCias() {
        lista = new ArrayList<>();
    }

    private static GerenciadorCias instance;

    public static GerenciadorCias getInstance() {
        if (instance == null)
            instance = new GerenciadorCias();
        return instance;

    }

    public void inserir(Companhias cia) {
        lista.add( cia );
    }

    public CompanhiasAerias pesquisar(int cod) {
        for (CompanhiasAerias cia: lista) {
            if (CompanhiasAerias.getCodigo() == cod)
                return cia;
        }
        return null;
    }

    public String toString() {
        StringBuilder aux = new StringBuilder("\nCadastro de Companhias Aéreas\n- - - - - - - - - - -\n");
        for (CompanhiasAerias umaCia : lista) {
            aux.append( umaCia.toString() + "\n");
        }
        return aux.toString();
    }
}