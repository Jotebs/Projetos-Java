package poo.calculoRetangulo;

public class Calculos {
    Retangulo ret = new Retangulo();

    public void calcularArea(double h, double w){
        ret.area = h * w;

        System.out.println("A área total do retângulo é de: " + ret.area);
    }

    public void calcularPerimetro(double h, double w){
        ret.perimetro = (h*2) + (w*2);

        System.out.println("O perímetro total do retângulo é de: " + ret.perimetro);
    }


}
