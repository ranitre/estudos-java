package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.ContaBancaria;
// Exercício 17
//Classe ContaBancaria
//Atributos
//titular
//saldo
//Métodos
//depositar(double valor)
//sacar(double valor)
//Não permitir sacar mais do que possui.
public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("João Bosco");
        conta.setSaldo(5000);

        conta.depositar(3500);
        conta.sacar(4000);
    }
}
