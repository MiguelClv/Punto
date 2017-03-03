import java.util.Scanner;

/**
 * Created by 54167208T on 03/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame una representacion grafica:");

        System.out.println("Valor de X:");
        double x = scanner.nextDouble();
        System.out.println("Valor de Y:");
        double y = scanner.nextDouble();

        Punto p1 = new Punto(x,y);
        p1.muestra();

        System.out.println("Vamos a desplazar la X:");
        double dx = scanner.nextDouble();
        p1.desplaza(dx);
        p1.muestra();

        System.out.println("Vamos a volver a desplazar la X, y con la Y!");
        System.out.println("X:");
        double dx2 = scanner.nextDouble();
        System.out.println("Y:");
        double dy2 = scanner.nextDouble();
        p1.desplaza(dx2,dy2);
        p1.muestra();

        System.out.println("Mostraremos la distancia Euclidea de los valores actuales con unos nuevos valores que pondras a continuacion!");
        System.out.println("X2:");
        double x2 = scanner.nextDouble();
        System.out.println("Y2:");
        double y2 = scanner.nextDouble();
        Punto p2 = new Punto(x2,y2);

        System.out.println("Distancia Euclidea:");
        System.out.println(p1.distanciaEuclidea(p2));
    }
}
