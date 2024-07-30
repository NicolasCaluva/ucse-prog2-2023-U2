package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StreamBenchmarkTest {

    private StreamBenchmark benchmark;

    @BeforeEach
    public void setUp() {
        benchmark = new StreamBenchmark();
        benchmark.setup();
    }

    @Test
    void testStream() {
        List<Integer> resultado = benchmark.Stream();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());

        for (Integer num : resultado) {
            assertEquals(0, num % 2);
        }
    }

    @Test
    void testParallelStream() {
        List<Integer> resultado = benchmark.ParallelStream();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());

        for (Integer num : resultado) {
            assertEquals(0, num % 2);
        }
    }
}