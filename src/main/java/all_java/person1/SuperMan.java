package all_java.person1;

public class SuperMan extends Person1 {
    String skills;

    SuperMan(String skills, String name) {
        super();
        this.skills = skills;
    }

    public String showInfo() {
        return name + " has " + skills;
    }
}
