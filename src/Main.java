import java.util.Scanner;

import categorias.bancoDeDados;
import func.ExibirLista;
import func.ProcesadorDeCategoria;

public class Main {
    public static void main(String[] args) {

        // Definição dos metodos
        Scanner sc = new Scanner(System.in);
        bancoDeDados banco = new bancoDeDados();
        ProcesadorDeCategoria Index = new ProcesadorDeCategoria();

        // Importação dos dados
        String[] categorias = banco.getCategorias();
        String[][] Produtos = banco.getProdutos();

        // Inicio do programa com interação do usuario para tornar a esperiencia mais pessoal
        System.out.print("Qual o seu nome seu nome? ");
        String nome = sc.next();
        System.out.println("Bem vindo ao mercadinho, " + nome + "!!!\n");

        // Exibição da lista das categorias
        ExibirLista.exibir(categorias);

        System.out.print("\nEscolha uma categoria para comprar: ");
        int indexCategoria = Index.processar(categorias);//Seleção da categoria

        String categoriaSelecionada = Index.getItem(banco.getCategorias(), indexCategoria);// Variavel para armazenar mome da categoria
        System.out.println("Categoria selecionada: " + categoriaSelecionada);

        // Exibição da lista de produtos
        System.out.println("Produtos em estoque: \n");
        ExibirLista.exibir(Produtos[indexCategoria]);

        // Pergunta se o usuario deseja adicionar um dos produtos listados no carrinho
        System.out.println("Deseja adicionar um produto no Carrino (S/N): ");
        String selecionarProd = sc.next();

        // Bloco de codigo destinado a conferir a resposta do usuario e trabalhar com a resposta
        if (!selecionarProd.equalsIgnoreCase("s") && !selecionarProd.equalsIgnoreCase("n")) {
            do {
                System.out.println("Escolha uma opção valida (S/N): ");
                selecionarProd = sc.next();
            }while (!selecionarProd.equalsIgnoreCase("s") && !selecionarProd.equalsIgnoreCase("n"));
        }

        switch (selecionarProd) {
            case "s" :
                System.out.println("Escolha uma categoria para comprar: ");
                int indexProduto = Index.processar(Produtos[indexCategoria]);
                System.out.println(indexProduto);
                break;
            case "n" :
                // Criar forma de voltar ao menu inicial
                System.out.println("Calma calabreso");
                break;
            }
    }
}