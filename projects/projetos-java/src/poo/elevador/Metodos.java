package poo.elevador;


import java.util.Scanner;

public class Metodos {
    Elevador elevador = new Elevador();
    Scanner sc = new Scanner(System.in);
    int andaresASubir;
    int andaresADescer;
    int pessoasAEntrar;
    int pessoasASair;

    public void subir(){
        System.out.println("Quantos andares você quer subir? andar atual: " + elevador.andarAtual);
        andaresASubir = sc.nextInt();

        if((elevador.andarAtual + andaresASubir) > elevador.totalAndares){
            System.out.println("Erro: não existe um andar válido nesse prédio.");
        }else{
            elevador.andarAtual += andaresASubir;
            System.out.println("Agora o elevador se encontra no andar " + elevador.andarAtual);
        }

    }

    public void descer(){
        System.out.println("Quantos andares você quer descer? andar atual: " + elevador.andarAtual);
        andaresADescer = sc.nextInt();

        if((elevador.andarAtual - andaresADescer) < 0){
            System.out.println("Erro: não existe um andar válido nesse prédio.");
        }else{
            elevador.andarAtual -= andaresADescer;
            System.out.println("Agora o elevador se encontra no andar " + elevador.andarAtual);
        }


    }

    public void entrar(){
        System.out.println("Quantas pessoas vão entrar? lotação atual: " + elevador.pessoasDentro);
        pessoasAEntrar = sc.nextInt();

        if((elevador.pessoasDentro + pessoasAEntrar) > elevador.capacidade){
            System.out.println("Erro: a quantidade supera a lotação máxima do elevador.");
        }else{
            elevador.pessoasDentro += pessoasAEntrar;
            System.out.println("Agora o elevador possui " + elevador.pessoasDentro + " pessoas dentro.");
        }

    }

    public void sair(){
        System.out.println("Quantas pessoas vão sair? lotação atual: " + elevador.pessoasDentro);
        pessoasASair = sc.nextInt();

        if((elevador.pessoasDentro - pessoasASair) < 0){
            System.out.println("Erro: Insira um número de pessoas válido.");
        }else{
            elevador.pessoasDentro -= pessoasASair;
            System.out.println("Agora o elevador possui " + elevador.pessoasDentro + " pessoa(s) dentro.");
        }

    }

}
