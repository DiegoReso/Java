public class Pessoa {

    private String nome;

    public void setNome(String nome){
        if(!nome.isEmpty() && nome != null){
            this.nome = nome;
        }else{
            System.out.println("Nome invalido");
        }
    }

    public String getNome(){
        return nome.toUpperCase();
    }
}
