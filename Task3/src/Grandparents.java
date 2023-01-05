import java.util.Random;

public class Grandparents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String grandMother(){
        firstName = Names.raWoNames();
        secondName = LastNames.raLaNa();
        age = 55;
        status = "Бабушка";
        return String.format("Статус:%s, Имя: %s %sа, возраст: %d.", status, firstName, secondName, age);
    }
    public String grandFather(){
        firstName = Names.raMaNames();
        secondName = LastNames.raLaNa();
        age = 58;
        status = "Дед";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
}