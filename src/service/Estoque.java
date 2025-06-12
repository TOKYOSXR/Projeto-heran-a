package service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Fruta;
public class Estoque {
    Scanner sc = new Scanner (System.in);
    private List<Fruta> ListaFruta;

    public Estoque(){
        ListaFruta = new ArrayList<>();
    }
    public void gerenciarEstoque(){

        Fruta fruta = new Fruta();
        System.out.println("Digite o nome da fruta: ");
        fruta.setNome(sc.next());
        System.out.println("Digite o preço da fruta: ");
        fruta.setPreco(sc.nextDouble());
        System.out.println("Digite a quantidade: ");
        fruta.setQuantidade(sc.nextInt());

        ListaFruta.add(fruta);
    }

    public void RemoverProduto(){
        System.out.println("Digite o nome da fruta que deseja remover: ");
        String nomePesquisado = sc.next();

        boolean removido = ListaFruta.removeIf(f -> f.getNome().equalsIgnoreCase(nomePesquisado));
        
        if(removido){
            System.out.println("Fruta removida com sucesso");
        }else{
            System.out.println("Fruta não encontrada");
        }

    }

    public void ListarProduto(){
        for(Fruta f : ListaFruta){
            System.out.println("Nome: " + f.getNome());
            System.out.println("Preço: " + f.getPreco());
            System.out.println("Quantidade: " + f.getQuantidade());
        }

    }

    public List<Fruta> getListaFruta(){
        return this.ListaFruta;
    }

    public void setListaFruta(List<Fruta> ListaFruta){
        this.ListaFruta = ListaFruta;
    }
    

}