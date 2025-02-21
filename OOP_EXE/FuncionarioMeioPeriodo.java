package OOP_EXE;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios {

    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioMeioPeriodo(String nome, double salarioPorHora, int horasTrabalhadas){
        super(nome);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularSalario(){
        System.out.println("Salario do funcionario meio periodo: " + (salarioPorHora * horasTrabalhadas));
    }

    @Override
    public void adicionarBeneficio(String beneficio){
        System.out.println("Beneficio adicionado ao funcionario meio periodo " + beneficio);
    }
}
