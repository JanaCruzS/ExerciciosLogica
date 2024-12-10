package ex5;

public class Solution {

    //array de entrada de valores
    public static double Comissao(double[] input) {
        int carrosVendidos = (int) input[0]; // Número de carros vendidos
        double totalVendas = input[1]; // Valor total das vendas no mês
        double Fixo = input[2]; // Salário fixo mensal
        double valorPorCarro = input[3]; // Valor fixo por carro vendido

        // Calcula a comissão
        double comissaoPercentual = totalVendas * 0.05; // 5% do valor total vendido
        double comissaoPorCarros = carrosVendidos * valorPorCarro; // Valor por carro vendido

        // Calcula o salário total
        double salarioTotal = Fixo + comissaoPercentual + comissaoPorCarros;

        // classe math round arredonda valores
        return Math.round(salarioTotal * 100.0) / 100.0;
    }

}

