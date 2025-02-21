package OOP_EXE;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios {

    private double salarioBase;
    

    public FuncionarioTempoIntegral(String nome, double salarioBase){
        super(nome);
        this.salarioBase = salarioBase;
        
    }

    @Override
    public void calcularSalario(){
        System.out.println("O salario do funcionario tempo integral eh:" + salarioBase);
    }

    @Override
    public void adicionarBeneficio(String beneficio){
        System.out.println("Beneficio adicionado ao funcionario tempo integral: " + beneficio);
    }
}
