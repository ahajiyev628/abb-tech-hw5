import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Family extends Human {
    public Family(String name, String surname, int year, Human mother, Human father) {
        super(name, surname, year, mother, father);
    }

    static Human mother = new Family("Tito", "Karleone",1960,new Human("Allahverdi", "Hajiyev"), new Human("Allahverdi", "Hajiyev"));
    static Human father = new Family("Vito", "Karleone", 1945, new Human("Allahverdi", "Hajiyev"), new Human("Allahverdi", "Hajiyev"));

    static Human child = new Family("Micheal", "Karleone", 1977, new Human(mother.getName(), mother.getSurname()), new Human(father.getName(), father.getSurname()));

    static Pet p = new Pet("dog", "Rock", 5, new String[]{"eat", "drink", "sleep"});

    static ArrayList<Human> parents = new ArrayList<>();
    static ArrayList<Human> children = new ArrayList<>();
    static ArrayList<Pet> pets = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        parents.add(mother);
        parents.add(father);
        children.add(child);
        pets.add(p);

        HashMap<Integer, ArrayList<Human>> family = new HashMap<>();
        family.put(1, parents);
        family.put(2, children);

        System.out.println("number of children in the family: " + children.size());
        System.out.println("Add new child to the family");
        addChild(new Human("","",0, new Human("",""), new Human("","")));
        System.out.println("number of children in the family: " + children.size());

        // System.out.println("number of family member: " + (parents.size() + children.size()));

        countFamily(family);

        System.out.println(child.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());

        /*
        int i = 0;
        for(String weekday : Human.weekdays) {
            Human.schedule[i++][0] = weekday;
        }
        int j = 0;
        for (String task : Human.tasks) {
            Human.schedule[j++][1] = task;
        }
        */
    }
    public static Human addChild(Human ch) {
        System.out.print("Name: ");
        ch.setName(sc.nextLine());
        System.out.print("Surname: ");
        ch.setSurname(sc.nextLine());
        System.out.print("Year: ");
        ch.setYear(sc.nextInt());

        ch = new Family(ch.getName(),
                        ch.getSurname(),
                        ch.getYear(),
                        new Human(father.getName(), father.getSurname()),
                        new Human(mother.getName(),mother.getSurname()));

        children.add(ch);
        System.out.println("Child was added");
        System.out.println(children.get(1).toString());
        return ch;
    }

    public static void deleteChild(int position) {
        children.remove(position);
        System.out.println(position + "th child was removed from family");
    }

    public static void countFamily(Map<Integer, ArrayList<Human>> fm) {
        System.out.println("number of family member: " + (fm.get(1).size() + fm.get(2).size()));
    }
}