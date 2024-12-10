public class Solution {
    public static int idadeEmDias(int[] input) {

        //arrays são mais de um objeto extraido de uma vez só
        // extrair valores de arrays em anos meses e dias
        int anos = input[0];
        int meses = input[1];
        int dias = input[2];

        int totalDias = (anos * 365) + (meses * 30) + dias;

        return totalDias;

    }

}
