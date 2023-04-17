import java.util.ArrayList;

public class GerenciadorAeroportos {

    private ArrayList<Aeroporto> lista;

    private GerenciadorAeroportos() {
        lista = new ArrayList<>();
    }

    private static GerenciadorAeroportos instance;

    public static GerenciadorAeroportos getInstance() {
        if (instance == null)
            instance = new GerenciadorAeroportos();
        return instance;

    }

    public void inserir(Aeroporto aeroporto) {
        lista.add( aeroporto );
    }
    public Aeroporto pesquisar(int cod) {
        for (Aeroporto aeroporto: lista) {
            if (Aeroporto.getCodigo() == cod)
                return aeroporto;
        }
        return null;
    }

    public String toString() {
        StringBuilder aux = new StringBuilder("\nCadastro de Aeroportos\n- - - - - - - - - - -\n");
        for (Aeroporto umAeroporto : lista) {
            aux.append( umAeroporto.toString() + "\n");
        }
        return aux.toString();
    }
}

