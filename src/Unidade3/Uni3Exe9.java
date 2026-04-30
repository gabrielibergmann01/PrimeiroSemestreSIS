package Unidade3;

import java.util.Scanner;

//Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
//Quantas casas decimais devo usar para o número Pi?
public class Uni3Exe9 {

    double raio, altura;

    public Uni3Exe9(double raio, double altura){
        this.altura = altura;
        this.raio = raio;

    }

    public double calcularVolume(){
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, altura;

        System.out.println("Digite o raio:");
        raio = sc.nextDouble();
        System.out.println("Digite a altura:");
        altura = sc.nextDouble();

        Uni3Exe9 construtor = new Uni3Exe9(raio,altura);

        System.out.println("O volume da lata é: "+construtor.calcularVolume());

        sc.close();
    }
}
