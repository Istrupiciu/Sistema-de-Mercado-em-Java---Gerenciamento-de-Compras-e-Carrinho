package func;

public class ExibirLista {
    public static void exibir(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i + 1) + "- " + lista[i]);
        }
    }
}
