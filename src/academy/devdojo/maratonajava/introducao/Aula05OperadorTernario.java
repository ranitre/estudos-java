package academy.devdojo.maratonajava.introducao;

public class Aula05OperadorTernario {
    public static void main(String[] args) {
        double salario = 7000;
        String mensagemDoar = "Tenho condicões e irei doar para o devDojo";
        String mensagemNaoDoar = "Nao tenho condições, mas ainda terei";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; // condicional ? verdadeiro : falso
        System.out.println(resultado);
    }
}
