package bloco_try_catch;

public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
