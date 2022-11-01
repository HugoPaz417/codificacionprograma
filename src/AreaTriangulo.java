import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular el área de un triángulo");
        System.out.println("Ingrese el valor de la base");
        double base = teclado.nextDouble();//Leemos un valor desde el teclado
        System.out.println("Ingrese el valor de a altura");
        double altura = teclado.nextDouble();//Leemos un valor desde el teclado
        double area = (base*altura)/2;
        System.out.println("El área del triángulo es: "+ area);
    }
}
