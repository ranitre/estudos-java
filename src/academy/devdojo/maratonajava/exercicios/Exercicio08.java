package academy.devdojo.maratonajava.exercicios;
//Exercício 9
//Receba um array de 10 posições.
//Conte quantos números são pares.
public class Exercicio08 {
    public static void main(String[] args) {
        int[] array = {10,15,200,80,100,115,365,24,13,18};
        int numerosPares = 0;
        int numerosImpares = 0;
        int somaNumerosPares = 0;
        int somaTotal = 0;
        double media = 0;
        for(int cont = 0; cont < array.length; cont++){
            somaTotal = somaTotal + array[cont];
            if(array[cont] %2 == 0 )
            {
                numerosPares++;
                somaNumerosPares = somaNumerosPares + array[cont];
            }else {
                numerosImpares++;
            }
        }
        media = somaTotal / array.length;
        System.out.println("Quantidade de números pares é: "+numerosPares);
        System.out.println("Quantidade de números ímpares é: "+numerosImpares);
        System.out.println("Soma dos números pares: "+somaNumerosPares);
        System.out.println("Soma total: "+somaTotal);
        System.out.println("Media: " +media);
    }
}
