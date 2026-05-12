package Unidade5;

import java.util.Scanner;

public class Uni5Exe12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Linhas deseja ver:");
        int num = sc.nextInt();

        int numero = 1;

        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf(numero +" ");
                numero++;
            }
             System.out.println();
        }
    
        sc.close();
    }

}
