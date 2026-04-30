package Unidade2;

import java.util.Scanner;

public class Uni2Exe11 {
    //Escreva um programa que leia três valores com ponto flutuante 
    // de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    //a) a área do triângulo retângulo que tem A por base e C por altura.
    //b) a área do círculo de raio C. (pi = 3.14159).
    //c) a área do trapézio que tem A e B por bases e C por altura.
    //d) a área do quadrado que tem lado B.
    //e) a área do retângulo que tem lados A e B.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pontoA, pontoB, pontoC;
        float triangulo, circulo, trapezio, quadrado, retangulo;
        float PI = 3.14159f;

        System.out.println("digite o ponto A:");
        pontoA = sc.nextFloat();
        System.out.println("digite o B:");
        pontoB = sc.nextFloat();
        System.out.println("digite o C");
        pontoC = sc.nextFloat();

        triangulo = (pontoA * pontoC)/2;
        circulo = PI * pontoC * pontoC;
        trapezio = ((pontoA + pontoB) * pontoC)/2;
        quadrado = pontoB * pontoB;
        retangulo = pontoA * pontoB;

        System.out.printf("Triângulo: %.3f\n", triangulo);
        System.out.printf("Círculo: %.3f\n", circulo);
        System.out.printf("Trapézio: %.3f\n", trapezio);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retângulo: %.3f", retangulo);

        
        sc.close();
    }

}
