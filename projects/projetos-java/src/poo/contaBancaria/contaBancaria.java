package poo.contaBancaria;

import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<---JALES SISTEMAS BANCÁRIOS--->");
        System.out.println("Qual o nome do titular da conta a ser criada?");
        Titular t1 = new Titular();
        t1.nomeTitular = sc.nextLine();

        int escolha = 0;
        acoesBancarias acao = new acoesBancarias();

        do{
            System.out.println("Olá, " +t1.nomeTitular+"! O que deseja fazer em sua conta?");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Finalizar programa");
            escolha = sc.nextInt();


            switch(escolha){
                case 1: acao.deposito();
                break;

                case 2: acao.saque();
                break;

                case 3: acao.verSaldo();
                break;
                
            }

        }while(escolha != 4);
        System.out.println("Obrigado pela preferência!");



    }
}
