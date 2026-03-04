package basico.strings;

import java.util.Scanner;

public class verificadorPalindromos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("<----VERIFICADOR DE PALÍNDROMOS---->");

        System.out.print("Digite uma palavra ou frase:");
        String texto = entrada.nextLine();

        //Conversão do texto para minúsculo e remoção de espaços
        String semEspacos = texto.replaceAll(" ", "");
        String textoFormatado = semEspacos.toLowerCase();

        //Variável invertendo o texto pra checar palindromo
        String textoInverso = new StringBuilder(textoFormatado).reverse().toString();

        if(textoInverso.equals(textoFormatado)){
            System.out.println("Essa frase/palavra é um palíndromo!");
        }else{
            System.out.println("Não é um palíndromo.");
        }
    }
}

