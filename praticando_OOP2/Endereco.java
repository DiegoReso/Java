package praticando_OOP2;

public class Endereco {
    
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public void exibirEndereco(){
        System.out.println("Endereco completo, rua: " + rua + ", numero: " + numero + " e cidade" + cidade);
    }

}
