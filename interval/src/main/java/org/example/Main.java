package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando uma instância de ExerciseMethods
        ExerciseMethods methods = new ExerciseMethods();

        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário um número para verificar se está no intervalo
        System.out.print("Digite um número para verificar se está no intervalo de 10 a 50: ");
        int numeroIntervalo = sc.nextInt();

        // Chamando o método para verificar o intervalo
        methods.verificarIntervalo(numeroIntervalo);

        // Fechar o scanner
        sc.close();
    }
}
