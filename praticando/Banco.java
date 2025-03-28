import bloco_try_catch.SaldoInsuficienteException;

public class Banco {
    private double saldo;

    public Banco(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo Insuficiente, nao foi realizado o saque");
        }

        saldo -= valor;

        System.out.println("Saque realizado com sucesso, de : " + valor + " e seu saldo atual eh de: " + saldo);
    }
}
