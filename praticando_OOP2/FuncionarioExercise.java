package praticando_OOP2;

abstract class FuncionarioExercise {
    
    protected String nome;

    public FuncionarioExercise(String nome){
        this.nome = nome;
    }

    abstract double calcularSalario(double horas);


}
