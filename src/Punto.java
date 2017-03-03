/**
 * Created by 54167208T on 03/03/2017.
 */
public class Punto {
    private double x, y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void desplaza(double dx){
        x += dx;
    }

    public void desplaza(double dx, double dy){
        x += dx;
        y += dy;
    }

    public double distanciaEuclidea(Punto otro){
        double distanciaX = otro.x - this.x;
        double distanciaY = otro.y - this.y;

        double resutlado = Math.hypot(distanciaX,distanciaY);
        return resutlado;
    }

    public void muestra(){
        System.out.println("-Posiciones ACTUALES-");
        System.out.println("Punto X: "+x);
        System.out.println("Punto Y: "+y);
    }
}
