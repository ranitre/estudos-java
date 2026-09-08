package academy.devdojo.maratonajava.exercicios;

// Exercício 7
//Mostre a tabuada de um número.
//Exemplo:
//Entrada:
//7
//Saída:
//7 x 1 = 7
//7 x 2 = 14
public class Exercicio06 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Multiplicação: ");
        for (int cont = 1; cont <= 10; cont++) {
            int multiplicacao = num * cont;
            System.out.println(num + " x " + cont + "= " + multiplicacao);
        }
        System.out.println("Divisão: ");
        for (int cont = 1; cont <= 10; cont++) {
            int aux = num * cont;
            int divisao = aux / num;
            System.out.println(aux + " / " + num + "= " + divisao);
        }
        System.out.println("Soma: ");
        for (int cont = 1; cont <= 10; cont++) {
            int soma = num + cont;
            System.out.println(num + " + " + cont + "= " + soma);
        }
        System.out.println("Subtração: ");
        for (int cont = 1; cont <= 10; cont++) {
            int subtrair = num - cont;
            System.out.println(num + " - " + cont + "= " + subtrair);
        }
    }
}