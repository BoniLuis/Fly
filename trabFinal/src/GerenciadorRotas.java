import java.util.ArrayList;

    public class GerenciadorRotas {

        private ArrayList<Rotas> lista;

        private GerenciadorRotas() {
            lista = new ArrayList<>();
        }

        private static GerenciadorRotas instance;

        public static GerenciadorRotas getInstance() {
            if (instance == null)
                instance = new GerenciadorRotas();
            return instance;

        }

        public void inserir(Rotas rota) {
            lista.add( rota );
        }

        public Rotas pesquisar(int cod) {
            for (Rotas rota: lista) {
                if (Rotas.getCodigo() == cod)
                    return rota;
            }
            return null;
        }

        public String toString() {
            StringBuilder aux = new StringBuilder("\nCadastro de Voos\n- - - - - - - - - - -\n");
            for (Rotas umRota : lista) {
                aux.append( umRota.toString() + "\n");
            }
            return aux.toString();
        }
    }



