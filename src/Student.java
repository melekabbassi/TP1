// Ecrire une classe « Student » avec les membres suivants :
// • nom (de type String),
// • note1, note2 (de type int)
// Le programme demande à l’utilisateur d’entrer le nom et les notes.
// Définir les méthodes suivantes :
// • calc_moy() permet de calculer la note moyenne.
// • show() permet d’afficher le nom et la note moyenne.
import java.util.Scanner;

public class Student {
    private String name;
    private int note1;
    private int note2;

    public Student(String name, int note1, int note2) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
    }

    public double calc_moy() {
        return (note1 + note2) / 2;
    }

    public void show() {
        System.out.println("The name of the student is: " + name);
        System.out.println("The average of the student is: " + calc_moy());
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the first note of the student: ");
        int note1 = sc.nextInt();
        System.out.println("Enter the second note of the student: ");
        int note2 = sc.nextInt();

        Student S = new Student(name, note1, note2);

        S.show();
    }    
}
