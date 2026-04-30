package Unidade3;

import java.util.Scanner;

//Uma empresa tem para um funcionário os seguintes dados: o nome, 
// o número de horas trabalhadas mensais e o número de dependentes. 
// A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) 
// e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos de 8,5% 
// sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
// Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
public class Uni3Exe12 {

    String nome;
    float horas = 10, quantHoras, quantDependentes, dependentes = 60, desconto = 13.5f;

    public Uni3Exe12(float horas, float dependentes, float desconto, String nome, float quantHoras, float quantDependentes){
        this.dependentes = dependentes;
        this.desconto = desconto;
        this.horas = horas;
        this.nome = nome;
        this.quantHoras = quantHoras;
        this.quantDependentes = quantDependentes;
    }
    public float salarioBruto(){
        return (quantHoras * horas) + (quantDependentes * dependentes);
    }
    public float salarioLiquido(){
        return salarioBruto() - (desconto );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        float horas = 10, quantHoras, quantDependentes, dependentes = 60, desconto = 0.13f;

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Quantas horas você trabalhou?");
        quantHoras = sc.nextFloat();
        System.out.println("Quantos depensentes você possui:");
        quantDependentes = sc.nextFloat();

        Uni3Exe12 construtor = new Uni3Exe12(horas, dependentes, desconto, nome, quantHoras, quantDependentes);

        System.out.println("Seu salário bruto é de: "+construtor.salarioBruto());
        System.out.println("Seu salário líquido é de: "+construtor.salarioLiquido());

        sc.close();
    }
}
