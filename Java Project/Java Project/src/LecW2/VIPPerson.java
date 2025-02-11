package LecW2;

public class VIPPerson extends Person{

    private String grade; // m-class million; b-class billion

    public VIPPerson(String name, String address, String grade) {
        super(name, address);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


}
