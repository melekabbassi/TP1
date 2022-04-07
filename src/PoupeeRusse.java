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
    private Boolean isOpen;
    private Boolean isIn;

    //Constructor
    public PoupeeRusse(Integer size) {
        this.size = size;
        this.isOpen = false;
    }
    //getters and setters
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsIn() {
        return isIn;
    }

    public void setIsIn(Boolean isIn) {
        this.isIn = isIn;
    }

    //methods

    public Boolean isInPoupee() {
        return false;
    }

    // function ouvrir if not open and not in another poupee
    public void ouvrir() {
        if (!isOpen && !isInPoupee()) {
            isOpen = true;
        }
    }

    // function fermer if open and not in another poupee
    public void fermer() {
        if (isOpen && !isInPoupee()) {
            isOpen = false;
        }
    }

    // function placerDans if size > p.size and p is open and not in another poupee
    public void placerDans(PoupeeRusse p) {
        if (size > p.size && p.isOpen && !p.isInPoupee()) {
            p.isOpen = false;
            isOpen = true;
            isIn = true;
        }
    }

    //function sortirDe if p is open and p is in another poupee
    public void sortirDe(PoupeeRusse p) {
        if (p.isOpen && p.isInPoupee()) {
            p.isOpen = false;
            isOpen = true;
            isIn = false;
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

        System.out.println("La poupée est fermée : " + p.isOpen);
        p.ouvrir();
        System.out.println("La poupée est ouverte : " + p.isOpen);
        
        p2.sortirDe(p);
        System.out.println("La poupée est sortie de la poupée : " + p2.isInPoupee());
        
        p2.ouvrir();
        System.out.println("La poupée est ouverte : " + p2.isOpen);
        
        p3.sortirDe(p2);
        System.out.println("La poupée est sortie de la poupée : " + p3.isInPoupee());
        
        p3.ouvrir();
        System.out.println("La poupée est ouverte : " + p3.isOpen);
        
        p3.fermer();
        System.out.println("La poupée est fermée : " + p3.isOpen);
        
        p3.placerDans(p2);
        System.out.println("La poupée est dans la poupée : " + p3.isInPoupee());
        
        p2.fermer();
        System.out.println("La poupée est fermée : " + p2.isOpen);
        
        p2.placerDans(p);
        System.out.println("La poupée est dans la poupée : " + p2.isInPoupee());
        
        p.fermer();
        System.out.println("La poupée est fermée : " + p.isOpen);
    }
}
