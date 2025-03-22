public class Main{

    public static void main(String[] args) {
        
        Cachorro hanna = new Cachorro("Hanna", 8);
        hanna.emitirSom();

        Carro uno = new Carro();
        uno.acelerar();
        uno.name = "Fiat Uno";
        uno.marca = "Fiat";
        uno.anoFabricacao = 1965;
        System.out.println(uno.name);

        Pessoa joao = new Pessoa();
        joao.setNome(null);
        System.out.println("O nome da pessoa eh: " + joao.getNome());
        
    }

}