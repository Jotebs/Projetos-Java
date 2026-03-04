package basico.loops;


import java.util.Scanner;
import java.util.Random;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int randomNum = gerador.nextInt(101);
        String statusNumUser = "";
        int contador = 0;

        for(int i = 0; i < 100; i++){

            System.out.println("Digite um número: ");
            int userNum = sc.nextInt();

            if(userNum < randomNum){
                statusNumUser = "MAIOR";
            }else if(userNum > randomNum){
                statusNumUser = "MENOR";
            }
            contador++;

            if(userNum == randomNum){
                System.out.println("Parabéns, você acertou, era o número " + randomNum);
                System.out.println("Seu número total de tentativas foi de: " + contador);
                break;
            }else{
                System.out.println("Que pena, você errou, tente novamente. O número que eu escolhi é " + statusNumUser);
            }
        }



    }
}
