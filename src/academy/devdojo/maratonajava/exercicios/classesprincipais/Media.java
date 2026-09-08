package academy.devdojo.maratonajava.exercicios.classesprincipais;

public class Media {

    double soma = 0;

    public double calcularMedia(double[] notas) {
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
