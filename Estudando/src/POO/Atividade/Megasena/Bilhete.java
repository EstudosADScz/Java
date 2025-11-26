package POO.Atividade.Megasena;

import java.util.Arrays;

public class Bilhete {
    private int[] numeros;
    private int quantidadeAtual;

    public Bilhete() {
        this.numeros = new int[6];
        this.quantidadeAtual = 0;
    }

    public void adicionarNumero(int numero) throws IllegalArgumentException {
        if (numero < 1 || numero > 60) {
            throw new IllegalArgumentException("Erro: O número deve ser entre 1 e 60.");
        }

        for (int i = 0; i < quantidadeAtual; i++) {
            if (numeros[i] == numero) {
                throw new IllegalArgumentException("Erro: Número duplicado.");
            }
        }

        if (quantidadeAtual >= 6) {
            throw new IllegalArgumentException("Erro: O bilhete já está completo.");
        }

        numeros[quantidadeAtual] = numero;
        quantidadeAtual++;
    }

    public boolean estaCompleto() {
        return quantidadeAtual == 6;
    }

    public int[] getNumerosOrdenados() {
        Arrays.sort(numeros);
        return numeros;
    }
}