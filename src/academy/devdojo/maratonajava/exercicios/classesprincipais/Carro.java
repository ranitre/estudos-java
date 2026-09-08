package academy.devdojo.maratonajava.exercicios.classesprincipais;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public double velocidade;

    public void acelerar() {
        this.velocidade += 10;
        System.out.println("Acelerando aumenta para " + this.velocidade + " Km/h");
    }

    public void frear() {
        if (this.velocidade - 10 < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= 10;
        }
        System.out.println("Freando diminui para " + this.velocidade + " Km/h");
    }
}
