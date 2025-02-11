package Lab05.com.example.encapsulation;

public final class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = validateEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0){
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String validateEmail(String email) {
        if (email.matches("^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]+$")) {
            return email; //correct
        } else {
            return "null"; // wrng
        }
    }

}
