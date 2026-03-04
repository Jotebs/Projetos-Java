package arrays.operacoes;

import java.util.Scanner;

public class manipulacaoBasica {
    public static void main(String[] args) {
        //ler N numeros e armazenar em uma array
        //calcular: maior, menor, média e soma
        //exibir os calculos

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas posições vai ter o array?");
        int tamanhoArray = sc.nextInt();
        int[] arrayNum = new int[tamanhoArray];

        for(int i = 0; i < tamanhoArray; i++){
            System.out.print("Digite o número da posição " + i + " da array:");
            arrayNum[i] = sc.nextInt();
        }

        int maiorNum = arrayNum[0];
        int menorNum = arrayNum[0];
        int media = 0;
        int soma = 0;

        for(int i = 0; i < arrayNum.length; i++){
            soma += arrayNum[i];
            media = soma / tamanhoArray;

            if(maiorNum < arrayNum[i]){
                maiorNum = arrayNum[i];
            }
            if(menorNum > arrayNum[i]){
                menorNum = arrayNum[i];
            }
        }

        System.out.println("<----RESULTADOS---->)");

        System.out.println("O maior número é: " + maiorNum);
        System.out.println("O menor número é: " + menorNum);
        System.out.println("A média dos números da array é: " + media);
        System.out.println("A soma dos números da array é: " + soma);

    }
}
