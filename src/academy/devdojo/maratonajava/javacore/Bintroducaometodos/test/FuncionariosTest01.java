package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.setNome("João Inácio");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{5000, 5600, 6000});

        funcionario.imprime();
        funcionario.mediaSalario();
    }
}
