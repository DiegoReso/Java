package OOP;

public class Produto {

    private String name;
    private double preco;


    public void setNome(String name){

        if(name != null && !name.isEmpty() && name.length() > 3){
            this.name = name;
        }else{
            System.out.println("Nome do produto invalido");
        }

    }

    public String getName(){
        return name.toUpperCase();
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("O preco precisa ser positivo");
        }
    }

    public String getPreco(){
        return String.format("R$%.2f", preco);
    }

    public void getProtudoInfo(){
        System.out.println("O produto " + this.getName() + " tem o preco de " + this.getPreco());
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem > 0 && porcentagem < 100){
            double desconto = calcularDesconto(porcentagem);
            double precoFinal = preco - desconto;
            this.setPreco(precoFinal);
            System.out.println("Desconto de " + porcentagem + "% aplicado!");
            this.getProtudoInfo();
        }else{
            System.out.println("Valor da porcentagem invalido");
        }
    }

    private double calcularDesconto(double porcentagem){
        return (this.preco * porcentagem) / 100; 
    }
}
