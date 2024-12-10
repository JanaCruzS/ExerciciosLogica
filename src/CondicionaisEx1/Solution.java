package CondicionaisEx1;


//Maria tem uma frutaria e está com uma promoção para quem comprar mais de 10 frutas (do mesmo item). A tabela de preços das frutas com preços especiais são:
//
//Fruta
//Pera
//Laranja
//Maçã
//Tomate
//Caqui
//Comprando qualquer fruta da promoção e levando acima de 10 frutas o preço da unidade fica em 1.25 cada, caso a pessoa
// leve uma quantidade inferior ou igual a 10 o preço individual da fruta fica em 1.45.
//Faça uma função que recebe a quantidade de frutas que o cliente está levando e calcule o valor final a ser pago.
// Arredondar o valor final da compra para 2 casas decimais.
public class Solution {

    //metodo ja disponivel no exercicio
    // input é a quantidade de frutas compradas
    public static double custoCompra(double input) {

        //definindo variavel do preço comum e promoção
        double precoNormal = 1.45;
        double promocao = 1.25;

        double quantidadeDaCompra;
        if (input > 10) {
            quantidadeDaCompra = input * promocao;
        } else {
            quantidadeDaCompra = input * precoNormal;
        }

        //retorno com a classe "Math.round" para arredondar as casas decimais
        return Math.round(quantidadeDaCompra * 100.0) / 100.0;


    }
}
    

