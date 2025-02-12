package org.example;

public class ExerciseMethods {

    // Metodo para verificar se a pessoa pode votar com base na idade
    public void verificarVoto(int idade) {
        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
    }
}
