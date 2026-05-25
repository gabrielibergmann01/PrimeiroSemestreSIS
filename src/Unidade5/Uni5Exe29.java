package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta = "s";
        int valor = 0;
        int nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;

        while (resposta.equalsIgnoreCase("s")) {

            System.out.println("Digite o valor: ");
            valor = sc.nextInt();

            nota20 = valor / 20;
            valor = valor % 20;
            nota10 = valor / 10;
            valor = valor % 10;
            nota5 = valor / 5;
            valor = valor % 5;
            nota2 = valor / 2;
            valor = valor % 2;
            nota1 = valor / 1;
            valor = valor % 1;

            System.out.println("Notas de 20: " + nota20);
            System.out.println("Notas de 10: " + nota10);
            System.out.println("Notas de 5: " + nota5);
            System.out.println("Notas de 2: " + nota2);
            System.out.println("Notas de 1: " + nota1);

            System.out.println("Deseja adicionar outro valor? (s (SIM) / n (NÂO) )");
            resposta = sc.next();

        }

        sc.close();
    }

}
