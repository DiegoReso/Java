package praticando_OOP2;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    void getDetails(){
        System.out.println("Nome do funcionario: " + nome);
    }

    double calcularBonus(){
        return salario * .1;
    }
}
