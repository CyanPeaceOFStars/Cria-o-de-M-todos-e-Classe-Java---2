package org.example;

public class ExerciseMethods {

    // Método para verificar se o número está no intervalo entre 10 e 50
    public void verificarIntervalo(int numero) {
        if (numero >= 10 && numero <= 50) {
            System.out.println("O número " + numero + " está no intervalo entre 10 e 50.");
        } else {
            System.out.println("O número " + numero + " está fora do intervalo entre 10 e 50.");
        }
    }
}
