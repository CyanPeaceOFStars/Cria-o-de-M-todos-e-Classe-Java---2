package org.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExerciseMethods methods = new ExerciseMethods();

        System.out.println("Digite três números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maiorNumero = methods.encontrarMaiorNumero(num1, num2, num3);

        // Exibe o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorNumero, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        scanner.close();
    }
}
