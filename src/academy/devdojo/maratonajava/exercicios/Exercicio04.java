package academy.devdojo.maratonajava.exercicios;

//Nível 2 - Estruturas de Repetição
//Exercício 4
//Imprima todos os números de 1 até 100.
public class Exercicio04 {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num; i++) {
            System.out.println("\nNumero: " + i);
            if (i % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
        }
    }

}
