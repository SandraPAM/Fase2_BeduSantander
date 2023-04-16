import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Ejemplo2 {

    List<Integer> transformar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
        List<Integer> nuevaLista = new ArrayList<>();
        for(Integer v: conjunto){
            nuevaLista.add(funcion.apply(v));
        }

        return nuevaLista;
    }

    Integer transformarYSumar(Iterable<Integer> conjunto, Function<Integer, Integer> funcion){
        Integer acumulador = 0;
        for(Integer v: conjunto){
            acumulador += funcion.apply(v);
        }

        return acumulador;
    }
}
