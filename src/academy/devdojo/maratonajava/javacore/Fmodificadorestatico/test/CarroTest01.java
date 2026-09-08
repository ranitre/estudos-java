package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
//        Carro c1 = new Carro("Mercedes", 280);
//        Carro c2 = new Carro("Ferrari", 270);
//        Carro c3 = new Carro("Audi", 290);
        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 190;
        System.out.println(Carro.velocidadeLimite);

//        c1.Imprime();
//        c2.Imprime();
//        c3.Imprime();
    }

}
