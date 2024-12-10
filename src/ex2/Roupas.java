package ex2;

public class Roupas {

    //criação de array ou seja criação de varias variaveis de uma vez só
    public static String geraRecibo(double[] input) {


        //verificar minimo 2 peças
        if (input.length < 2) {
            double totalSemDesconto = 0.0;
            for (double preco : input) {
                totalSemDesconto += preco;
                // variavel double criada total sem desconto, ou seja se não houver no minimo 2 peças na compra o desconto não é aplicado
                // for (laço de repetição) é criado para percorrer toda entrada de dados (input, length) e verificar o minimo de pecas (< 2)
                // adicionado na variavel preco
            }
            return String.format(
                    "Total sem descontos: R$ %.2f\nValor total de descontos: R$ %.2f\nTotal a pagar: R$ %.2f",
                    totalSemDesconto, 0.0, totalSemDesconto);
            //retorno em formato de string (texto)


        }


        // organiza para identificar o menor preço da array de entrada de dados (input)
        java.util.Arrays.sort(input);


        double menorPreco = input[0];
        double desconto = menorPreco * 0.5;
        // o menor preço estara na posição 1 apos a ordenaçãp. logo apos o desconto é aplicado na peca de menor valor




        // Calculo da compra sem desconto
        double totalSemDesconto = 0.0;
        for (double preco : input) {
            totalSemDesconto += preco;
        }


        // calculo total para pagar com desconto
        double totalComDesconto = totalSemDesconto - desconto;


        // retorno do recibo
        return  String.format(
                "Valor total: %.1f | Valor de descontos: %.1f | Valor a pagar: %.1f",
                totalSemDesconto, desconto, totalComDesconto);


    }
}






