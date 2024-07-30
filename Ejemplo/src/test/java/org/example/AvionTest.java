package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AvionTest {

    @Test
    void TestGetCapacidadCombustibleDebeDeolverCien() {
        Avion avion = new Avion(100, 10) {
            @Override
            public int volar(int distancia) {
                return 0;
            }
        };
        assertEquals(100, avion.getCapacidadCombustible());
    }

    @Test
    void TestGetConsumoCombustibleDebeDevolverDiez() {
        Avion avion = new Avion(100, 10) {
            @Override
            public int volar(int distancia) {
                return 0;
            }
        };
        assertEquals(10, avion.getConsumoCombustible());
    }
}
