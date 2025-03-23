public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    //passando valores para iniciar o objeto com valores fallback
    public Livro(){
        this.titulo = "As peripecias de dieguin";
        this.autor = "Cailane dos Reis";
        this.preco = 25.22;
    }

    //override
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    void getInfo(){
        System.out.println("O livro de titulo " + titulo + " do autor " + autor + " e preco de apenas " + preco );
    }
}
