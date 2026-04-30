package Unidade4;

import java.util.Scanner;

//Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.
public class Uni4Exe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num;

        System.out.println("Digite um número:");
        num = sc.nextFloat();


        if (num % 1 != 0){
            System.out.println(num+" Casas decimais foram digitadas");
        } else {
            System.out.println(num+ " Casas decimais não foram digitadas");
        }

        sc.close();
    }

}
