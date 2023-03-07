import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraMultiplicaTest {

    static Calculadora calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba multiplicación")
    void multiplicaTest() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplicacion(3, 2));
    }
}
