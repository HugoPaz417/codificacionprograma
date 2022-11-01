/**
 * Esta clase sirve para mostrar el funcionamiento de la libreria Math en java
 * misma que sirve para trabajar con funciones de tipo matemático
 */
public class LibreriaMath {
    public static void main(String[] args) {
        double numero = 9;
        //función para calcular la raíz cuadrada de un número
        System.out.println("Cálculo de la raíz cuadrada");
        double raiz = Math.sqrt(numero);
        System.out.println("El resultado de la raíz es: "+ raiz);
        //función para calcular la potencia de un número
        System.out.println("Cálculo de una potencia de un número");
        double exp = 3;
        double potencia = Math.pow(numero, exp);
        System.out.println("El resultado del número elevado al cuadrado es: "+ potencia);
        int a;
        int b;
        int c;
        //c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) );
    }
}
