// Ecrire la classe « Complex » qui permet de représenter un nombre complexe. Un nombre
// complexe est caractérisé par par sa partie réelle et sa partie imaginaire.
// • Définir deux constructeurs
// • Définir la méthode somme qui permet d’additionner deux nombres complexes.

import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }
    
    public Complex somme(Complex C){
        return new Complex(this.real + C.real, this.imaginary + C.imaginary);
    }

    public void show(){
        System.out.println("The real part of the complex number is: " + this.real);
        System.out.println("The imaginary part of the complex number is: " + this.imaginary);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number: ");
        double real = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginary = sc.nextDouble();
        Complex C = new Complex(real, imaginary);
        System.out.println("Enter the real part of the second complex number: ");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginary1 = sc.nextDouble();
        Complex C1 = new Complex(real1, imaginary1);
        C.show();
        C1.show();
        C.somme(C1).show();
    }
}
