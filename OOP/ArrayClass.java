package OOP;

import java.util.Arrays;

public class ArrayClass {
    
    private String[] alunos;


    public ArrayClass(String[] alunos){
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }

    public String[] getAlunos(){
        return Arrays.copyOf(alunos, alunos.length);
    }

    public void setAlunos(String[] alunos){
        if(alunos.length > 0){
            this.alunos = Arrays.copyOf(alunos, alunos.length);
        }
    }
}
