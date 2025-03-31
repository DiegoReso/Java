package generics;

public class ObjetoGenerico<T> {
    
    private T conteudo;

    public void adicionar(T conteudo){
        this.conteudo = conteudo;
    }

    public T obter(){
        return conteudo;
    }
}
