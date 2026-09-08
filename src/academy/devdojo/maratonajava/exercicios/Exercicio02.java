package academy.devdojo.maratonajava.exercicios;

// Receba um ano.
//Informe se ele é bissexto.
//Dica:
//•	divisível por 4 → bissexto
//•	caso contrário → não é.
public class Exercicio02 {
    public static void main(String[] args) {
        int[] anos = {2000, 2024, 2025, 2026, 2027, 2028};
        for (int i = 0; i < anos.length; i++) {
            int ano = anos[i];
            if (ano % 4 == 0) {
                System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
            }

        }

    }
}
