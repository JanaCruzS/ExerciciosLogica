package CondicionaisEx3;
//João é um empresário do ramo de construção civil e decidiu adotar novos critérios para dar reajuste salarial
// para seus funcionários. Agora, o reajuste vai ser dado seguindo as regras abaixo.
//
//Tempo de serviço:
//
//de 1 até 5 anos => 1%
//de 5 até 10 anos => 1.5%
//10 ou mais anos => 2% valor da inflação (IPCA)
//O valor total percentual para o reajuste vai ser a soma do percentual de tempo de serviço mais o percentual da inflação.
//
//Para ajudar João a calcular o valor do reajuste salarial de seus funcionários, crie uma
// função que recebe um array como entrada; onde, a posição 0 do array é o tempo de serviço, a posição 1 é o valor da inflação
// e a posição 3 é o salário do funcionário. Sua função deve calcular o novo salário e retorna-lo. Considere arredondamento de
// duas casas decimais para o salário retornado.
public class Solution {

    //array do exercicio
    public static double calculoSalario( double[] input) {

        //array do tipo double para cada tipo de entrada de acordo com o enunciado
        double tempoDeServico = input[0];
        double valorDaInflacao = input[1];
        double salarioDoFuncionario = input [2];

        double reajuste = 0;
        if ( tempoDeServico >= 1 && tempoDeServico < 5) {
            reajuste = 1.0;  // valor do reajuste de 1 a 5 anos
        } else if (tempoDeServico  >= 5 && tempoDeServico < 10 ) {
            reajuste =  1.50; // valor reajuste de 5 ate 10 anos
        } else if (tempoDeServico >= 10) {
            reajuste = 2.0; // valor reajuste de 10 ou mais anos
        } else {
            System.out.println("salario sem reajuste");
        }

        //calculo do reajuste
        double totalReajuste = reajuste + valorDaInflacao;


        double novoSalario = (salarioDoFuncionario * ( 1 + totalReajuste / 100));


        // arrendondar calculo com as devidas casas decimais
        return Math.round(novoSalario * 100.0) / 100.0;
    }
}
