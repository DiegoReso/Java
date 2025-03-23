public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public LivroBiblioteca(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    void setPegarEmprestadoLivro(){
        if(disponivel){
            this.disponivel = false;
            System.out.println("Livro foi pego para emprestimo");
        }else{
            System.out.println("Livro ja se encontra em um emprestimo");
        }

    }

    void setDevolverLivro(){
        if(!disponivel){
            this.disponivel = true;
            System.out.println("Livro foi devolvido do emprestimo");
        }else{
            System.out.println("Ainda nao foi feito emprestimo do livro para ser devolvido");
        }
        ;
    }

    void getInfoLivro(){
        System.out.println("Livro de titulo " + titulo + " e de autor " + autor);
        System.out.println(disponivel ? "Disponivel para emprestimo" : "Livro ja esta em um emprestimo");
    }

}
