package OOP2;

public class TransferenciaBancaria implements Pagamento {
    
    @Override

    public void processarPagamento(double valor){
        System.out.println("Pagamento transferencia bancaria de R$ " + valor);
    }
}
