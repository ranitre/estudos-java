package academy.devdojo.maratonajava.exercicios;
// Exercício 11
//Percorra um array de nomes.
//Imprima apenas os nomes que possuem mais de 5 letras.
public class Exercicio09 {
    public static void main(String[] args) {
        String[] nomes = new String[]{"João", "Maria", "Pedrolina", "Rafael", "Paulo Henrique"};
        for (String nome : nomes) {
            if (nome.length() > 5) {
                System.out.println(nome);
            }
        }
    }
}