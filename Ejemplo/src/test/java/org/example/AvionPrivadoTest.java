package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionPrivadoTest {

    @Test
    void testVolarConSuficienteCombustibleDebeDevolver1050() {
        AvionPrivado avionPrivado = new AvionPrivado(100, 10);
        assertEquals(1050, avionPrivado.volar(100));
    }

    @Test
    void testVolarSinSuficienteCombustibleNoDebeDevolver1000() {
        AvionPrivado avionPrivado = new AvionPrivado(100, 10);
        assertNotEquals(1000, avionPrivado.volar(100));
    }

    @Test
    void testCapacidadCombustibleDebeDevolver100() {
        AvionPrivado avionPrivado = new AvionPrivado(100, 10);
        assertEquals(100, avionPrivado.getCapacidadCombustible());
    }

    @Test
    void testGetConsumoCombustibleDebeDevolver10(){
        AvionPrivado avionPrivado = new AvionPrivado(100, 10);
        assertEquals(10, avionPrivado.getConsumoCombustible());
    }
}