package poo.calculoRetangulo;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        Scanner sc = new Scanner(System.in);
        Calculos calc = new Calculos();

        System.out.print("Qual a altura do retângulo? ");
        ret.altura = sc.nextInt();

        System.out.print("Qual a largura do retângulo? ");
        ret.largura = sc.nextInt();

        calc.calcularArea(ret.altura, ret.largura);
        calc.calcularPerimetro(ret.altura, ret.largura);


    }
}
