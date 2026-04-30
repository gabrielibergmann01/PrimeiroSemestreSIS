package Unidade2;

import java.util.Scanner;

public class Uni2Exe8 {
    //Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
    // o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e 
    // o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codpeca1, quantpecas1, codpeca2, quantpecas2;
        float valores1, valores2, total1, total2;

        System.out.println("Digite o codigo das pecas 1:");
        codpeca1 = sc.nextInt();
        System.out.println("Digite quantas voce vai levar:");
        quantpecas1 = sc.nextInt();
        System.out.println("Qual o valor unitario das peças?");
        valores1 = sc.nextFloat();

        System.out.println("Digite o codigo das pecas 2:");
        codpeca2 = sc.nextInt();
        System.out.println("Digite quantas pecas vai levar");
        quantpecas2 = sc.nextInt();
        System.out.println("Qual o valor unitario de cada peça?");
        valores2 = sc.nextFloat();

        total1 = (quantpecas1 * valores1 );
        total2 = (quantpecas2 * valores2);
        float total = total1 + total2;

        System.out.printf("As peças do código %d ficaram em:%.2f\n", codpeca1, total1);
        
        System.out.printf("As peças do código %d ficaram em:%.2f\n",codpeca2, total2);

        System.out.printf("O valor total das peças ficou em: %.2f", total);

        sc.close();
    }

}
