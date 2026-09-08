package academy.devdojo.maratonajava.exercicios;
//Exercício 6
//Calcule a soma dos números de 1 até 100.
//Resultado esperado:
//5050
public class Exercicio05 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println("Total: "+soma);
    }
}
