package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Joana";
        nomes[1] = "Marcela";
        nomes[2] = "Pedro Sampaio";
        nomes[3] = "Sakura Uchiha";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
