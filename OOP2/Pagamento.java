package OOP2;

public interface Pagamento {

    //metodo abstrato
    void processarPagamento(double valor);
    
    //metodo com default
    default void exibirRecibo(double valor){
        System.out.println("Recibo de pagamento, com valor de R$ " + valor);
    }
} 