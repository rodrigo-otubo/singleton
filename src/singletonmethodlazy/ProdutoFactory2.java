package singletonmethodlazy;

public class ProdutoFactory2 {

    private static ProdutoFactory2 instance;

    private ProdutoFactory2(){}

    /* method lazy
       utilizado para ter realmente somente uma instancia, por isso da verificacao
    */
    public static ProdutoFactory2 getInstance(){
        if (instance == null){
            return new ProdutoFactory2();
        }
        return instance;
    }

    // factory - fabrica de objetos
    public Produto2 novoProduto(int tipoProduto){
        switch (tipoProduto){
            case 1:
                return new ProdutoPadrao2();
            case 2:
                return new ProdutoDigital2();
            case 3:
                return new ProdutoFisico2();
            default:
                throw new IllegalArgumentException();
        }
    }

}
