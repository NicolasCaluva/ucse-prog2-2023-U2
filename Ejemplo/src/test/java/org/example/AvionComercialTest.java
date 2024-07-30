package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvionComercialTest {

    @Test
    void testVolarConSuficienteCombustibleDebeDevolver1000() {
        AvionComercial avionComercial = new AvionComercial(100, 10);
        assertEquals(1000, avionComercial.volar(100));
    }

    @Test
    void testVolarSinSuficienteCombustibleNoDebeDevolver1000() {
        AvionComercial avionComercial = new AvionComercial(100, 10);
        assertNotEquals(1000, avionComercial.volar(1000));
    }

    @Test
    void testCapacidadCombustibleDebeDevolver100() {
        AvionComercial avionComercial = new AvionComercial(100, 10);
        assertEquals(100, avionComercial.getCapacidadCombustible());
    }

    @Test
    void testGetConsumoCombustibleDebeDevolver10(){
        AvionComercial avionComercial = new AvionComercial(100, 10);
        assertEquals(10, avionComercial.getConsumoCombustible());
    }
}