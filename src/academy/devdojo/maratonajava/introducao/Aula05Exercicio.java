package academy.devdojo.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        // 0 ate 34,712   i =  9,70%
        // 34,713 ate 68,507  i = 37,35%
        // 68,508   i = 49,50%

        double salario = 69000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if(salario <= 34712){
            valorImposto = salario * primeiraFaixa;
        }else if(salario >= 34713 && salario <= 68507){
            valorImposto = salario * segundaFaixa;
        }else{
            valorImposto = salario * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
