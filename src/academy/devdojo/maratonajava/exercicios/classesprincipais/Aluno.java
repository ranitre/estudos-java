package academy.devdojo.maratonajava.exercicios.classesprincipais;

public class Aluno {
    public String nome;
    public int idade;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia(){
       double media = (this.nota1 + this.nota2 + this.nota3) / 3;
        return media;
    }
    public String aprovado(){
        double media = calcularMedia();
        if(media >= 7){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }

    public void imprime(){
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nota1: " + this.nota1);
        System.out.println("Nota2: " + this.nota2);
        System.out.println("Nota3: " + this.nota3);
        System.out.println("Media: " + this.calcularMedia());
        System.out.println("Situação: " + this.aprovado());
    }
}
