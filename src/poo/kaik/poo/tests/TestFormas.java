package poo.lucas.poo.tests;

import poo.lucas.orientacaoaobjetos.classeabstrata.Circulo;
import poo.lucas.orientacaoaobjetos.classeabstrata.Forma;
import poo.lucas.orientacaoaobjetos.classeabstrata.Quadrado;

public class TestFormas {
    static void main() {

        Forma f1 = new Circulo("Vermelho", 5.0);
        Forma f2 = new Quadrado("Azul", 3.5);

        System.out.println("--Círculo--");
        System.out.println("Cor: " + f1.getCor());
        System.out.println("Área: " + f1.calcularArea());

        System.out.println("--Quadrado--");
        System.out.println("Cor: " + f2.getCor());
        System.out.println("Área: " + f2.calcularArea());
    }
}
