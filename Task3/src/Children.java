public class Children extends Parents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;
    public Children(String firstName, String secondName, int age, String status) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.status = status;

    }
    @Override
    public String toString() {
        return "Ребенок: " + firstName + ", " + secondName + ", " + age + ", " + status;
    }
}