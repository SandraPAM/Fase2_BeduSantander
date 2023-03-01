public class Application {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("BEDU");
        Singleton singleton1 = Singleton.getInstance("BETO");

        System.out.println(singleton.value);
        System.out.println(singleton1.value);
    }
}