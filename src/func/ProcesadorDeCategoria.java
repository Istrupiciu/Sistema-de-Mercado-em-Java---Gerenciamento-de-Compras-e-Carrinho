package func;

import categorias.bancoDeDados;

import java.util.Scanner;


public class ProcesadorDeCategoria {
    Scanner sc = new Scanner(System.in);

    bancoDeDados banco = new bancoDeDados();

    public int processar(String[] categorias) {
        int IndexCategoria = sc.nextInt();

        if (IndexCategoria > categorias.length || IndexCategoria <= 0) {
            do {
                System.out.print("Categoria invalida tente novamente: ");
                IndexCategoria = sc.nextInt();
            } while (IndexCategoria > categorias.length || IndexCategoria <= 0);
        }

        IndexCategoria--;
        return IndexCategoria;
    }

    public String getItem(String[] lista, int index) {
        return lista[index];
    }
}