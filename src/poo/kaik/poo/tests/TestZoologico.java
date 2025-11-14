package poo.kaik.poo.tests;

import poo.kaik.orientacaoaobjetos.classeabstrata.Animal;
import poo.kaik.orientacaoaobjetos.classeabstrata.Cachorro;
import poo.kaik.orientacaoaobjetos.classeabstrata.Gato;

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
