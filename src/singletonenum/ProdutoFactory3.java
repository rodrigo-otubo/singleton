package singletonenum;

enum ProdutoFactory3 {
    INSTANCE;

    // factory - fabrica de objetos
    public Produto3 novoProduto(int tipoProduto){
        switch (tipoProduto){
            case 1:
                return new ProdutoPadrao3();
            case 2:
                return new ProdutoDigital3();
            case 3:
                return new ProdutoFisico3();
            default:
                throw new IllegalArgumentException();
        }
    }

}
