import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LastNames {
    public static List<String> lastNames(){
        List<String> bankLastNames = Arrays.asList("Ляхов","Алтухов","Распутин","Свиридов","Киреев");
        ArrayList<String> lasntNames = new ArrayList<>();
        for (int i = 0; i < bankLastNames.size(); i++) {
            lasntNames.add(bankLastNames.get(i));
        }
        return lasntNames;
    }
    public static String raLaNa(){
        Random random = new Random();
        int rand = random.nextInt(lastNames().size());
        String lasntName = lastNames().get(rand);
        return lasntName;
    }

}
