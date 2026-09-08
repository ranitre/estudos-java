package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Gol Bola";
        carro.modelo = "G5";
        carro.ano = 2022;

        carro2.nome = "Hb20";
        carro2.modelo = "S";
        carro2.ano = 2025;

        System.out.println("-------- Carro 1---------");
        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);
        System.out.println("-------- Carro 2---------");
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
