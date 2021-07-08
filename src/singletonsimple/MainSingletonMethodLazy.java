package singletonsimple;

public class MainSingletonMethodLazy {

    public static void main(String[] args) {
        ProdutoFactory.INSTANCE.novoProduto(1);
    }

}