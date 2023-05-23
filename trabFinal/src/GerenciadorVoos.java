import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voos> lista;

    private GerenciadorVoos() {
        lista = new ArrayList<>();
    }

    private static GerenciadorVoos instance;

    public static GerenciadorVoos getInstance() {
        if (instance == null)
            instance = new GerenciadorVoos();
        return instance;

    }

    public void inserir(Voos voo) {
        lista.add( voo );
    }
    public Voos pesquisar(int cod) {
        for (Voos voo: lista) {
            if (voo.getCodigo() == cod)
                return voo;
        }
        return null;
    }

    public String toString() {
        StringBuilder aux = new StringBuilder("\nCadastro de Voos\n- - - - - - - - - - -\n");
        for (Voos umVoo : lista) {
            aux.append( umVoo.toString() + "\n");
        }
        return aux.toString();
    }
}
