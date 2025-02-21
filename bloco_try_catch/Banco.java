package bloco_try_catch;

public class Banco {
    
    private double saldo;


    public Banco(double saldo){
        this.saldo = saldo;
    }

    public void sacar (double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar: " + valor);
        }


        this.saldo -= saldo;
        System.out.println("Saque realizado com sucesso, de : " + valor);
    }
}
