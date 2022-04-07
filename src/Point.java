/*Ecrire la classe « Point » ayant deux membres de type entier (coordonnées).
• Définir deux constructeurs pour la classe « Point »
• Définir la méthode « distance » permettant de calculer la distance entre deux points. */
import java.util.Scanner;

public class Point {
    private Integer x;
    private Integer y;
    
    public Point(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public double distance(Point P){
        return Math.sqrt(Math.pow(this.x - P.x, 2) + Math.pow(this.y - P.y, 2));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point: ");
        Integer x = sc.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        Integer y = sc.nextInt();
        Point P = new Point(x, y);
        System.out.println("Enter the x coordinate of the second point: ");
        Integer a = sc.nextInt();
        System.out.println("Enter the y coordinate of the first point: ");
        Integer b = sc.nextInt();
        Point P1 = new Point(a, b);

        System.out.println("The distance between the two points is: " + P.distance(P1));
    }
}
