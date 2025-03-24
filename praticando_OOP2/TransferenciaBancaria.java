package praticando_OOP2;

public class TransferenciaBancaria implements Pagamento{
    
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento via transferencia bancaria no valor de " + valor);
    }
}
