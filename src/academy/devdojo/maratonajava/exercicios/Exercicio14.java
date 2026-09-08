package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.Carro;

// Exercício 16
//Crie uma classe:
//Carro
//Atributos:
//marca
//modelo
//ano
//velocidade
//Métodos:
//acelerar()
//Aumenta 10 km/h.
//frear()
//Diminui 10 km/h.
//Nunca pode ficar negativo.
public class Exercicio14 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "Volkswagen";
        carro.modelo = "Polo";
        carro.ano = 2026;
        carro.velocidade = 5;

        carro.acelerar();
        carro.frear();

    }

}
