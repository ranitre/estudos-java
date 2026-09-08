package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();

//        anime.setNome("Konora Senpu");
//        anime.setTipo("TV Aberta");
//        anime.setEpisodios(15);
        anime.init("Akamaru Sama","Tv Aberta",15,"Luta");
        anime.imprime();
    }

}
