package Unidade2;

import java.util.Scanner;
//Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
// Se um comerciante compra uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou.
public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lata = 350;
        int garrafa = 600;
        int garrafaPet = 2000;
        int quantlata, quantgarrafa, quantgarrafaPet;
        double litros;

        System.out.println("Quantas latas de 350ml você irá levar?");
        quantlata = sc.nextInt();
        System.out.println("Quantas garrafas de 600ml você irá levar?");
        quantgarrafa = sc.nextInt();
        System.out.println("Quantas garrafas de 2 litros você irá levar?");
        quantgarrafaPet = sc.nextInt();

        litros = ((quantlata * lata) + (quantgarrafa * garrafa) + (quantgarrafaPet * garrafaPet)) / 1000.0;

        System.out.println("No total você irá levar " + litros + " litros.");


        sc.close();
    }

}
