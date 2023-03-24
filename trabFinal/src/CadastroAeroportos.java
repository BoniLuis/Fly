import java.util.ArrayList;

public class CadastroAeroportos {

    private ArrayList<Aeroporto> lista;

    private CadastroAeroportos() {
        lista = new ArrayList<>();
    }

    private static CadastroAeroportos instance;

    public static CadastroAeroportos getInstance() {
        if (instance == null)
            instance = new CadastroAeroportos();
        return instance;

    }

    public void inserir(Aeroporto aeroporto) {
        lista.add( aeroporto );
    }

    public void inserir(int umCod, String umNome) {
        lista.add( new Aeroporto(umCod, umNome) );
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

