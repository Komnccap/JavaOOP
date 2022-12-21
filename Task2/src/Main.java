import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Реализовать, с учетом ооп подхода, приложение
 * Для проведения исследований с генеалогическим древом.
 * Идея: описать некоторое количество компонент, например:
 * модель человека
 * компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
 *
 * компонента для проведения исследований
 * дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человекаc “проведением исследования”
 * можно понимать получение всех детей выбранного человека.
 *
 * Используйя код написанный выше, необходимо гарантированно продумать иерархию компонент и взаимодействия их между собой.
 *
 * Обеспечить переход от использования явных классов в сторону использования абстрактных типов. Т е работаем не с:
 * конкретным экземпляром генеалогического древа, а с интерфейсом “ генеалогическое древо”
 * конкретным экземпляром котика, а с интерфейсом “котик”, лучше уйти от взаимодействия с конкретными питомцами и повысить уровень абстракции до взаимодействия с котиком, собачкой или
 * хомяком т е с интерфейсом “животное”
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(starter());

    }
    public static String starter(){
        String stoper = " ";
        Random random = new Random();
        int ranName = random.nextInt(namesList().size());
        int ranName2;
        int ranName3;
        int randGender;
        int ranLastname = random.nextInt(lastNamesList().size());
        int dess = desNum();
        Person tom = new Person(namesList().get(ranName), lastNamesList().get(ranLastname),dess);
        tom.display();
        for (int i = 0; i < dess; i++) {
            ranName2 = random.nextInt(namesList().size());
            ranName3 = random.nextInt(womanNamesList().size());
            randGender = random.nextInt(2);
            if (randGender == 1){
                Employee sam = new Employee(namesList().get(ranName2), lastNamesList().get(ranLastname),desNum());
                sam.display();
                System.out.printf(" Является сыном %s", tom.getName());

            }
            else {
                Employee sally = new Employee(womanNamesList().get(ranName3), lastNamesList().get(ranLastname)+"а",desNum());
                sally.womanDisplay();
                System.out.printf(" Является дочерью %s", tom.getName());
            }
        }

        return stoper;
    }
    /**
     * Мужские Имена
     * @return
     */
    public static List<String> namesList(){
        List<String>names = Arrays.asList("Евгений","Павел","Иван","Алексей","Дмитрий","Сергей","Роман","Олег","Борис","Денис","Александр","Михаил","Артём");
        ArrayList<String> namesList = new ArrayList<>();
        for (int i = 0; i < names.size() ; i++) {
            namesList.add(names.get(i));
        }
        return namesList;
    }
    /**
     * Женские имена
     * @return
     */
    public static List<String> womanNamesList(){
        List<String>names = Arrays.asList("Алёна","Ольга","Полина","Кристина","Оксана","Дарья","Елизаветта","Анастасия","Юлия","Софья","София","Мария","Ксения");
        ArrayList<String> womanNamesList = new ArrayList<>();
        for (int i = 0; i < names.size() ; i++) {
            womanNamesList.add(names.get(i));
        }
        return womanNamesList;
    }
    /**
     * Фамилии
     * @return
     */
    public static List<String> lastNamesList(){
        List<String>names = Arrays.asList("Сусанин","Алтухов","Романов","Пустуллин","Третьяков","Навиуллин","Матин","Гизматулин","Исаков","Арсеньев","Фомин");
        ArrayList<String> lastNamesList = new ArrayList<>();
        for (int i = 0; i < names.size() ; i++) {
            lastNamesList.add(names.get(i));
        }
        return lastNamesList;
    }
    public static int desNum(){
        Random random = new Random();
        int desNum = random.nextInt(5);
        return desNum;
    }
}
class Person{
    String name;
    int numDescendants;
    String lastName;
    public String getName(){ return name; }
    public Person(String name,String lastName, int numDescendants){
        this.name=name;
        this.lastName = lastName;
        this.numDescendants = numDescendants;
    }
    public void display(){
        System.out.printf("Прародитель\nИмя:%s Фамилия:%s Пол: Мужской Количество наследников:%d\n",name,lastName,numDescendants);
    }
}
class Employee extends Person{
    int numDescendants;
    String lastName;
    public Employee(String name,String lastName, int numDescendants){
        super(name,lastName,numDescendants);
        this.lastName = lastName;
        this.numDescendants = numDescendants;
    }
    public void display(){
        System.out.printf("\nИмя:%s Фамилия:%s Пол: Мужской Количество наследников:%d",name,lastName,numDescendants);

    }
    public void womanDisplay(){
        System.out.printf("\nИмя:%s Фамилия:%s Пол: Женский Количество наследников:%d",name,lastName,numDescendants);

    }
}





