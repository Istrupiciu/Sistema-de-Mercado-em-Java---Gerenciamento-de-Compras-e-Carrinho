package func;

public class ExibirLista {
    public static void exibir(String[] lista, boolean voltar) {
        if (voltar) {
            System.out.println("0- Voltar");
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i + 1) + "- " + lista[i]);
        }
    }
}
