public class Parents extends Grandparents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String mother(){
        firstName = Names.raWoNames();
        secondName = LastNames.raLaNa();
        age = 31;
        status = "Мама";
        return String.format("Статус:%s, Имя: %s %sа, возраст: %d.", status, firstName, secondName, age);
    }

    public String father(){
        firstName = Names.raMaNames();
        secondName = LastNames.raLaNa();
        age = 33;
        status = "Папа";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }

}