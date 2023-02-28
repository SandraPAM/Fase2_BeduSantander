
public class HundredCount {
    public static void main(String[] args) {
        System.out.println(suma(100));

    }

    public static int suma(int val){
        if (val > 1){
            return val + suma(val - 1);
        }

        return val;
    }
}
