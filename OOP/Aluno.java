package OOP;

public class Aluno {


    private String name;
    private int studentId;
    private int finalMark;

    public Aluno(String name, int studentId, int finalMark){
        this.name = name;
        this.studentId = studentId;
        this.finalMark = finalMark;
    }

    public void setName(String name){
        if(name != null && name.length() > 3){
            this.name = name;
            System.out.println("Nome cadastrado com sucesso");
        }else{
            System.out.println("Entre com um nome valido");
        }
    }

    public String getName(){
        return this.name;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public void setFinalMark(int finalMark){
        if(finalMark >= 0 && finalMark <= 100){
            this.finalMark = finalMark;
        }else{
            System.out.println("Nota invalida!");
        }
    }

    public void getInformation(){
        System.out.println("O nome do aluno eh: " + this.name + " sua matricula eh: " + this.studentId + " e sua nota final foi " + this.finalMark);
    }

}
