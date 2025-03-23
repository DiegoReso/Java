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
}
