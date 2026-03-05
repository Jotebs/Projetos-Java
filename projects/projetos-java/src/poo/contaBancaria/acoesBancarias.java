package poo.contaBancaria;
import java.util.Scanner;

public class acoesBancarias {
    Titular t1 = new Titular();
    public void deposito(){
        Scanner sc = new Scanner(System.in);
        double deposito;

        System.out.println("Quanto você quer depositar?");
        deposito = sc.nextDouble();

        t1.saldoAtual += deposito;

        System.out.println("Depósito feito com sucesso! Agora o saldo atual é de: R$" + t1.saldoAtual);
        System.out.println("<---------------------->");
        System.out.println("VOLTANDO AO MENU PRINCIPAL");
        System.out.println("<---------------------->");


    }

    public void saque(){
        Scanner sc = new Scanner(System.in);
        double saque;

        System.out.println("Quanto você quer sacar?");
        saque = sc.nextDouble();

        if(saque > t1.saldoAtual){
            System.out.println("Insira um valor válido para saque");
            System.out.println("<---------------------->");
            System.out.println("VOLTANDO AO MENU PRINCIPAL");
            System.out.println("<---------------------->");
            return;
        }else{
            t1.saldoAtual -= saque;
        }

        System.out.println("Saque feito com sucesso! Agora o saldo atual é de: R$" + t1.saldoAtual);
        System.out.println("<---------------------->");
        System.out.println("VOLTANDO AO MENU PRINCIPAL");
        System.out.println("<---------------------->");


    }

    public void verSaldo(){
        System.out.println("Seu saldo atual é de: R$" + t1.saldoAtual);

        System.out.println("<---------------------->");
        System.out.println("VOLTANDO AO MENU PRINCIPAL");
        System.out.println("<---------------------->");
    }
}
