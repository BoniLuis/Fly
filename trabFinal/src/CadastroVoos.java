import java.util.ArrayList;

public class CadastroVoos {

    private ArrayList<Voos> lista;

    private CadastroVoos() {
        lista = new ArrayList<>();
    }

    private static CadastroVoos instance;

    public static CadastroVoos getInstance() {
        if (instance == null)
            instance = new CadastroVoos();
        return instance;

    }

    public void inserir(Voos voo) {
        lista.add( voo );
    }

    public void inserir(int umCod, String umNome) {
        lista.add( new Voos(umCod, umNome) );
    }

    public Voos pesquisar(int cod) {
        for (Voos voo: lista) {
            if (Voos.getCodigo() == cod)
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
