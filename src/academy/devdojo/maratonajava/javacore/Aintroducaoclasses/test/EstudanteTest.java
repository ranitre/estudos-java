package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();  // criação do objeto "Estudante()",
                                                // o "estudante" é a variavel de referencia
        // Inicialização dos atributos
        estudante.nome = "Sakura Haruno";
        estudante.idade = 28;
        estudante.sexo = 'F';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
    }

}
