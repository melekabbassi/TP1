/*On veut réaliser un programme qui représente des montres et les gens qui les portent.
a. Ecrire la classe Montre sachant que :
• Une montre donne l'heure et les minutes.
• On peut initialiser une montre soit à partir d'un couple heure/ minute donné, soit en
utilisant l'heure affichée par une autre montre.
• Il doit être possible de faire avancer l'heure d'une montre en ajoutant une minute
(attention, les minutes sont limitées à 60 et les heures à 24).
b. Tester la classe Montre en créant un objet de type Montre permettant d’afficher l’heure
13h45 et une autre montre qui est un clone de la première.
c. Ecrire la classe Personne sachant que :
• Une personne a un nom et peut éventuellement porter une montre.
• On peut faire porter une montre donnée à une personne, si elle n'en a pas déjà une.
• On peut aussi lui enlever sa montre si elle en a une.
• Une personne peut demander l'heure à une autre, qui lui donne l'heure sous forme
d'une chaine de caractères, en consultant sa montre si elle en a une (sinon elle peut
retourner une chaine vide).
a. On veut faire en sorte que chaque montre ne soit portée que par une seule personne.
Proposer des ajouts/modifications des deux classes précédentes pour garantir cela.*/

public class Montre {
    private Integer hour;
    private Integer minute;

    public Montre(Integer hour, Integer minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Montre(Montre montre) {
        this.hour = montre.hour;
        this.minute = montre.minute;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public void addMinute(Integer minute) {
        this.minute += minute;
        if (this.minute > 59) {
            this.minute -= 60;
            this.hour++;
        }
        if (this.hour > 23) {
            this.hour -= 24;
        }
    }

    public void print() {
        System.out.println(this.hour + "h" + this.minute);
    }
    public static void main(String[] args) {
        
        Montre montre = new Montre(13, 45);
        montre.print();
        Montre montre2 = montre;
        montre2.print();
    }
}
