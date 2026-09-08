package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticaoEx02 {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // condição: valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + ": R$ " + valorParcela);
        }
    }
}
