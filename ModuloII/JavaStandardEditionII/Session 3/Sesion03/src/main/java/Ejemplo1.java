import java.util.function.Function;

public class Ejemplo1 {

    private final StringToInteger parser = s -> Integer.parseInt(s);

    private final Function<String, Integer> parserReto1 = Integer::parseInt;
    Integer sumar(String a, String b){
        return parser.convertir(a) + parser.convertir(b);
    }

    Integer sumarReto1(String a, String b){
        return parserReto1.apply(a) + parserReto1.apply(b);
    }
}
