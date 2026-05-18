package Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int canal = -1, pessoas = 0, totalPessoas = 0;
        int c4 = 4, c5 = 5, c9 = 9, c12 = 12, cP4 = 0, cP5 = 0, cP9 = 0, cP12 =0;

        while (canal != 0) {

            System.out.println("Qual canal estão assistindo? (Digite 0 para sair)");
            canal = sc.nextInt();
            if (canal == 0){
                break;
            }
            System.out.println("Quantas pessoas estão aasistindo á tv?");
            pessoas = sc.nextInt();
            totalPessoas += pessoas;

            if (canal == c4){
                cP4 += pessoas;
            }else if(canal == c5){
                cP5 += pessoas;
            }else if (canal == c9){
                cP9 += pessoas;
            }else if(canal == c12){
                cP12 += pessoas;
            }
            
        }

        System.out.printf("Canal 4: %.2f\n", (cP4 * 100.0) / totalPessoas, "%");
        System.out.printf("Canal 5: %.2f\n", (cP5 * 100.0) / totalPessoas, "%");
        System.out.printf("Canal 9: %.2f\n", (cP9 * 100.0) / totalPessoas , "%");
        System.out.printf("Canal 12: %.2f\n", (cP12 * 100.0) / totalPessoas, "%");

        sc.close();

    }

}
