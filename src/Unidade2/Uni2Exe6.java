package Unidade2;

import java.util.Scanner;
//Escreva um programa que leia o número de um funcionário,
//seu número de horas trabalhadas, o valor que recebe por hora e
//calcula o salário desse funcionário. A seguir, mostre o número e
//o salário do funcionário, com duas casas decimais.

public class Uni2Exe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFuncionario;
        double hora, quantasHoras, salario;

        System.out.println("Qual seu número de identificação:");
        numFuncionario = sc.nextInt();
        System.out.println("Quanto é sua hora?");
        hora = sc.nextDouble();
        System.out.println("Quantas horas você trabalhou?");
        quantasHoras = sc.nextDouble();

        salario = (hora * quantasHoras);

        System.out.println("Funcionario:" + numFuncionario);
        System.out.printf("Seu salário é de: %.2f", salario);

        sc.close();
    }

}
