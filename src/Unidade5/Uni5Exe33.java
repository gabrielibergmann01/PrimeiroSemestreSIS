package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pNulos = 0, pBrancos = 0;
        int gabs = 0, sarah = 0, gio = 0, yas = 0, nulo = 0, emBranco = 0, totalVotos = 0, opcao;

        do {

            System.out.println("Informe seu voto:");
            System.out.println("1 - gabs");
            System.out.println("2 - Sarah");
            System.out.println("3 - Giovana");
            System.out.println("4 - Yasmin");
            System.out.println("5 - Nulo");
            System.out.println("6 - voto em branco");
            System.out.println("0 - Para sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    gabs++;
                    totalVotos++;
                    break;
                case 2:
                    sarah++;
                    totalVotos++;
                    break;
                case 3:
                    gio++;
                    totalVotos++;
                    break;
                case 4:
                    yas++;
                    totalVotos++;
                    break;
                case 5:
                    nulo++;
                    totalVotos++;
                    break;
                case 6:
                    emBranco++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        System.out.println("\nTOTAL DE VOTOS:");
        System.out.println("Gabs: " + gabs);
        System.out.println("Sarah: " + sarah);
        System.out.println("Giovana: " + gio);
        System.out.println("Yasmin: " + yas);
        System.out.println("Nulos: " + nulo);
        System.out.println("Brancos: " + emBranco);

        pBrancos = (emBranco * 100) / totalVotos;
        pNulos = (nulo * 100) / totalVotos;

        System.out.println("\nPercentual Dos Votos: ");
        System.out.println("Nulos: " + pNulos);
        System.out.println("Em Branco: " + pBrancos);

        sc.close();
    }

}
