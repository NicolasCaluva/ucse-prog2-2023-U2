package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class EJ3 {

    public void crearCuatroTareas(){
        CompletableFuture<Integer> tareaUno = generateRandomNumberAsync();
        CompletableFuture<Integer> tareaDos = generateRandomNumberAsync();
        CompletableFuture<Integer> tareaTres = generateRandomNumberAsync();
        CompletableFuture<Integer> tareaCuatro = generateRandomNumberAsync();

        CompletableFuture<Void> todasLasTareas = CompletableFuture.allOf(tareaUno, tareaDos, tareaTres, tareaCuatro);

        todasLasTareas.thenAccept(r -> {
            try {
                int sum = tareaUno.get() + tareaDos.get() + tareaTres.get() + tareaCuatro.get();
                System.out.println("La suma de los números aleatorios es: " + sum);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        todasLasTareas.join();
    }

    private static CompletableFuture<Integer> generateRandomNumberAsync() {
        return CompletableFuture.supplyAsync(() -> {
            int numero = ThreadLocalRandom.current().nextInt(100, 501);
            try {
                Thread.sleep(numero);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return numero;
        });
    }
}
