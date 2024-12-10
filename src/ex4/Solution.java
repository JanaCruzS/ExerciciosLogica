package ex4;

public class Solution {

    // tres valores de uma array
    public static boolean eUmTriangulo(int[] input) {

        //entrada de tres dados
        int lado1 = input [0];
        int lado2 = input [1];
        int lado3= input [2];

        //metodo para validar se dados fornecidos formam um triangulo. Caso formar retornar true, caso não formar retornar; false.
        // ou seja, o metodo devera ter um operador logico

        if ((input [0] + input[1]) > input[2]) {
        return true;
        } else {
            return false;
            //faltou uma condicao; valores ex: valor1: 2 ; valor2: 5 resultado: menor que a soma
            // return false
            // else if ( input [0] + input [1]) < input [5]
            //return false;
        }
    }
}
