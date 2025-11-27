package POO.Exceptions;

import java.io.File;
import java.io.IOException;

public class Aula1 {
    public static void main(String args[]){
        try {
            criarArquivo("teste.txt");
            System.out.println("Arquivo criado com sucesso");
        } 
        catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }
        finally {
            System.out.println("Fim do programa");
        }
    }

    private static void criarArquivo(String arquivo) throws IOException {
        File file = new File(arquivo);
        file.createNewFile();
    }
    
}
