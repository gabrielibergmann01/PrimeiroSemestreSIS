package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro dia da semana");
        int primeiroDia = sc.nextInt();

        System.out.println("Quantidade de dias do mês:");
        int diasMes = sc.nextInt();

        System.out.println("DOM SEG TER QUA QUI SEX SAB");
        int espacos = 1;

        while (espacos < primeiroDia) {
            
            System.out.print("   ");
            espacos++;

        }

        int dia = 1;
        int diaSemana = primeiroDia;

        while (dia <= diasMes) {

             System.out.printf("%3d ", dia);

            if (diaSemana == 7) {

                System.out.println();
                diaSemana = 1;

            } else {

                diaSemana++;
            }

            dia++;
            
        }

        sc.close();
    }

}
