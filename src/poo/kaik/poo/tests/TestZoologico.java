package poo.lucas.poo.tests;

import poo.lucas.orientacaoaobjetos.classeabstrata.Animal;
import poo.lucas.orientacaoaobjetos.classeabstrata.Cachorro;
import poo.lucas.orientacaoaobjetos.classeabstrata.Gato;

import java.util.ArrayList;
import java.util.List;

public class TestZoologico {

    static void main() {

        List<Animal> animais = new ArrayList<>();

        Animal c = new Cachorro("Rex");
        Animal g = new Gato("Frajola");

        animais.add(c);
        animais.add(g);

        for(Animal bicho : animais) {
            System.out.println("--Próximo Animal--");
            bicho.fazerSom();
            bicho.dormir();
        }

    }
}
