package praticando_OOP2;

public class Veiculo {

    private String nome;
    private int anoFabricacao;

    public Veiculo(String nome, int anoFabricacao){
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
    }

    public String acelerar(){
        return "O veiculo"+ nome + "esta acelerando e seu ano de fabricacao eh " + anoFabricacao;
    }
}
