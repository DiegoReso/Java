package OOP_EXE;

public class Main {
    public static void main(String[] args) {
        //exercicio1
        Endereco end1 = new Endereco("travessa dona", 20, "Volta Redonda");
        Pessoa diego = new Pessoa("Diego Reis", 34, end1);
        diego.exibirDetalhes();


        //exercicio2
        Carro carro = new Carro();
        carro.acelerar();

        Moto moto = new Moto();
        moto.acelerar();

        //exercicio3
        Cachorro cachorro = new Cachorro("Cachorro", "Latindo", "Vira Lata");
        cachorro.exibirDetalhe();

        //exercicio4
        FuncionarioMeioPeriodo fmp = new FuncionarioMeioPeriodo("Diego", 500, 25);
        FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral("Taiwane",10000);

        fmp.calcularSalario();
        fmp.adicionarBeneficio("VA");

        fti.calcularSalario();
        fti.adicionarBeneficio("Plano de saude e VA");

        //exercicio5

        Pilotavel meuHidroAviao = new Hidroaviao();
        Navegavel meuBarco  = new Barco();
        Pilotavel meuAviao = new Aviao();

        meuHidroAviao.pilotar();

        meuBarco.navegar();

        meuAviao.pilotar();

        operarVeiculo(meuAviao);
        operarVeiculo(meuBarco);
        operarVeiculo(meuHidroAviao);


    }

    public static void operarVeiculo(Object veiculo){
        if(veiculo instanceof Pilotavel){
            System.out.println("O veiculo eh pilotavel");
        }
        
        if(veiculo instanceof Navegavel){
            System.out.println("Veiculo eh Navegavel");
        }
    }
}
