package Unidade5;

import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float altura = 0;
        float soma = 0;
        for (int i = 1; i <= 20; i++){
            System.out.println("Escreva a altura da pessoa "+i);
             altura = sc.nextFloat();
            soma = soma + altura;

        }
        float media = soma / 20;
        System.out.println("A mécdia é: "+media);

        sc.close();

    }

}
