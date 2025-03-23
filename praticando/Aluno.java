public class Aluno {
    
    private String nome;
    private String matricula;
    private int notaFinal;


    public Aluno(String nome, String matricula, int notaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public void setNome(String nome){
        if(!nome.isEmpty() && nome != null){
            this.nome = nome;
        }else{
            System.out.println("Nome invalido");
        }
        
    }

    public void setNotaFinal(int notaFinal){
        if(notaFinal > 0 && notaFinal <= 100){
            this.notaFinal = notaFinal;
        }
    }

    public void getInfo(){
        System.out.println("Nome do aluno eh: " + nome + " de matricula numero: " + matricula + " e sua nota final foi " + notaFinal);
    }
}
