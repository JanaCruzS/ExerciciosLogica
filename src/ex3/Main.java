package ex3;

import java.util.Scanner;

import static ex3.Automoveis.custosCarro;

public class Main {
    public static void main(String[] args) {
        // Teste da função com os exemplos fornecidos
        double[] entrada1 = {100000.00, 12000.00, 20000.00};
        double[] resultado1 = custosCarro(entrada1);
        System.out.println("Saída: [" + resultado1[0] + ", " + resultado1[1] + "]");

        double[] entrada2 = {115500.00, 25000.00, 32500.00};
        double[] resultado2 = custosCarro(entrada2);
        System.out.println("Saída: [" + resultado2[0] + ", " + resultado2[1] + "]");
    }
}
