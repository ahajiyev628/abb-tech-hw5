package homework5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Human mother = new Human();
        mother.setName("mother name");
        mother.setSurname("mother surname");
        //mother.setFamily(family1);

        Human father = new Human();
        father.setName("father name");
        father.setSurname("father surname");
        //father.setFamily(family1);

        Family family1 = new Family(father, mother);
        System.out.println(family1.toString());


        Pet p = new Pet();
        p.setSpecies("dog");
        p.setNickname("wimel");
        p.setTrickLevel(80);
        p.setAge(5);
        family1.setPet(p);

        System.out.println(family1.toString());

        Human child = new Human();
        child.setMother(mother);
        child.setFather(father);
        child.setPet(p);
        child.setFamily(family1);
        child.setName("Michael");
        child.setSurname("Karleone");
        child.setYear(1990);
        child.setIq(50);

        family1.addChild(child);
        child.toString();
        System.out.println("");
        family1.toString();
        System.out.println("");
        family1.countFamily();
        System.out.println("");
        System.out.println("After first child added");

        System.out.println(family1.toString());

        Human child2 = new Human();
        child2.setMother(mother);
        child2.setFather(father);
        child2.setPet(p);
        child2.setFamily(family1);
        child2.setName("Michael2");
        child2.setSurname("Karleone2");
        child2.setYear(1992);
        child2.setIq(52);

        System.out.println("After first second added");
        System.out.println(family1.toString());
        family1.addChild(child2);
        family1.countFamily();
        System.out.println("");

//
//        Human[] childs = family1.addChild(child);
//        for(Human ch : childs) System.out.println(ch.toString());

        System.out.println("After second child deleted");
        family1.deleteChild(1);

        family1.countFamily();




        // System.out.println(family.toString());

        // System.out.println(p.toString());
    }
}
