package view;
import java.util.Scanner;
import service.Estoque;
public class Atendente {

    private Scanner sc;
    
    Estoque estoque = new Estoque();

    public Atendente(){
        sc = new Scanner(System.in);
    }

    public void menuPrincipal(){
        int escolha;
        do{
        System.out.println("=====Frutaria do Jonas=====");
        System.out.println("1 - Cadastrar Fruta");
        System.out.println("2 - Listar Frutas");
        System.out.println("3 - Remover Fruta");
        System.out.println("--------------------------");
        System.out.println("0 - Sair");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        escolha = sc.nextInt();
        escolhaMenu(escolha);
        }while(escolha != 0);
        
    }

    

    public void escolhaMenu(int escolha){

        switch (escolha) {
            case 1 -> estoque.gerenciarEstoque();
            case 2 -> estoque.ListarProduto();
            case 3 -> estoque.RemoverProduto();
            case 0 -> System.out.println("Saindo do Sistema...");
        }

    }

    public Scanner getSc(){
        return sc;
    }

    public void setSc(Scanner sc){
        this.sc = sc;
    }
    
}
