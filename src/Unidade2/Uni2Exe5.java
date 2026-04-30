package Unidade2;

import java.util.Scanner;
//Leia quatro valores inteiros A, B, C e D. A seguir,
// calcule e mostre a diferença do produto de A e B pelo produto de C e D
// segundo a fórmula: DIFERENCA = (A * B - C * D).
public class Uni2Exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorA, valorB, valorC, valorD;
        System.out.println("Digite o valor de A:");
        valorA = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        valorB = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        valorC = sc.nextDouble();
        System.out.println("Digite o valor de D:");
        valorD = sc.nextDouble();

        double soma = (valorA * valorB - valorC * valorD);

        System.out.println("A difeirenca de A e B pelo produto de C e D é:"+ soma);


        sc.close();
    }

}
