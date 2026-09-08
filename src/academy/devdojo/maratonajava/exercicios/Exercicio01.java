package academy.devdojo.maratonajava.exercicios;

// Crie um programa que receba dois números e mostre qual é o maior.
public class Exercicio01 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 15;
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}
