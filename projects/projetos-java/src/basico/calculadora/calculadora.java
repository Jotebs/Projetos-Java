package basico.calculadora;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float resultado = 0;

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Qual operação deseja fazer? ");
        String opr = entrada.nextLine();

        switch(opr){
            case "+": resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;

            case "-": resultado = num1 - num2;
                System.out.println("O resultado é: " + resultado);
            break;

            case "/": resultado = num1 / num2;
                System.out.println("O resultado é: " + resultado);
            break;

            case "*": resultado = num1 * num2;
                System.out.println("O resultado é: " + resultado);
            break;

            default:
                System.out.println("O operador escolhido é inválido.");
        }


    }
}
