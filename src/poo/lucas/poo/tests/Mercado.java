package poo.lucas.poo.tests;

import poo.lucas.orientacaoaobjetos.classes.Produto;

import java.util.Arrays;

public class Mercado {

    static void main() {

        Produto produtos[] = {
                new Produto(2, "Arroz", 4.5f),
                new Produto(1, "Feijão", 8.6f),
                new Produto(3, "Macarrão", 3.8f)
        };
        Arrays.sort(produtos);
        System.out.println(Arrays.toString(produtos));
    }
}
