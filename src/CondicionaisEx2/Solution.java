package CondicionaisEx2;
//Uma empresa vende o mesmo produto para 3 diferentes estados. Cada estado possui uma taxa diferente
// de imposto sobre o produto (MG 7%; SP 12%; RJ 15%;). Faça um programa que recebe o valor do produto
// e o estado de destino do produto e, então, calcule o preço final do produto acrescido do imposto baseado no estado em que ele será vendido.

//Considerar as seguintes restrições quanto a entrada e saída dos dados:

import javax.swing.plaf.ScrollPaneUI;
import java.util.spi.TimeZoneNameProvider;

//Os dados de entrada serão passados em um array de decimais [valor do produto, estado comercializado]
//Para os dados do estado considerar 1.0 => MG, 2.0 => SP, 3.0 => RJ
//Caso seja passado um estado desconhecido retornar -1.0.
//Fazer um arredondamento de 4 casas no valor final do produto
//Ex:
public class Solution {

    // array já disponivel na solução do exercicio
    //
    public static double valorProdutoFinal(double[] input) {

        double valorDoProduto = input[0];
        double estado = input[1];

        //variavel para taxa dde imposto de cada estado
        double imposto = 0;
        if (estado == 1) {
            imposto = 0.07; //taxa de MG
        } else if (estado == 2) {
            imposto = 0.12; // taxa de SP
        } else if (estado == 3) {
            imposto = 0.15; // taxa de Rj
        } else {
            System.out.println("estado invalido");
        }
        double valorFinal;
        valorFinal = input[0] + (input[0] * imposto);

        //classe "Math round" para arredondar o valor com casas decimais corretas
        return Math.round(valorFinal * 10000.0) / 10000.0;
    }
}

