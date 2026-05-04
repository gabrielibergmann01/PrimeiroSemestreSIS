package Unidade5;

import java.util.Scanner;

public class Uni05Exe05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores voce deseja ver?");
        int n = sc.nextInt();
        int valor = 8;

        for(int i = 1; i <= n; i++){

            if (i % 2 != 0){
                System.out.println(valor);
            } else {
                System.out.println(valor + 2);
               valor = valor * 2;
            }

        }
        sc.close();
    }

}
