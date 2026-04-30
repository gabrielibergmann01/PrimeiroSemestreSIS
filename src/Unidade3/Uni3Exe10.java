package Unidade3;
//Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
//Fórmula:
//hipotenusa^2=cateto1^2+cateto^2

import java.util.Scanner;

public class Uni3Exe10 {

    float cateto1, cateto2;

    public Uni3Exe10(float cateto1, float cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double hipotenusa(){
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
    

    public static void main(String[] args) {
        float cateto1, cateto2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cateto 1:");
        cateto1 = sc.nextFloat();
        System.out.println("Digite o cateto 2:");
        cateto2 = sc.nextFloat();

        Uni3Exe10 construtor = new Uni3Exe10(cateto1, cateto2);

        System.out.println("A hipotenusa é: "+ construtor.hipotenusa());

        sc.close();
    }

}
