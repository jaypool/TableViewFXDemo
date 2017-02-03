package sample;

public class peopleModel {

    private String firstName;
    private String lastName;
    private int age;

    public peopleModel() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }

    public peopleModel(String fName, String lName, int a) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = a;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
