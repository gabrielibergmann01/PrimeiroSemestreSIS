package Unidade5;

import java.util.Scanner;

public class Uni5Exe22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioInicial = 2000, aumento = 1.5 / 100; 
        int anoInicio = 1996, anoFinal = 2026;

        while (anoInicio <= anoFinal) {
            salarioInicial += (salarioInicial * aumento);
            aumento = aumento * 2;
            anoInicio++;
        }

        System.out.printf("Seu salário em 2026 é de: %.2f", salarioInicial);

        sc.close();
    }

}
