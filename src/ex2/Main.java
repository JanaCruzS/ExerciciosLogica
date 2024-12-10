package ex2;

import java.util.Scanner;

import static ex2.Roupas.geraRecibo;

public class Main {
    public static void main(String[] args) {
        // Exemplo de teste
        double[] precos = {100.0, 200.0, 50.0};
        System.out.println(geraRecibo(precos));

        // Outro exemplo com apenas uma peça
        double[] precos2 = {150.0};
        System.out.println(geraRecibo(precos2));





    }
}
