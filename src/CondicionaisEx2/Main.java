package CondicionaisEx2;

import static CondicionaisEx2.Solution.valorProdutoFinal;

public class Main {
    public static void main(String[] args) {
        double[] entrada1 = {250.10, 1.0}; // MG
        System.out.println(valorProdutoFinal(entrada1)); // Saída: 267.6070

        double[] entrada2 = {220.50, 3.0}; // RJ
        System.out.println(valorProdutoFinal(entrada2)); // Saída: 253.5750

        double[] entrada3 = {300.00, 4.0}; // Estado desconhecido
        System.out.println(valorProdutoFinal(entrada3)); // Saída: -1.0
    }
}


