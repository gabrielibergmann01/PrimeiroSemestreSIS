package Unidade2;

import java.util.Scanner;
//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de
//vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão
//sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
public class Uni2Exe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        float salario, total, vendas;
        float comissao = 0.15f;

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();
        System.out.println("Qual seu salario?");
        salario = sc.nextFloat();
        System.out.println("Quantas vendas vc fez no mes?");
        vendas = sc.nextFloat();

        total = salario + (vendas * comissao);

        System.out.println("Nome: "+ nome);
           System.out.printf( "Seu salario é de: %.2f", total);

        sc.close();
    }

}
