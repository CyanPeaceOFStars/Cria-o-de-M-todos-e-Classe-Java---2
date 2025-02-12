package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando uma instância de ExerciseMethods
        ExerciseMethods methods = new ExerciseMethods();

        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário a idade para verificar se pode votar
        System.out.print("Digite sua idade para verificar se você pode votar: ");
        int idade = sc.nextInt();

        // Chamando o método para verificar a idade
        methods.verificarVoto(idade);

        // Fechar o scanner
        sc.close();
    }
}
