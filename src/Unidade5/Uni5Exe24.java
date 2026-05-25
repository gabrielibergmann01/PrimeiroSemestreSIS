package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  gramas = 0, limiteKg = 0, peixe = 0, total = 0;
        String reposta = "S";

            System.out.println("Qual o limite diario?");
            limiteKg = sc.nextDouble();   
            
            gramas = limiteKg * 1000;

        while (reposta.equalsIgnoreCase("S")) {

            System.out.println("Qual peso do peixe? (Gramas)");
            peixe = sc.nextDouble();

            total += peixe;

            System.out.println("Total da pesca em gramas: "+ total);

            if (total > gramas){
                System.out.println("O limite foi excedido");
                break;
            }

            System.out.println("Deseja informar o peso de mais um peixe: ");
            reposta = sc.next();
            
        }

        sc.close();
    }

}
