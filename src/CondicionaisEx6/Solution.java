package CondicionaisEx6;

public class Solution {
    public static String mediaAproveitamento(double[] input) {


        double N1 = input[0];
        double N2 = input[1];
        double N3 = input[2];
        double mediaExercicios = input[3];

        // Calculo da Média Ponderada
        double mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;

        // Critérios para o Conceito
        if (mediaAproveitamento >= 9.0) {
            return "A";
        } else if (mediaAproveitamento >= 7.5) {
            return "B";
        } else if (mediaAproveitamento >= 6.0) {
            return "C";
        } else {
            return "D";
        }
    }
}
