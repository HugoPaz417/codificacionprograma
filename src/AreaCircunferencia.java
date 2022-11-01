import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular el área de una circunferencia");
        System.out.println("Ingrese el valor del radio");
        double radio = teclado.nextDouble(); //Leemos un valor desde el teclado
        double area = (radio * radio) * 3.141592;
        System.out.println("El área de la circunferencia es "+ area);
    }
}
