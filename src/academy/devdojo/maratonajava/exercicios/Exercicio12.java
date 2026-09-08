package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.RetornaPosOuNeg;
// Exercício 15
//Crie um método que receba um número.
//Se for positivo:
//Positivo
//Caso contrário:
//Negativo
public class Exercicio12 {
    public static void main(String[] args) {
        RetornaPosOuNeg valor = new RetornaPosOuNeg();

        double numero = -5;
        System.out.println(valor.retorna(numero));
    }
}
