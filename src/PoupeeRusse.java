/*On veut écrire un programme simulant des poupées russes de différentes tailles. Chaque poupée
a une taille donnée, peut s'ouvrir ou se fermer, peut contenir une autre poupée et être contenue
dans une autre poupée.
Ecrire une classe PoupeeRusse contenant les méthodes suivantes :
• Un constructeur
• void ouvrir() : ouvre la poupée si elle n'est pas déjà ouverte et si elle ne se trouve pas à
l'intérieur d'une autre poupée
• void fermer() : ferme la poupée si elle n'est pas déjà fermée et si elle ne se trouve pas à
l'intérieur d'une autre poupée
• void placerDans(PoupeeRusse p) : place la poupée courante dans la poupée p si c'est
possible. Il faut que la poupée courante soit fermée et ne soit pas déjà dans une autre
poupée, que la poupée p soit ouverte et ne contienne aucune poupée, et que p soit d'une
taille supérieure à la poupée courante.
• void sortirDe(PoupeeRusse p) : sort la poupée courante de la poupée p si elle est dans p
et si p est ouverte.
*/
import java.util.Scanner;

public class PoupeeRusse {
    private Integer size;

    public PoupeeRusse(Integer size) {
        this.size = size;
    }

    public void ouvrir() {
        if (this.size == 0) {
            System.out.println("La poupée est déjà ouverte");
        } else {
            this.size = 0;
            System.out.println("La poupée est ouverte");
        }
    }

    public void fermer(){
        if (this.size == 1) {
            System.out.println("La poupée est déjà fermée");
        } else {
            this.size = 1;
            System.out.println("La poupée est fermée");
        }
    }

    public void placerDans(PoupeeRusse p){
        if (this.size == 0 && p.size == 1 && p.size > this.size) {
            p.size = 0;
            this.size = p.size;
            System.out.println("La poupée est dans la poupée");
        } else {
            System.out.println("La poupée ne peut pas être placée dans la poupée");
        }
    }

    public void SortirDe(PoupeeRusse p){
        if (this.size == 0 && p.size == 0) {
            p.size = 1;
            this.size = p.size;
            System.out.println("La poupée est sortie de la poupée");
        } else {
            System.out.println("La poupée ne peut pas être sortie de la poupée");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille de la poupée");
        Integer size = sc.nextInt();
        PoupeeRusse p = new PoupeeRusse(size);
        System.out.println("Entrez la taille de la poupée à placer dans la poupée");
        Integer size2 = sc.nextInt();
        PoupeeRusse p2 = new PoupeeRusse(size2);
        System.out.println("Entrez la taille de la poupée à sortir de la poupée");
        Integer size3 = sc.nextInt();
        PoupeeRusse p3 = new PoupeeRusse(size3);
        p.ouvrir();
        p.placerDans(p2);
        p.SortirDe(p3);
        p.fermer();
    }
}
