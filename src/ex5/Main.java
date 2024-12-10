package ex5;

import static ex5.Solution.Comissao;


public class Main {
    public static void main(String[] args) {
        double[] entrada1 = {3, 20000.00, 2000.00, 250.00};
        double[] entrada2 = {4, 25000.00, 3500.00, 100.00};

        System.out.println(Comissao(entrada1)); // Saída esperada: 3750.00
        System.out.println(Comissao(entrada2)); // Saída esperada: 5150.00
    }
}

