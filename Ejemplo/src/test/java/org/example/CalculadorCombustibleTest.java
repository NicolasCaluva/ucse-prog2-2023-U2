package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorCombustibleTest {

    @Test
    void TestGetInstanceDebeDevolverInstanciaCalculadorCombustible() {
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        assertNotNull(calculadorCombustible);
    }

    @Test
    void TestCalcularCombustibleDebeDevolverCero() {
        CalculadorCombustible calculadorCombustible = CalculadorCombustible.getInstance();
        Avion avion = new Avion(100, 10) {
            @Override
            public int volar(int distancia) {
                return 0;
            }
        };
        assertEquals(0, calculadorCombustible.calcularCombustible(avion, 100));
    }
}