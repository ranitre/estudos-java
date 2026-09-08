package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Akamaru Sama","Tv Aberta",15,"Luta", "televisa");
//        anime.setNome("Konora Senpu");
//        anime.setTipo("TV Aberta");
//        anime.setEpisodios(15);
        //anime.init("Akamaru Sama","Tv Aberta",15,"Luta");
        anime.imprime();
    }

}
