import java.util.*;

/**
 * Прошу вас написать приложение,
 * которое хранит информацию о фильмах
 * и позволяет получaть все детали о них.
 * +реализовать поиск по части имени фильма
 *
 * Основа: проектирование
 *
 * в конце семинара объяснение
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(menu());
    }

    /**
     * Выбор фильма для вывода информации о нём
     */
    public static String menu(){
        String stoper = " ";
        boolean end = false;
        System.out.println("Выберите действие:");
        while (end != true){
            System.out.println("Вывести на экран все фильмы - 1\nПоиск по названию-2\nВыход-3");
            Scanner scan = new Scanner(System.in);
            int userChoice = scan.nextInt();
            if (userChoice == 1) {
                System.out.println(filmList());
                System.out.println("Выберите № фильма, по которому хотите получить информацию");
                userChoice = scan.nextInt();
                if (userChoice <= filmInfo().size()) {
                    System.out.println(filmInfo().get(userChoice - 1));
                } else {
                    System.err.println("ВВЕДЕНО НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ");
                }
            } else if (userChoice == 2) {
                System.out.println(searchInput());
            } else if (userChoice == 3){
                System.out.println("Завершение работы");
                end = true;
            }
            else {
                System.err.println("ВВЕДЕНО НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ");
            }
        }
        return stoper;
    }

    /**
     * Хранение названия фильмов
     *
     * @return
     */
    public static List<String> filmList() {
        List<String> names = Arrays.asList("1 - Friday 13","2 - Resident evil","3 - Equilibrium","4 - halloween");
        ArrayList<String> filmList = new ArrayList<>();
        for (int i = 0; i <names.size() ; i++) {
            filmList.add(names.get(i));
        }
        return filmList;
    }

    /**
     * Информация о фильмах
     * @return
     */
    public static ArrayList<String> filmInfo() {
        ArrayList<String> filmInfo = new ArrayList<>();
        filmInfo.add("«Пятница, 13-е»(Friday 13) — американский слэшер, снятый в 1980 году режиссёром Шоном Каннингемом по сценарию Виктора Миллера. " +
                "Фильм является одной из самых знаковых картин в своём жанре.");
        filmInfo.add("«Обитель зла»(Resident evil) — научно-фантастический фильм ужасов, снятый по мотивам одноимённой японской компьютерной игры. " +
                "Премьера «Обители зла» в США состоялась 12 марта 2002 года, в России — 18 июля того же года.\n");
        filmInfo.add("Действие происходит в будущем, когда люди лишены возможности выражать какие-то эмоции, потому, что они… запрещены. Это — та цена, \n" +
                "которую человечество платит за устранение из своей жизни войны. Теперь книги, искусство и музыка находятся вне закона. А любое чувство — уже преступление, " +
                "наказуемое смертью.\n");
        filmInfo.add("«Хэ́ллоуин»(Halloween) — американский слэшер режиссёра и композитора Джона Карпентера. Главные роли исполнили Джейми Ли Кёртис, Дональд Плезенс и Ник Кастл.\n");

        return filmInfo;
    }

    /**
     * Реализация поиска по вводу
     * @return
     */
    public static String searchInput(){
        String stopper = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название фильма");
        String usIn = scan.nextLine();
        for (int i = 0; i < filmInfo().size() ; i++) {
            if(filmInfo().get(i).toLowerCase().contains(usIn.toLowerCase())){
                System.out.println(filmInfo().get(i));
            }
        }
        return stopper;
    }
}

