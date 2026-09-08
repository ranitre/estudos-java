package academy.devdojo.maratonajava.exercicios.classesprincipais;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;

    public void apresentar(){
        System.out.println("Olá!\n"+"Meu nome é "+this.nome+" \ntenho "+this.idade+" anos");
        System.out.println("Minha altura é "+this.altura);
    }
}
