package Unidade3;

import java.util.Scanner;

//Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
//°F = (9/5) °C + 32
public class Uni3Exe11 {

    private double celsius;

    public Uni3Exe11(double celsius){
        this.celsius = celsius;
    }

    public double fahrenheit(){
        return (9.0 / 5.0) * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double celsius;

        System.out.println("Digite os graus celsius:");
        celsius = sc.nextDouble();

        Uni3Exe11 construtor = new Uni3Exe11(celsius);

        System.out.println("Fahrenheit: "+construtor.fahrenheit());

        sc.close();
    }
}
