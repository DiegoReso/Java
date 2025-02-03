package OOP;

public class ContaCorrente {
    private String accountHolder;
    private double balance = 0;
    private double withdrawalLimit;


    public void setAccountHolder(String accountHolder){
        if(accountHolder != null && !accountHolder.isEmpty()){
            this.accountHolder = accountHolder;
        }else{
            System.out.println("Nome invalido");
        }
    }

    public String getAccountHolder(){
        return this.accountHolder;
    }

    public void setWithDrawalLimit(double withdrawalLimit){
        if(withdrawalLimit > 0){
            this.withdrawalLimit = withdrawalLimit;
        }else{
            System.out.println("Limite de saque precisa ser maios que zero");
        }
    }

    public void deposit(double value){
        if(value > 0) {
            this.balance = this.balance + value;
        }
    }
    
    public void withDrawal(double value){
        if(value <= this.balance && value <= withdrawalLimit){
            this.balance = this.balance - value;
        }else{
            System.out.println("Valor maior do que o seu limite de saque");
        }
    }

    public double getBalance(){
        return this.balance;
    }

}
