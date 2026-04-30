package Unidade4;

import java.util.Scanner;

//Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda “Sim”,
//caso a resposta seja true, ou “Não”, caso seja false.
public class Uni4Exe05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean resposta;

        System.out.println("A cor é Azul? (true/false)");
        resposta = sc.nextBoolean();

        if (resposta){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }


        sc.close();
    }

}
