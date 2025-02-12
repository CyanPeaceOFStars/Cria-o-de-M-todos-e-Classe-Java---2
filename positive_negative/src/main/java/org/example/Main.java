package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Criando uma instância de ExerciseMethods
        ExerciseMethods methods = new ExerciseMethods();

        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário um número para verificar se é positivo, negativo ou zero
        System.out.print("Digite um número para verificar se é positivo, negativo ou zero: ");
        int numero = sc.nextInt();

        // Chamando o metodo para verificar o número
        methods.verificarPositivoNegativo(numero);

        // Fechar o scanner
        sc.close();
    }
}
