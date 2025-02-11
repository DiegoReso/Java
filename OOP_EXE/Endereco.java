package OOP_EXE;

public class Endereco {
    
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade){
        this.rua = rua;
        this.numero  = numero;
        this.cidade = cidade;
    }

    public void exibirEndereco(){
        System.out.println("O endereco esta localizado na rua: " + this.rua + ", numero: " + this.numero + " e na cidade " + this.cidade);
    }

}
