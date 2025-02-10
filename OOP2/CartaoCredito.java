package OOP2;

public class CartaoCredito implements Pagamento {


    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento com cartao de credito no valor "  + valor );
    }

}
