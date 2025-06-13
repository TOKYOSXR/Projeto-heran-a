package model;

public class Fruta extends Produto{
    private String sabor;


    public Fruta(){
        super();
    }

    public Fruta(String nome, double preco, int quantidade){
        super(nome, preco, quantidade);
    }
}
