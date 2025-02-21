package reflection_api;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        
        try {
            Class<?> classePessoa = Class.forName("reflection_api.Pessoa");

            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);

            Object pessoa = construtor.newInstance("Diego", 25);
            
            Method metodoDizerOla = classePessoa.getMethod("dizerOla");
            metodoDizerOla.invoke(pessoa);

            Field campoNome = classePessoa.getDeclaredField("nome");

            campoNome.setAccessible(true);

            campoNome.set(pessoa, "Maria");
            metodoDizerOla.invoke(pessoa);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
