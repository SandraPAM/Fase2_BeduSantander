import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest {

    @Mock
    CalculadoraService calculadoraService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    @DisplayName("Prueba add")
    void add() {
        when(calculadoraService.add(10.0, 20.0)).thenReturn(30.0);

        assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);

        verify(calculadoraService).add(20.0,10.0);
    }

    @Test
    @DisplayName("Prueba subtract")
    void subtract() {
    }

    @Test
    @DisplayName("Prueba multiply")
    void multiply() {
    }

    @Test
    @DisplayName("Prueba divide")
    void divide() {
    }
}