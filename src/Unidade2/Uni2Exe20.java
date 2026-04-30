package Unidade2;

import java.util.Scanner;
//Considere que você tenha um papel quadrado e o dobre varias vezes sempre em um número par de dobra no meio do quadrado. 
//Ao abrir a folha de papel é possível verificar a marcação de novos quadrados. Baseado nisso leia o número de dobras 
//(lembre que sempre é um número par) feitas no papel e escreva quantos quadrados podem ser vistos após desdobrá-lo.
public class Uni2Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dobras, quadrados;

        System.out.println("Quantas vezes você dobrou o papel?");
        dobras = sc.nextInt();

        quadrados = (int)Math.pow(4, dobras);
        
        System.out.println("Total de quadrados ao final é de: " + quadrados);
        
        sc.close();
    }

}
