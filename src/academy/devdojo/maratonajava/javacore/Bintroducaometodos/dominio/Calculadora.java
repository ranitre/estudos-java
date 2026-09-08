package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(){
        System.out.println(30 + 50);
    }
    public void subtrairDoisNumeros() {
        System.out.println(50 - 20);
    }
    public void multiplicaDoisNumeros(int num1, int num2){       // utilizando parametros
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros (double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros (int num1, int num2){
        num1 = 50;
        num2 = 40;
        System.out.println("Dentro do Altera Dois Numeros");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
    }
    public void somaTodosNumeros(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);

    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
