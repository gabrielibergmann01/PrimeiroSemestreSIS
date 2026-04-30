package Unidade4;

import java.util.Scanner;

//Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
public class Uni4Exe09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int valo2 = sc.nextInt();

        if (valor1 % valo2 == 0 || valo2 % valor1 == 0){
            System.out.println("Os valores são múltiplos");
        }else {
            System.out.println("Os valores não são múltiplos");
        }

        sc.close();
    }

}
