package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysForeach {
    public static void main(String[] args) {
        int[] numeros = {5,4,3,2,1};
        for(int num : numeros){
            System.out.println(num);
        }
    }
}
// Foreach funciona da seguinte maneira (usando o exemplo acima):
// 1°: num = numeros[0];
//System.out.println(num);   obs: vai imprimir o numeros no indice 0 do array, ou seja o número "5"
// e repete para todes:
// 2°: num = numeros[1];
// System.out.println(num);  vai imprimir o número "4" e assim por diante....