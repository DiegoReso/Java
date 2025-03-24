import java.util.Arrays;

public class Turma {
    
    private String[] alunos;

    public Turma(String[] alunos){
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }

    public String[] getAlunos(){
        return alunos;
    }

    void setAlunos(String[] alunos){
        if(alunos.length > 0){
            this.alunos = Arrays.copyOf(alunos, alunos.length);
        }else{
            System.out.println("Array esta vazio");
        }
    }
}
