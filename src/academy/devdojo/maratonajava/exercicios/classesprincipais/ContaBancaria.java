package academy.devdojo.maratonajava.exercicios.classesprincipais;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void depositar(double valor) {
        System.out.println("Saldo atual: " + this.saldo);
        this.saldo += valor;
        System.out.println(valor + "Depositado com sucesso!" + "\n R$" + this.saldo);
    }

    public void sacar(double valor) {
        System.out.println("Saldo atual: " + this.saldo);
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.print(valor + " Sacado com sucesso!" + "\n R$" + this.saldo);
        } else {
            System.out.println(" Não permitir sacar mais do que possui.");
        }
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}

