package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.Media;

// Exercício 14
//Crie um método:
//calcularMedia(double[] notas)
//Que retorne a média.
public class Exercicio11 {
    public static void main(String[] args) {
        Media m1 = new Media();

        double[] notas = new double[]{4, 5, 8, 10, 9, 8, 5};
        System.out.println(m1.calcularMedia(notas));
    }
}
