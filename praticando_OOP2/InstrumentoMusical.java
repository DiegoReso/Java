package praticando_OOP2;

abstract class InstrumentoMusical {
    
    protected String nome;

    public InstrumentoMusical(String nome){
        this.nome = nome;
    }

    abstract void tocar();

    void exibirDetalhes(){
        System.out.println("Instrumento musical: " + nome);
    }

}
