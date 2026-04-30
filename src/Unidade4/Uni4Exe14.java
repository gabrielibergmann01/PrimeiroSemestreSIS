package Unidade4;

import java.util.Scanner;

//Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, 
// e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos.
public class Uni4Exe14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia do mês:");
        int dia = sc.nextInt();
        System.out.println("Digite o mês:");
        int mes = sc.nextInt();
        System.out.println("Digite o ano:");
        int ano = sc.nextInt();

        if ( dia > 0 && dia < 32 && mes < 13 && mes > 0 ){

            if (mes == 1 || mes == 3){

                System.out.println("Valida");

            }else if (mes != 2 && dia < 31){

                System.out.println("Valida");

            }else if (mes == 2 && dia < 29){

                System.out.println("Valida");

            }else if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)){

                System.out.println("Valida");
            }else {
                System.out.println("Não valida");
            }
        }else {
            System.out.println("Não valida");
        }

        sc.close();
    }

}
