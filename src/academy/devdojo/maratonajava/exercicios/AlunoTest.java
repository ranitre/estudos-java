package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Fabio Andrade";
        aluno1.idade = 18;
        aluno1.nota1 = 5;
        aluno1.nota2 = 8;
        aluno1.nota3 = 9;

        aluno2.nome = "Larissa Larissinha";
        aluno2.idade = 19;
        aluno2.nota1 = 6;
        aluno2.nota2 = 8;
        aluno2.nota3 = 7;

        aluno3.nome = "Maria Andrade";
        aluno3.idade = 22;
        aluno3.nota1 = 7;
        aluno3.nota2 = 7;
        aluno3.nota3 = 8;

        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
    }

}
