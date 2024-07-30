package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EJ4Test {

    @Test
    void crearCuatroTareas() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new EJ4().crearCuatroTareas();

        String expectedOutput = outContent.toString();
        assertTrue(expectedOutput.contains("La suma de los números aleatorios es: "));
    }
}