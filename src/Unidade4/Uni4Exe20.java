package Unidade4;
//Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
//descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:

import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Dgite a segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = sc.nextDouble();
        System.out.println("Qual a média dos seus exercícios:");
        double mediaExercicios = sc.nextDouble();

        double media = (nota1*1 + nota2*2 + nota3*3 + mediaExercicios*1)/7;

        if (media >= 9){
            System.out.println("A média foi de: "+media+" Conceito A: Aprovado");
        } else if (media >= 7.5 && media < 9){
            System.out.println("A média foi de: "+media+" Conceito: B. Aprovado");
        }else if (media >= 6 && media < 7.5){
            System.out.println("A média foi de: "+media+" Conceito: C. Aprovado");
        }else if (media >= 4 && media < 6){
            System.out.println("A média foi de: "+media+" Conceito: D. Reprovado");
        }

        sc.close();
    }

}
