import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Names {
    /**
     * Женские имена
     * @return
     */
    public static List<String> womanNames(){
        List<String> bankNames = Arrays.asList("Анна","Оксана","Алёна ","Татьяна","Вероника","Полина","Дарья");
        ArrayList<String> womanNames = new ArrayList<>();
        for (int i = 0; i < bankNames.size() ; i++) {
            womanNames.add(bankNames.get(i));
        }
        return womanNames;
    }
    /**
     * Мужские имена
     * @return
     */
    public static List<String> manNames(){
        List<String> bankNames = Arrays.asList("Иван","Павел","Евгений ","Максим","Дмитрий","Михаил","Степан");
        ArrayList<String> manNames = new ArrayList<>();
        for (int i = 0; i < bankNames.size() ; i++) {
            manNames.add(bankNames.get(i));
        }
        return manNames;
    }
    /**
     * Случайный выбор именя для женщины
     * @return
     */
    public static String raWoNames(){
        Random random = new Random();
        int rand = random.nextInt(womanNames().size());
        String name = womanNames().get(rand);


        return name;
    }
    /**
     * Случайный выбор имени для мужчины
     * @return
     */
    public static String raMaNames(){
        Random random = new Random();
        int rand = random.nextInt(womanNames().size());
        String name = manNames().get(rand);
        return name;
    }
}
