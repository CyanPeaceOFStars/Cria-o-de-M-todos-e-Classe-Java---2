package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando uma instância de ExerciseMethods
        ExerciseMethods methods = new ExerciseMethods();

        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário um número para verificar se é múltiplo de 5
        System.out.print("Digite um número para verificar se é múltiplo de 5: ");
        int numeroMultiploDeCinco = sc.nextInt();

        // Chamando o método para verificar múltiplo de 5
        methods.verificarMultiploDeCinco(numeroMultiploDeCinco);

        // Fechar o scanner
        sc.close();
    }
}
