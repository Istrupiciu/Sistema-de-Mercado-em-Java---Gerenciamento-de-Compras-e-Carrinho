package categorias;

public class bancoDeDados {
    private final String[] categorias = {
            "Comidas Embaladas",
            "Frutas e Vegetais",
            "Produtos de Limpeza",
            "Higiene Pessoal",
            "Bebidas",
            "Frios",
            "camisinha",
            "Album"
    };

    private final String[][] Produtos = {
            {"Feijão", "Arroz", "Macarão"},
            {"Maça", "Morango", "Laranja"},
            {"Água sanitaria", "Detergente", "Amaciante"},
            {"Sabonete"},
            {"Coca-Cola"},
            {"Queijo"},
            {"Jontex", "Prudence,", "Olla", "Blowtex", "Se liga", "Durex"},
            {"Construção - chico buarque"}
    };

    public String[] getCategorias() {
        return categorias.clone();
    }

    public String[][] getProdutos() {
        return Produtos.clone();
    }

}
