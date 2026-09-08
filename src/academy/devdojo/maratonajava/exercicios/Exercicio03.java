package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.CalculadoraEx;

//Exercício 3 - Calculadora usando Switch
//Receba:
//•	número 1
//•	número 2
//•	operação (+ - * /)
//Exemplo
//10
//20
//+
//
//Resultado = 30
public class Exercicio03 {
    public static void main(String[] args) {

        CalculadoraEx calculadora = new CalculadoraEx();
        char operacao = '/';
        switch (operacao)
        {
            case '+':
                calculadora.somarDoisNumeros(10,20);
                break;
            case '-':
                calculadora.subtrairDoisNumeros(10,20);
                break;
            case '*':
                calculadora.multiplicaDoisNumeros(10,20);
                break;
            case '/':
                calculadora.divideDoisNumeros(10,20);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

    }
}
