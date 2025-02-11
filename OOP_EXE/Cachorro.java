package OOP_EXE;

public class Cachorro extends Animal{
    
    private String raca;
    
    public Cachorro(String nome, String som, String raca){
        super(nome,som);
        this.raca = raca;
    }

    public void exibirDetalhe(){
        System.out.println("O animal de nome: " + nome + ", da raca: " + raca + " esta emitindo o som: " + som + "!!" );
        this.emitirSom();
    }


}
