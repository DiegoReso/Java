package praticando_OOP2;

public class FuncionarioTempoIntegral extends FuncionarioExercise implements Beneficios {

    private double salario;

    public FuncionarioTempoIntegral(String nome, double salario){
        super(nome);
        this.salario = salario;
    }

    
    @Override
    public double calcularSalario(double horas){
        return salario *= horas;
    }

    @Override
    public double adicionarBeneficio(double valor){
        return salario += valor;
    }
}
