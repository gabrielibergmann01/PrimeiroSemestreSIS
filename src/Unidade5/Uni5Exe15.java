package Unidade5;

import java.util.Scanner;

public class Uni5Exe15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        float nota1, nota2, media = 0;

        while (!nome.equalsIgnoreCase("fim")) {
            System.out.println("Digite o nome do aluno: ('fim' para sair)");
            nome = sc.nextLine();
            
            System.out.println("Digite a primeira nota:");
            nota1 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Digite a nota 2:");
            nota2 = sc.nextFloat();
            sc.nextLine();

            media = (nota1 + nota2) / 2;

            System.out.println(nome + " sua média é: " + media);

        }

        System.out.println("fim!");

        sc.close();

    }
}