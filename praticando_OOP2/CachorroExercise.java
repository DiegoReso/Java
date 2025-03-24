package praticando_OOP2;

public class CachorroExercise extends AnimalExercise {

    private String raca;

    public CachorroExercise(String raca, String nome, String som){
        super(nome, som);
        this.raca = raca;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do cachorro " + nome  + ", esta emitindo o som " + som + " e de raca " + raca );
    }
}
