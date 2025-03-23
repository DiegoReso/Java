public class ProdutoEletronico {
    private String nome;
    private double preco;
    private boolean garantia;

    public ProdutoEletronico(String nome, double preco, boolean garantia){
        this.nome = nome;   
        this.preco = preco;
        this.garantia = garantia;
    }

    double aplicarDesconto(double desconto){
       
      this.preco -= calculaDesconto(desconto);
      return this.preco;
      
        
    }

    double calculaDesconto(double desconto){
        return this.preco * desconto;
    }

    void getInfo(){
        System.out.println(garantia ? "Garantia ativa" : "Garantia Desativada" + "");
        System.out.println("Produto : " + nome + " com predo de : " + preco);
    }
}
