package praticando_OOP2;

interface  Pagamento {

    public void processarPagamento(double valor);

    default void exibirRecibo(double valor){
        System.out.println("Recibo do pagamento, com valor de R$" + valor);
    }

}
