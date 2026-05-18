package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kgFinal, kgInicio;
        int tempo = 0;
        System.out.println("Digite a massa inicial:");
        kgInicio = sc.nextDouble();
        kgFinal = kgInicio;

        while (kgFinal >= 0.0005) {
           
            kgFinal = kgFinal / 2;

            tempo += 50;
        }

        System.out.println("massa incial: "+ kgInicio);
        System.out.printf("massa Final: %.10f\n", kgFinal);
        System.out.println("Tempo: "+ tempo);

        sc.close();
    }

}
