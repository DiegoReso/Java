package praticando_OOP2;

public class CartaoCredito implements Pagamento {

    
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento via Cartao de Credito do valor " + valor);
    }

    @Override
    public void exibirRecibo(double valor){
        System.out.println("Alterando padrao da interface");
    }

}
