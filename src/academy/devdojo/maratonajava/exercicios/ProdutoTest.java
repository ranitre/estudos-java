package academy.devdojo.maratonajava.exercicios;

import academy.devdojo.maratonajava.exercicios.classesprincipais.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Sabão em Pó";
        produto.preco = 18.50;
        produto.quantidade = 10;

        produto.comprar(5);
        produto.vender(5);

        produto.mostrarEstoque();

    }
}
