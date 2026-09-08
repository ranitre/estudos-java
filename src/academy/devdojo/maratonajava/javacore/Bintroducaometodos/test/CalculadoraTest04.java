package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 10;
        int b = 20;
        calculadora.alteraDoisNumeros(a,b);    //  aqui está chamando minha variavel primitiva, pois o metodo
                                                // não altera, continua original inserido na classe principal
        System.out.println("Dentro do Calculadora test 04");
        System.out.println("Numero 1: "+ a);
        System.out.println("Numero 2: " +b);
    }
}
