package Unidade4;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("vamos validar se vc tem direito a meia entrada:");

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("É doador de orgãos?");
        String resposta = sc.next();
        boolean doador = false;
        if (resposta.equalsIgnoreCase("Sim")
            || (resposta.equalsIgnoreCase("S"))){
                doador = true;
            }


        

        if(idade < 18 || idade >= 60 || doador){
            System.out.println("Você tem direito a meia entrada");

        }else {
            System.out.println("Você não tem direito a meia entrada");
        }

        sc.close();
     }
}
