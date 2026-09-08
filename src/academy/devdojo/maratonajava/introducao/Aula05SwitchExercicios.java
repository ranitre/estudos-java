package academy.devdojo.maratonajava.introducao;

public class Aula05SwitchExercicios {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia util ou final de semana
        // considerando 1 como domingo
        byte diaEscolhido = 2;
        switch (diaEscolhido) {

            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia ùtil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;


//            case 1:
//                System.out.println("Final de Semana");
//                break;
//            case 2:
//                System.out.println("Dia Útil");
//                break;
//            case 3:
//                System.out.println("Dia Útil");
//                break;
//            case 4:
//                System.out.println("Dia Útil");
//                break;
//            case 5:
//                System.out.println("Dia Útil");
//                break;
//            case 6:
//                System.out.println("Dia Útil");
//                break;
//            case 7:
//                System.out.println("Final de Semana");
//                break;
//            default:
//                System.out.println("Opção Inválida");
//                break;
        }
    }

}
