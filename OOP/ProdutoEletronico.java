package OOP;

public class ProdutoEletronico {
    private String name;
    private double price;
    private boolean warranty;


    public ProdutoEletronico(String name, double price, boolean warranty){
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    public double discount(double descount){
       return (this.price * descount) / 100;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Preco nao pode ser definido pois nao eh maior que zero");
        }
    }

    public void applyDiscount(double discount){
        if(discount > 0 && discount < 100){
            double priceOff = this.discount(discount);
            this.price = this.price - priceOff;
        }else{
            System.out.println("Desconto invalido");
        }
    }

    public void getInformation(){
        System.out.println("O produto " + this.name + " esta com desconto aplicado e seu valor final eh " + this.price + " e sua garantia esta na condicao: " + this.warranty);
    }

}
