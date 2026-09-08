package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 28;
        dias[0][1] = 30;
        dias[0][2] = 31;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}
