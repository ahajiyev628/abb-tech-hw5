package homework5;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;

    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule = new String[6][2];
    private Family family;

    public static String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static String[] tasks = {"do homework", "go to courses", "watch a film", "play a game", "meet with friends", "go for shopping", "go to sport"};

    public Human() {

    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public static String[] getWeekdays() {
        return weekdays;
    }

    public static void setWeekdays(String[] weekdays) {
        Human.weekdays = weekdays;
    }

    public static String[] getTasks() {
        return tasks;
    }

    public static void setTasks(String[] tasks) {
        Human.tasks = tasks;
    }

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

    public Human(String name, String surname, Human mother, Human father, Family family) {
        this.name = name;
        this.surname = surname;
        this.mother = mother;
        this.father = father;
        this.family = family;
    }

    public Human(String name, String surname, Family family) {
        this.name = name;
        this.surname = surname;
        this.family = family;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother+
                ", father=" + father +
                ", schedule=" + Arrays.toString(new String[]{weekdays[1]}) + " " + Arrays.toString(new String[]{tasks[1]}) +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet, mother, father);
    }
}
