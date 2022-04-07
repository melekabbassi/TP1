//Ecrire une classe « Rectangle » ayant deux variables « a » et « b » et une fonction membre « surface() » qui retournera la surface du rectangle.
import java.util.Scanner;

public class Rectangle {
    private double a;
    private double b;

    //constructor
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double surface(double a, double b){
        return a*b;
    }

    public static void main(String[] args) throws Exception {      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double b = sc.nextDouble();

        Rectangle R = new Rectangle(a, b);

        System.out.println("The surface of the rectangle is: " + R.surface(a, b));
    }
}
