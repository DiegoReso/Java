package OOP2;

public class Processador {

    private String name;
    private int threads;
    private int core;

    public Processador(String name, int threads, int core){
        this.name = name;
        this.threads = threads;
        this.core = core;
    }

    public void getDetails(){
        System.out.println("Processador" + this.name + " com " + this.threads + " e com " + this.core + " nucleos!");
    }


}
