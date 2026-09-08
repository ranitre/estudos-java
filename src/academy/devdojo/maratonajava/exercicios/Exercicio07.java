package academy.devdojo.maratonajava.exercicios;

//Nível 3 - Arrays
//Exercício 8
//Crie um array com 10 números.
//Depois:
//•	mostre todos
//•	informe o maior
//•	informe o menor
public class Exercicio07 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 4, 100, 60, 70, 80, 90, 500};
        int maior = numeros[0];
        int menor= numeros[0];

        System.out.println("Todos os valores: ");
        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.println("Todos os valores: "+ numeros[cont]);
            if (numeros[cont] > maior) {
                maior = numeros[cont];
            } if(numeros[cont] < menor){
                menor = numeros[cont];
            }
        }
        System.out.println("Maior número:\n "+ maior);
        System.out.println("Menor número:\n "+ menor);
    }
}
