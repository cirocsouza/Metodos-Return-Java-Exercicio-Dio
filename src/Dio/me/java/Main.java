package Dio.me.java;

public class Main {

    public static void main(String[] args) {

        //Quadrilátero
        //Retornos

        System.out.println("Exercício Quadrilátero e função Return.");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do Trapézio: " + areaTrapezio);

        //Losango

        double areaLosango = Quadrilatero.area(5f,5f);
        System.out.println("Área do Losango: " + areaLosango);
    }
}
