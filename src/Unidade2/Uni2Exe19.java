package Unidade2;

import java.util.Scanner;
//Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D.
//Leia os valores de B, C e D e calcule o valor de A.

public class Uni2Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C,D;

        System.out.println("Digite o valor de B:");
        B = sc.nextInt();
        System.out.println("Digite o valor de C:");
        C = sc.nextInt();
        System.out.println("Digite o valor de D:");
        D = sc.nextInt();
        
        A = (B * C) / D;
        System.out.println("O valor de A é:"+ A);

        /////////////////PERGUNTA NÃO ESTÁ BEM FORMULADA, ESPERO Q SEJA ISSO, SE NÃO O CODIGO ESTA AQUI EMBAIXO
        //int A,B,C,D;

        //System.out.println("Digite o valor de B:");
        //B = sc.nextInt();
        //System.out.println("Digite o valor de C:");
        //C = sc.nextInt();
        //System.out.println("Digite o valor de D:");
        //D = sc.nextInt();
        
        //A = B;
        //System.out.println("O valor de A é:"+ A);

        sc.close();
    }

}
