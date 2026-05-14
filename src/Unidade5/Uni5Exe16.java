package Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float altura;

        String genero = "";
        genero = genero.toUpperCase();

        float somaTotal = 0, somaF = 0, mediaTotal = 0, mediaF = 0;
        int contF = 0, contO = 0;

        while (true) {
            System.out.println("Digite sua altura:");
            altura = sc.nextFloat();
              if (altura == 0) {
                break;
            }
            sc.nextLine();
            System.out.println("Digite seu genero (M/F/O), 0 para parar");
            genero = sc.nextLine().toUpperCase();

            if (genero.equals("M")) {
                somaTotal += altura;
                contO++;
            }
            if (genero.equals("F")) {
                somaF += altura;
                contF++;
            }
            if (genero.equals("O")) {
                somaTotal += altura;
                contO++;
            }

            mediaF = somaF / contF;
            mediaTotal = (somaF + somaTotal) / (contO + contF);

        }
        System.out.println("A média das mulheres é: " + mediaF);
        System.out.println("A média total das alturas é: " + mediaTotal);

        sc.close();

    }

}
