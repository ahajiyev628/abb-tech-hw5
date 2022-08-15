import java.util.Arrays;
import java.util.Objects;

public class Family {
    Pet pet = new Pet();
    Human mother = new Human("Allahverdi","Hajiyev");
    Human father = new Human("Allahverdi", "Hajiyev");
    Human[] children = new Human[0];

    public Family(Pet pet, Human mother, Human father, Human[] children) {
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family() {
    }

    public Human[] deleteChild(Human child) {
        int i = 0;
        if (children.length > 1) {
            Human[] newChildren = new Human[children.length - 1];
            for (Human ch : children) {
                if (!ch.equals(child)) {
                    newChildren[i] = ch;
                    i++;
                }
            }
            this.children = newChildren;
        }
        return children;
    }

    public Human[] addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        newChildren[children.length] = child;
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        this.children = newChildren;
        return children;
    }

    public void countFamily() {
        System.out.printf("number of family member: %d", children.length + 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(pet, family.pet) && Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pet, mother, father);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}
