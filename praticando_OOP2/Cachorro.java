package praticando_OOP2;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }

    void latir(){
        System.out.println(nome + " esta latindo");
    }


}
