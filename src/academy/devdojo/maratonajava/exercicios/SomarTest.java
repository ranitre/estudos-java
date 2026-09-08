package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.Somar;

// Exercício 12
//Crie um método:
//somar(int a, int b)
//Que retorne a soma.
public class SomarTest {
    public static void main(String[] args) {
        Somar s = new Somar();
        int resultado = s.soma(40, 50);

        System.out.println(resultado);


    }
}
