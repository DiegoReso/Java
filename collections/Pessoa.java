package collections;

public class Pessoa {
    
    private Integer id;
    private String nome;
    private Integer idade;
    private String cidade;
    private String funcao;

    public Pessoa(Integer id, String nome, Integer idade, String cidade, String funcao){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.funcao = funcao;
    }

    Integer getId(){
        return id;
    }

    String getNome(){
        return nome;
    }

    Integer getIdade(){
        return idade;
    }

    String getCidade(){
        return cidade;
    }

    String getFuncao(){
        return funcao;
    }

    void setFuncao(String funcao){
        this.funcao = funcao;
    }

}
