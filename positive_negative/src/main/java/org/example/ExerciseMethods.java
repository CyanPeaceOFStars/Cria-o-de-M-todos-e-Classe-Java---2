package org.example;

public class ExerciseMethods {

    // Metodo para verificar se o número é positivo, negativo ou zero
    public void verificarPositivoNegativo(int numero) {
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
