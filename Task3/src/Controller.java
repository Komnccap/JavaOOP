public class Controller {
    public static void run(){
        Children child = new Children(Names.raMaNames(), LastNames.raLaNa(), 10, "Сын");
        System.out.println(child.grandFather());
        System.out.println(child.grandMother());
        System.out.println(child.father());
        System.out.println(child.mother());
        System.out.println(child);
    }
}