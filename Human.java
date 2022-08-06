
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Human extends Pet {
    private String name;
    private String surname;
    private int year;

    private int iq;
    Pet pet;
    Human mother;
    Human father;
    public static String[][] schedule = new String[7][2];

    public static String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static String[] tasks = {"do homework", "go to courses", "watch a film", "play a game", "meet with friends", "go for shopping", "go to sport"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        if (iq > 100 || iq < 0) {
            this.iq = Integer.parseInt("");
            return;
        }
        this.iq=iq;
    }

    public int getIq() {
        return iq;
    }



    public Human(String name, String surname, int year, Human mother, Human father) {
        super("dog", "wimel", 5, new String[]{"eat", "drink", "sleep"});
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname) {
        super("dog", "wimel", 5, new String[]{"eat", "drink", "sleep"});
        this.name = name;
        this.surname = surname;
    }

    public Human(String surname) {
        super("");
        this.surname = surname;
    }

    public static String tLevel(int a) {
        if (a > 50) {
            return "very sly";
        } else {
            return "almost not sly";
        }
    }

    public void describePet() {
        System.out.println("I have a " + super.getSpecies() + ", he is " + super.getAge() + " years old, he is " + Human.tLevel(super.getTrickLevel()));
    }

    public void greetPet() {
        System.out.println("Hello, " + super.getNickname());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + this.name +
                "', surname='" + this.surname +
                "', year=" + this.year +
                ", iq=" + this.getIq() +
                ", mother='" + this.mother.name + " " + this.mother.surname +
                "'', father='" + this.father.name + " " + this.father.surname +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) &&
                Objects.equals(mother, human.mother) && Objects.equals(father, human.father) &&
                Arrays.equals(schedule, human.schedule) && Objects.equals(sc, human.sc);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), name, surname, year, iq, pet, mother, father, sc);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}

