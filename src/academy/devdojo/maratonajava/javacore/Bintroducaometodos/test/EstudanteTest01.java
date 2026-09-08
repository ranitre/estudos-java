package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante.nome = "Naruto Uzumaki";
        estudante.sexo = 'M';
        estudante.idade = 15;

        estudante2.nome = "Hinata Hyuuga";
        estudante2.sexo = 'F';
        estudante2.idade = 14 ;

        impressora.imprime(estudante);
        impressora.imprime(estudante2);

    }
}
