// Person has a name

public class Person {
    private String name;
    private Montre montre;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person person) {
        this.name = person.name;
        this.montre = person.montre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Montre getMontre() {
        return montre;
    }

    public void setMontre(Montre montre) {
        this.montre = montre;
    }

    public void addMontre(Montre montre) {
        if (this.montre == null) {
            this.montre = montre;
        }
    }

    public void removeMontre() {
        this.montre = null;
    }

    public void askHour(Person person) {
        if (this.montre != null) {
            person.addMontre(this.montre);
        }
    }

    public void print() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Person person = new Person("John");
        person.addMontre(new Montre(13, 45));
        person.print();
        Person person2 = new Person(person);
        person2.print();
        person.askHour(person2);
        person2.print();
    }
}
