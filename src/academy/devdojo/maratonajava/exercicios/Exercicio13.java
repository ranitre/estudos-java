package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.Pessoa;
// Crie uma classe:
//Pessoa
//com atributos:
//nome
//idade
//altura
//Depois crie um método:
//apresentar()
//Saída:
//Olá!
//
//Meu nome é João
//Tenho 25 anos
//Minha altura é 1.80
public class Exercicio13 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.nome = "João";
        p1.idade = 25;
        p1.altura = 1.80;

        p1.apresentar();
    }
}
