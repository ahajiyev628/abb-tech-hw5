import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Human mother = new Human();
        Human father = new Human();
        Human child = new Human();
        Pet p = new Pet();
        Family family = new Family();

        child.setName("Michael");
        child.setSurname("Karleone");
        child.setYear(1990);
        child.setIq(50);

        Human[] childs = family.addChild(child);
        for(Human ch : childs) System.out.println(ch.toString());

        // family.deleteChild(0);

        family.countFamily();

        // System.out.println(family.toString());

        // System.out.println(p.toString());
    }
}