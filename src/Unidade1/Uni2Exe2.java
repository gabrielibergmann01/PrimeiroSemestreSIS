package Unidade1;

import java.util.Scanner;

public class Uni2Exe2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite um número:");
        num1 = sc.nextDouble();
        System.out.println("Digite outro número:");
        num2 = sc.nextDouble();

        double soma = (num1 * num2);

        System.out.println("A multiplicação dos numeros é:"+ soma);

        sc.close();
    }

}
