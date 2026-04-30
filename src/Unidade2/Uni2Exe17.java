package Unidade2;

import java.util.Scanner;
//Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes.
// A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente 
//(valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e
//de 5% sobre o salário trabalho para o imposto de renda. Ao final informe o nome, o salário bruto e
//o salário líquido do funcionário.

public class Uni2Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int horas, dependentes;
        float salarioBruto, salarioLiquido;
        float inss, ir;

        System.out.println("Qual seu nome?");
        nome = sc.nextLine();
        System.out.println("Quantos dependemtes você possui?");
        dependentes = sc.nextInt();
        System.out.println("Quantas horas você trabalhou nesse mês?");
        horas = sc.nextInt();

        salarioLiquido = (horas * 10) + (dependentes * 60);
        salarioBruto = (horas * 10) + (dependentes * 60);

        inss = salarioLiquido * 0.085f;
        ir = salarioLiquido * 0.05f;

        salarioLiquido = salarioBruto - inss - ir;

        System.out.println("Nome: "+ nome);
        System.out.printf("Seu salario bruto: %.2f", salarioBruto);
        System.out.printf("Seu salario liquido: %.2f",salarioLiquido);
        
        sc.close();
    }

}
