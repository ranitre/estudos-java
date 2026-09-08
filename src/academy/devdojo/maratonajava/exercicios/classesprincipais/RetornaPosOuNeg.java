package academy.devdojo.maratonajava.exercicios.classesprincipais;

public class RetornaPosOuNeg {
    public String retorna(double numero) {
        if (numero == 0) {
            return "não é nem positivo nem negativo.";
        }
        else if (numero > 0) {
            return "Número Positivo";
        } else {
            return "Número Negativo";
        }
    }
}
