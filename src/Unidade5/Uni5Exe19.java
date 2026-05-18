package Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float valorDaCompra = -1, valorTotal = 0, comprasTotal = 0;

        while (valorDaCompra != 0) {

            System.out.println("Qual valor da sua compra?");
            valorDaCompra = sc.nextFloat();

            if(valorDaCompra > 500){
               
                valorTotal = valorDaCompra -(valorDaCompra * 0.20f);
                comprasTotal += valorTotal;

            }
            if(valorDaCompra <= 500){
                valorTotal = valorDaCompra - (valorDaCompra * 0.15f);
                comprasTotal += valorTotal;

            }

            System.out.println("Valor da compra: "+ valorTotal);
            
        }

        System.out.println("Total das compras: "+ comprasTotal);
        
        sc.close();
    }

}
