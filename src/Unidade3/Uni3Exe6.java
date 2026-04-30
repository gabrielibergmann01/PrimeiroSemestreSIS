package Unidade3;

import java.util.Scanner;

//Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado 
// pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
public class Uni3Exe6 {

    float kilo = 25;
    float pesoPrato = 0.750f;
    
    public Uni3Exe6(float kilo, float pesoPrato){

        this.kilo = kilo;
        this.pesoPrato = pesoPrato;

    }

    public float calcularKilo(){
        return (kilo * pesoPrato);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float kilo = 25.0f;
        float pesoPrato = 0.750f;

        Uni3Exe6 construtor = new Uni3Exe6(kilo,pesoPrato);

        System.out.println("O valor do prato ficou: "+ construtor.calcularKilo());

        sc.close();
    }

}
