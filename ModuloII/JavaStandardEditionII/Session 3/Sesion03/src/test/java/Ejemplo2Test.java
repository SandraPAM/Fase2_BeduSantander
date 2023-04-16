import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class Ejemplo2Test {

    private final List<Integer> CONJUNTO = Arrays.asList(1,2,3,4,5);

    @Test
    void multiplica5 (){
        Ejemplo2 ej = new Ejemplo2();

        List<Integer> res = ej.transformar(CONJUNTO, n -> n*5);

        assertThat(res).containsExactly(5,10,15,20,25);
    }

    @Test
    void suma1 (){
        Ejemplo2 ej = new Ejemplo2();

        List<Integer> res = ej.transformar(CONJUNTO, n -> n+1);

        assertThat(res).containsExactly(2,3,4,5,6);
    }

    @Test
    void transformarYSumar() {
        Ejemplo2 ej = new Ejemplo2();

        Integer res = ej.transformarYSumar(CONJUNTO, n -> n);
        Integer total = CONJUNTO.stream().mapToInt(Integer::intValue).sum();

        assertThat(res).isEqualTo(total);
    }
}