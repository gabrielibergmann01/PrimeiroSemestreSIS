package Unidade5;

import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar:");
        float n = sc.nextFloat();

        float menorNeg = 0;
        float soma = 0;
        int cont = 0;

        for (int i = 1; i <= n; i++){
        System.out.println("Digite o número "+i);
            float num = sc.nextFloat();
            if (num < 0){

                if (menorNeg == 0 || num < menorNeg){
                    menorNeg = num;
                }

            }
            if (num > 0){
                soma = num + soma;
                cont++;
            }
        }
        System.out.println("Menor valor negativo: "+menorNeg);
        System.out.println("Média dos positivos: "+(soma/cont));
        sc.close();

    }

}
