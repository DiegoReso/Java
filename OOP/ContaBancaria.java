package OOP;

public class ContaBancaria {
    
    private String titular;
    private double saldo;


    public void setTitular(String titular){
        
        if(titular != null && !titular.isEmpty()){
            this.titular = titular;
        }else{
            System.out.println("Nome do titular invalido");
        }

    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("O valor do saldo precisa ser positivo");
        }
    }

    public String getSaldo(){
        return "R$ " + saldo;
    }

}
