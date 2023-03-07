import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CalculadoraTest {

    @Mock
    CalculadoraDao calculadoraDao;

    @InjectMocks
    Calculadora calculadora;

    @BeforeEach
    void setUp(){
        given(calculadoraDao.findValorConstante()).willReturn(3);
    }

    @Test
    @DisplayName("Prueba suma")
    void suma() {
        int esperado = 8;
        assertEquals(esperado, calculadora.suma(3,2));
    }

    @Test
    @DisplayName("Prueba resta")
    void resta() {
        int esperado = 4;
        assertEquals(esperado, calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba multiplicacion")
    void multiplicacion() {
        int esperado = 9;
        assertEquals(esperado, calculadora.multiplicacion(3,2));
    }
}