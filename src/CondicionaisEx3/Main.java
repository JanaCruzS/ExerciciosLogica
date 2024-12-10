package CondicionaisEx3;


import static CondicionaisEx3.Solution.calculoSalario;

public class Main {
    public static void main(String[] args) {

        double[] reajuste1 = {1,5.0,2000.00};
        System.out.println(calculoSalario(reajuste1)); //

        double[] reajuste2 = {11,4.5,2500.00};
        System.out.println(calculoSalario(reajuste2)); //

        double[] reajuste3 = {0,4.5,2500.00};
        System.out.println(calculoSalario(reajuste3));


    }
}
