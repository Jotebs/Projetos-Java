package poo.elevador;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        Metodos metodo = new Metodos();

        do{
            System.out.println("<---MENU DO ELEVADOR--->");
            System.out.println("1 - Subir");
            System.out.println("2 - Descer");
            System.out.println("3 - Entrar");
            System.out.println("4 - Sair");
            System.out.println("5 - Encerrar programa");
            escolha = sc.nextInt();


            switch(escolha){
                case 1: metodo.subir();
                    break;
                case 2: metodo.descer();
                    break;
                case 3: metodo.entrar();
                    break;
                case 4: metodo.sair();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Insira uma opção válida para prosseguir.");
            }
        }while(escolha != 5);


    }
}
