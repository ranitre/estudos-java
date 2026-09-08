package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais {

    public static void main(String[] args) {
        int idade = 19;
        String categoria;
        if(idade < 15){
            categoria =  "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }

}
