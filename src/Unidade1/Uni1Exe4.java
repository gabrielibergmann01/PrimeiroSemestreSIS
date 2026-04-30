package Unidade1;

import java.util.Scanner;
//Leia dois valores de ponto flutuante e calcule a média ponderada
//  sabendo que a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11),
//  sendo que a nota vai de 0.0 a 10.0.
public class Uni1Exe4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;

        System.out.println("Digite uma nota:");
        num1 = sc.nextFloat();
        System.out.println("Digite outra nota:");
        num2 = sc.nextFloat();

        float media = ((num1 * 3.5f) + (num2 * 7.5f))/11;
        
        System.out.printf("A media ponderada é de: %.2f", media);

        sc.close();
    }

}
