package OOP;

public class LivroBiblioteca {
    
    private String title;
    private String writer;
    private boolean available;


    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setWriter(String writer){
        this.writer = writer;
    }

    public String getWriter(){
        return this.writer;
    }

    public boolean setAvailable(boolean available){
       return this.available = available;
    }

    public boolean getAvailable(){
        return this.available;
    }

    public void borrowBook(){
        if(getAvailable()){
            System.out.println("Feito emprestimo do livro");
            this.available = setAvailable(false);
        }else{
            System.out.println("Livro ja esta com um emprestimo em andamento");
        }
    }

    public void returnBook(){
        if(!getAvailable()){
            System.out.println("Livro devolvido do emprestimo");
            this.available = setAvailable(true);
        }else{
            System.out.println("O livro nao esta em nenhum  emprestimo para ser devolvido");
        }
    }
}
