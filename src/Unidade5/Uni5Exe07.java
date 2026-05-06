package Unidade5;

import java.util.Scanner;

//Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.
public class Uni5Exe07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar?");
        int n = sc.nextInt();

        System.out.println("Digite o número 1:");
        float numero = sc.nextFloat();

        float maior = numero;
        float menor = numero;

        for(int i = 2; i <= n; i++){
            System.out.println("Digite o número "+ i + ":");
            numero = sc.nextFloat();

            if(numero > maior){
                maior = numero;
            }
            if(numero < menor){
                menor =  numero;
            }
        }

        System.out.println("Menor número: "+ menor);
        System.out.println("Maior número: "+ maior);

        sc.close();

    }

}
