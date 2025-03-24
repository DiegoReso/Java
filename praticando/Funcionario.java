public class Funcionario {
    
    public String nome;
    protected double salario;
    private String senha;


    public Funcionario(String nome, double salario, String senha){
        this.nome = nome;
        this.salario =  salario;
        this.senha = senha;
    }


    void exibirDados(){
        System.out.println("Nome: " + nome + ", salario: " + salario +  ", senha: " + senha);
    }

    protected void aumentarSalario(double porcentagem){
        this.salario += ((this.salario * porcentagem) / 100);
        System.out.println("O salario agora eh de : " + salario);
    }

    private boolean verificarSenha(String tentativaSenha){
        if(this.senha.equals(tentativaSenha)){
            System.out.println("Autenticado!");
            return true;
        }else{
            System.out.println("Falha na autenticacao");
            return false;
        }
    }

    boolean autenticar(String tentativaSenha){
        return verificarSenha(tentativaSenha);
    }
}
