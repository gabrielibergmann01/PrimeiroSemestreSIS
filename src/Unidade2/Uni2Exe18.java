package Unidade2;

import java.util.Scanner;
//Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Leia o comprimento e altura de uma parede 
//(em metros) e escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

public class Uni2Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float comprimento, largura, area;
        int azulejo;
        double valor;

        System.out.println("Qual o comprimento da parede?");
        comprimento = sc.nextFloat();
        System.out.println("E a largura:");
        largura = sc.nextFloat();

        area = comprimento * largura;
        azulejo = (int)(area * 9);
        valor = azulejo * 12.50f;

        System.out.printf("O valor gasto é de: %.2f", valor );

        sc.close();
    }

}
