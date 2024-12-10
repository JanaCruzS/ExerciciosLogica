package CondicionaisEx5;



//Em uma danceteria o preço da entrada sofre variações.
// Segundas, Terças e Quintas, ela oferece um desconto de 25% do preço normal de entrada.

// Nos dias de músicas ao vivo, o preço da entrada ainda é acrescido em 15% em relação ao preço normal da entrada.

// Faça uma função que recebe o dia da semana, o preço normal da entrada e se é dia de música ao vivo (“Sim”) ou não (“Não”).
// Os valores de entrada serão passados em um array seguindo essa ordem. Calcule e retorne o preço final que deverá ser pago pela entrada.

// Considere um arredondamento de três casas para o valor final da entrada.
//
//Obs: aplicar primeiro o desconto dos dias com desconto e depois o acréscimo de música ao vivo, quando os dois descontos forem aplicados.
//
//A entrada dos dias da semana será considerando um valor decimal, conforme os dados a seguir:
//
//1.0 - segunda
//2.0 - terça-feira
//3.0 - quarta-feira
//4.0 - quinta-feira
//5.0 - sexta-feira
//6.0 - sábado
//7.0 - domingo

//Para os dados referente a música ao vivo serão considerados: 1.0 - sim e 2.0 - não.
public class Solution {
    public static double valorEntrada(double[] input) {

            double diaDaSemana = input[0];
            double precoNormal = input[1];
            double eAoVivo = input[2];

            double valorTotal = precoNormal;

            // Aplicar desconto de 25% nos dias de desconto (Segunda, Terça, Quinta)
            if (diaDaSemana == 1.0 || diaDaSemana == 2.0 || diaDaSemana == 4.0) {
                valorTotal = precoNormal * 0.75; // Desconto de 25%
            }

            // Se for dia de música ao vivo, aplicar acréscimo de 15%
            if (eAoVivo == 1.0) {
                valorTotal = valorTotal * 1.15; // Acréscimo de 15% se música ao vivo
            }

            // Arredondar
            return Math.round(valorTotal * 1000.0) / 1000.0;
        }
    }