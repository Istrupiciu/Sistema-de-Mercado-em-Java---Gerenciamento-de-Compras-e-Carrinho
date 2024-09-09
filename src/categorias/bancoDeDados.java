package categorias;

public class bancoDeDados {
    private final String[] categorias = {
            "Comidas Embaladas",
            "Frutas e Vegetais",
            "Produtos de Limpeza",
            "Higiene Pessoal",
            "Bebidas",
            "Frios"
    };

    private final String[][] Produtos = {
            {"Feijão", "Arroz", "Macarrão"},
            {"Maçã", "Morango", "Laranja"},
            {"Água sanitária", "Detergente", "Amaciante"},
            {"Sabonete"},
            {"Coca-Cola"},
            {"Queijo"}
    };

    public String[] getCategorias() {
        return categorias.clone();
    }

    public String[][] getProdutos() {
        return Produtos.clone();
    }
}
