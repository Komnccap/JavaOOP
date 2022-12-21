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
        Progen progen = new Progen("Павел","Алтухов","Мужской",5);
        progen.outPutInfo();



    }
    public static ArrayList<String> manNames(){
        List<String> names = Arrays.asList("Евгений","Дмитрий","Алексей","Геннадий","Павел","Никита","Илья","Иван","Сергей");
        ArrayList<String> manNames = new ArrayList<>();
        for (int i = 0; i <names.size() ; i++) {
            manNames.add(names.get(i));
        }
        return null;
    }

}
class Human {
    String firstName,lastName,gender;
    int numDescendant;

    public Human(String firstName,String lastName,String gender, int numDescendant){

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.numDescendant = numDescendant;

    }

    /**
     * Мужские имена
     * @return
     */
    public ArrayList<String> manNames(){
        List<String> names = Arrays.asList("Евгений","Дмитрий","Алексей","Геннадий","Павел","Никита","Илья","Иван","Сергей");
        ArrayList<String> manNames = new ArrayList<>();
        for (int i = 0; i <names.size() ; i++) {
            manNames.add(names.get(i));
        }
        return manNames;
    }
    /**
     * Женские имена
     * @return
     */
    public ArrayList<String> womanNames(){
        List<String> names = Arrays.asList("Алёна","Полина","Кристина","Анна","Ольга","Екатерина","Оксана","Маргарита","Инна");
        ArrayList<String> womanNames = new ArrayList<>();
        for (int i = 0; i <names.size() ; i++) {
            womanNames.add(names.get(i));
        }
        return null;
    }
    /**
     * Фамилии
     * @return
     */
    public ArrayList<String> lastNames(){
        List<String> lastName = Arrays.asList("Ляхов","Землемеров","Иванов","Пустуллин","Иаковлев","Романов","Алтухов","Лебедев");
        ArrayList<String> lastNames = new ArrayList<>();
        for (int i = 0; i <lastName.size() ; i++) {
            lastNames.add(lastName.get(i));
        }
        return lastNames;
    }
    public int getNumDes(){return numDescendant;}
    /**
     * Вывод в консоль
     * @return
     */
    public String outPutInfo(){
        System.out.printf("Прародитель\nИмя: %s Фамилия: %s \nПол - %s\nКоличество потомков - %d\n",firstName,lastName,gender,numDescendant);
        return null;
    }
    public String outPutDesInfo(){

        System.out.printf("Потомок\nИмя: %s Фамилия: %s \nПол - %s\nКоличество потомков - %d\n", firstName,lastName,gender,numDescendant);
        return null;
    }
}
class Progen extends Human{

    public Progen(String firstName, String lastName, String gender, int numDescendant) {
        super(firstName,lastName,gender,numDescendant);

    }
    public String progenitor(){
        Random random = new Random();
        int ranGen1 = random.nextInt(manNames().size()),ranGen2 = random.nextInt(lastNames().size());
        int ranGen;

        Progen father = new Progen(manNames().get(ranGen1), lastNames().get(ranGen2),"Мужской",3);

        father.outPutInfo();
        father.manNames();
        for (int i = 0; i < father.getNumDes() ; i++) {
            int nameNum = random.nextInt(father.manNames().size());
            ranGen = random.nextInt(2);
            if (ranGen == 1){
                Human descendant = new Human(father.manNames().get(nameNum), father.lastName, "Мужской",0);
                descendant.outPutDesInfo();
            }
            else {
                Human descendant = new Human(father.womanNames().get(nameNum), father.lastName+"а", "Женский",0);
                descendant.outPutDesInfo();
            }
        }
        return progenitor();
    }
}



