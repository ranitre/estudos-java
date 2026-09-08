package academy.devdojo.maratonajava.exercicios.classesprincipais;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public int comprar(int quantidade){
        return this.quantidade += quantidade;
    }
    public int vender (int quantidade){
        if(quantidade > 0 && this.quantidade >= quantidade){
            return this.quantidade -= quantidade;
        }else {
            return 0;
        }
    }
    public void mostrarEstoque(){
        System.out.println("Produto: "+this.nome);
        System.out.println("Preço: "+this.preco + " R$");
        System.out.println("Estoque: "+this.quantidade + " unidades");

    }
}
