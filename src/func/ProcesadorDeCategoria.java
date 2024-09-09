package func;

import java.util.Scanner;

public class ProcesadorDeCategoria {
    Scanner sc = new Scanner(System.in);

    public int processar(String[] categorias, boolean voltar) {
        int indexCategoria = sc.nextInt();

        // Se voltar for verdadeiro e o usuário escolher 0, retorna -1
        if (indexCategoria == 0) {
            return -1;
        }

        // Validação do índice
        if (indexCategoria > categorias.length || indexCategoria < 1) {
            do {
                System.out.print("Categoria inválida, tente novamente: ");
                indexCategoria = sc.nextInt();
            } while (indexCategoria > categorias.length || indexCategoria < 1);
        }

        return indexCategoria - 1; // Ajusta o índice para zero-based
    }

    public String getItem(String[] lista, int index) {
        return lista[index];
    }
}
