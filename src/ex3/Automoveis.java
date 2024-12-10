package ex3;

public class Automoveis {
    public static double[] custosCarro( double[] input) {
        double [] percentuais = new double[2];
// declaração que recebe uma array de valores (input)

        // calculo do percentual. Destribuidor e fabrica.
        percentuais[0] = (input[1] / input [0]) * 100;

        // custos dos impostos.
        // custodeImpostos/ precodebabrica)
        percentuais[1] = (input[2] / input [0]) * 100;

        //arredondando valores de porcentagem com "Math.round
        percentuais[0] = Math.round(percentuais[0] * 100.0) / 100.0;
        percentuais[1] = Math.round(percentuais[1] * 100.0) / 100.0;
        return percentuais;
        //retorno da array com os dois percentuais.
    }
}
