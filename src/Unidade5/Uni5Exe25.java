package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          int direita = 0;
        int esquerda = 0;

        char ponto;

        while (!((direita >= 21 || esquerda >= 21) &&
                Math.abs(direita - esquerda) >= 2)) {

            System.out.println("Digite o vencedor da jogada (D/E):");
            ponto = sc.next().charAt(0);

            ponto = Character.toUpperCase(ponto);

            if (ponto == 'D') {

                direita++;

            } else if (ponto == 'E') {

                esquerda++;
            }

            System.out.println(
                    "Direita: " + direita +
                    " x Esquerda: " + esquerda);
        }

        if (direita > esquerda) {

            System.out.println("Jogador da direita venceu!");

        } else {

            System.out.println("Jogador da esquerda venceu!");
        }

        sc.close();
    }

}
