package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EJ3Test {

    @Test
    void testCrearCuatroTareas() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new EJ3().crearCuatroTareas();

        String expectedOutput = outContent.toString();
        assertTrue(expectedOutput.contains("La suma de los números aleatorios es: "));

        System.setOut(System.out);
    }
}
