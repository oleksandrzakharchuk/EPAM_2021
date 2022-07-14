package abstractСlasses_7.mainExample;

public class Teacher extends  Person {
    private String academicRank;

    public Teacher(int personalId, String lastname, String academicRank) {
        super(personalId, lastname);
        this.academicRank = academicRank;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher{");
        sb.append(super.toString()).append(" academicRank = '").append(academicRank).append('\'');
        sb.append('}');

        return sb.toString();
    }
}
