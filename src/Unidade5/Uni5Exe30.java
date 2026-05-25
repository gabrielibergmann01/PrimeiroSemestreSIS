package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, k = 0, somaDentro = 0, somaFora = 0, mochila = 0;
        System.out.println("Digite o valor do N: ");
        n = sc.nextInt();
        System.out.println("Digite o valor de K: ");
        k = sc.nextInt();
        System.out.println("Digite o tamalho da mochila: ");
        mochila = sc.nextInt();

        while (n > 0) {

            if (somaDentro + n <= mochila) {
                somaDentro += n;
                System.out.println(n + " Entrou na mochila\n");
            } else {
                somaFora += n;
                System.out.println(n + " Ficou fora da mochila\n");
            }

            n -= k;
        }

        System.out.println("Soma dentro da mochila " + somaDentro+"\n");
        System.out.println("Soma fora da mochila " + somaFora+"\n");

        sc.close();
    }

}
