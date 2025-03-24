package praticando_OOP2;

public class MotoVeiculo extends Veiculo {

    public MotoVeiculo(String nome, int anoFabricacao){
        super(nome,anoFabricacao);
    }

    @Override
    public String acelerar(){
        return "A motoca esta acelerando, VRUMMM";
    }
}
