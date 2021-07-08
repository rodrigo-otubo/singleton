package singletonmethodlazy;


public class MainSingletonMethodLazy {

    public static void main(String[] args) {
        ProdutoFactory2.getInstance().novoProduto(1);
        ProdutoFactory2.getInstance().novoProduto(2);
        ProdutoFactory2.getInstance().novoProduto(3);
    }

}