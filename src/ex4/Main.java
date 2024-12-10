package ex4;

public class Main {
    public static void main(String[] args) {

        //soma dos valores for menor
        int[] input = {2, 2, 5};

        // exibir resultado
        boolean resultado = Solution.eUmTriangulo(input);
        System.out.println(resultado);

        //soma dos valores maior
        input = new int[]{3, 3, 5};
        // exibir resultado
        boolean resultado2 = Solution.eUmTriangulo(input);
        System.out.println(resultado2);

    }
}
