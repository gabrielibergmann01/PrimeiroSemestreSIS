package Unidade2;

import java.util.Scanner;
//Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
//A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
//As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
//A seguir mostre a relação de notas necessárias.


public class Uni2Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorDouble;

        System.out.println("Digite o valor inteiro");
        valorDouble = sc.nextDouble();
        int valor = (int)Math.round(valorDouble * 100);

        int reais = valor / 100;
        int centavos = valor % 100;

        int n100 = reais/100;
        reais = reais % 100;
        int n50 = reais / 50;
        reais = reais % 50;
        int n20 = reais / 20;
        reais = reais % 20;
        int n10 = reais / 10;
        reais = reais % 10;
        int n5 = reais/5;
        reais = reais % 5;
        int n2 = reais / 2;
        reais = reais % 2;
        int n1 = reais / 1;
        reais = reais % 1;
        System.out.println("Notas de 100: "+ n100);
        System.out.println("Notas de 50: "+ n50);
        System.out.println("Notas de 20: "+ n20);
        System.out.println("Notas de 10: "+ n10);
        System.out.println("Notas de 5: "+ n5);
        System.out.println("Notas de 2: "+ n2);
        System.out.println("Notas de 1: "+ n1);

        System.out.println("////CENTAVOS///");
        int m1 = reais;
        int m50 = centavos / 50;
        centavos = centavos % 50;
        int m25 = centavos / 25;
        centavos = centavos % 25;
        int m10 = centavos / 10;
        centavos = centavos % 10;
        int m5 = centavos / 5;
        centavos = centavos % 5;
        int cent1 = centavos / 1;
        centavos = centavos % 1;

        System.out.println("Moedas de 1 real: "+ m1);
        System.out.println("Moedas de 50 centavos: "+ m50);
        System.out.println("Moedas de 25 centavos: "+ m25);
        System.out.println("Moedas de 10 centavos: " + m10);
        System.out.println("Moedas de 5 centavos: " + m5);
        System.out.println("Moedas de 1 centavo: "+ cent1);

        sc.close();
    }

}
