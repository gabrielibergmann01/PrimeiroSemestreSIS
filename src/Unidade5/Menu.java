package Unidade5;

import java.util.Scanner;

public class Menu {
    private static double num1;
    private static double num2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("9 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    pergunta(sc);
                    somar(num1, num2);
                    break;
                case 2:
                    pergunta(sc);
                    subtrair(num1, num2);
                    break;
                case 3:
                    pergunta(sc);
                    dividir(num1, num2);
                    break;
                case 4:
                    pergunta(sc);
                    multiplicar(num1, num2);
                    break;

                default:
                    
                    break;
            }

        } while (opcao != 9);
        sc.close();

    }

    private static void multiplicar(double num1, double num2) {
        System.out.println("Multiplicar");
        System.out.println("Resultado: " + (num1 * num2));
    }

    private static void dividir(double num1, double num2) {
        System.out.println("Dividir");
        System.out.println("Resultado: " + (num1 / num2));

    }

    private static void subtrair(double num1, double num2) {
        System.out.println("Subtrair");
        System.out.println("Resultado: " + (num1 - num2));

    }

    private static void somar(double num1, double num2) {
        System.out.println("Somar");
        System.out.println("Resultado: " + (num1 + num2));

    }

    private static void pergunta(Scanner sc) {
        System.out.println("Digite o primeiro valor:");
        num1 = sc.nextDouble();
        System.out.println("Digite o outro número:");
        num2 = sc.nextDouble();
    }

}
