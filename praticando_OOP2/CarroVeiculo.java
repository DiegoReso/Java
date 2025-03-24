package praticando_OOP2;

public class CarroVeiculo extends Veiculo {
    
    public CarroVeiculo(String nome, int anoFabricacao){
        super(nome,anoFabricacao);
    }

    @Override
    public String acelerar(){
        return "O carro esta acelarando";
    }
}
