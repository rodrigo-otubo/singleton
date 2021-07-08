package singletonsimple;

public class ProdutoFactory {
    /*
    Singleton - nao utilizamos assim, pois muitos lugares podem ter essa instancia
    devido ser publica
    */
    public static final ProdutoFactory INSTANCE = new ProdutoFactory();

    private ProdutoFactory(){}

    // factory - fabrica de objetos
    public Produto novoProduto(int tipoProduto){
        switch (tipoProduto){
            case 1:
                return new ProdutoPadrao();
            case 2:
                return new ProdutoDigital();
            case 3:
                return new ProdutoFisico();
            default:
                throw new IllegalArgumentException();
        }
    }

}
