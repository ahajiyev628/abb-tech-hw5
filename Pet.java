
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel > 100 || trickLevel < 0) {
            //System.out.println("Trick level should be between 0 and 100");
            this.trickLevel = Integer.parseInt("");
            return;
        }
        this.trickLevel=trickLevel;
    }

    public int getTrickLevel() {
        return this.trickLevel;
    }

    // Constructor with all the fields
    public Pet(String species, String nickname, int age, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet (String nickname) {
        this.nickname = nickname;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am %s. I miss you!", this.nickname);
        System.out.println("");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    Scanner sc = new Scanner(System.in);
    @Override
    public String toString() {
        this.setTrickLevel(sc.nextInt());
        return this.species +"{" +
                "nickname='" + this.nickname +
                "', age=" + this.age +
                ", trickLevel=" + this.getTrickLevel() +
                ", habits=[" + Arrays.toString(this.habits) +
                "]}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits) && Objects.equals(sc, pet.sc);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel, sc);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}

