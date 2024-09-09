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

        boolean rodarNovamente = false;
        boolean fechar = false;

        // Inicio do programa com interação do usuario para tornar a experiencia mais pessoal
        System.out.print("Qual o seu nome? ");
        String nome = sc.next();

        do {
            do {

                int indexCategoria = categoria(nome);

                if (indexCategoria == -1) {
                    fechar = true;
                    break;
                }

                int indexProduto = produto(indexCategoria);

                if (indexProduto == -1) {
                    rodarNovamente = true;
                    System.out.println("Voltando ao menu anterior...");
                } else {
                    System.out.println(
                            "Deseja adicionar " + Produtos[indexCategoria][indexProduto] + " ao carrinho?\n" +
                                    "1- Sim\n" +
                                    "2- Não"
                    );
                    int addCarrinho = sc.nextInt();

                    if (addCarrinho < 1 || addCarrinho > 2) {
                        do {
                            System.out.print("Selecione uma opção valida: ");
                            addCarrinho = sc.nextInt();
                        } while (addCarrinho < 1 || addCarrinho > 2);
                    }

                    // Corrigindo comportamento de rodarNovamente
                    if (addCarrinho == 1) {
                        System.out.println("Adicionado com sucesso");
                        rodarNovamente = false; // Não precisa voltar
                    } else {
                        rodarNovamente = true; // Voltar ao menu de categorias
                    }
                }
            } while (!rodarNovamente);
            rodarNovamente = false;
        } while (!fechar);
        sc.close();
    }

    public static int categoria(String nome) {
        bancoDeDados banco = new bancoDeDados();
        ProcesadorDeCategoria Index = new ProcesadorDeCategoria();

        // Importação dos dados
        String[] categorias = banco.getCategorias();

        System.out.println("Bem vindo ao mercadinho, " + nome + "!!!\n");

        // Exibição da lista das categorias
        ExibirLista.exibir(categorias, true);

        System.out.print("\nEscolha uma categoria para comprar (0 para voltar): ");
        int indexCategoria = Index.processar(categorias, true); // Seleção da categoria

        // Se o usuário escolher 0, retornar -1 para indicar "Voltar"
        if (indexCategoria == -1) {
            return -1;
        }
        return indexCategoria;
    }

    public static int produto(int indexCategoria) {
        bancoDeDados banco = new bancoDeDados();
        ProcesadorDeCategoria Index = new ProcesadorDeCategoria();

        // Importação dos dados
        String[][] Produtos = banco.getProdutos();

        String categoriaSelecionada = Index.getItem(banco.getCategorias(), indexCategoria); // Variável para armazenar nome da categoria
        System.out.println("Categoria selecionada: " + categoriaSelecionada);

        // Exibição da lista de produtos
        System.out.println("Produtos em estoque: \n");
        ExibirLista.exibir(Produtos[indexCategoria], true);

        // Aguardar a seleção do produto
        System.out.println("Escolha um produto para comprar (0 para voltar): ");
        int indexProduto = Index.processar(Produtos[indexCategoria], true);

        // Se o usuário escolher 0, retornar -1 para indicar "Voltar"
        if (indexProduto == -1) {
            return -1;
        }
        return indexProduto;
    }
}
