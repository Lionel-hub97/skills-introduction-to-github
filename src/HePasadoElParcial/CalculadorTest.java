package HePasadoElParcial;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorTest {

    @org.junit.jupiter.api.Test
    void calculaSuma() {
        int x = 3, y = 5, resultadoEsperado = 8;

        assertEquals(Calculador.calculaSuma(x, y), resultadoEsperado);
    }

    @org.junit.jupiter.api.Test
    void calculaResta() {
        int x = 3, y = 5, resultadoEsperado = 8;

        assertEquals(Calculador.calculaResta(x, y), resultadoEsperado);
    }
}