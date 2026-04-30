package Unidade3;
//Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Faça um programa para ler o comprimento
//e altura de uma parede (em metros), e depois escrever o valor gasto com a compra de azulejos. 
//Considere que um metro quadrado é formado por 9 azulejos.

import java.util.Scanner;

public class Uni3Exe13 {

    float altura, comprimento;

    public Uni3Exe13(float altura, float comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
        
    }
    public float area(){
        return  comprimento * altura;
    }
    public float quantAzulejos(){
        return area() * 9;
    }
    public float valorAzulejos(){
        return quantAzulejos() * 12.50f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float altura, comprimento;

        System.out.println("Digite a altura da parede:");
        altura = sc.nextFloat();
        System.out.println("Digite o comprimento:");
        comprimento = sc.nextFloat();

        Uni3Exe13 construtor = new Uni3Exe13(altura, comprimento);

        System.out.println("O valor dos azulejos é : "+construtor.valorAzulejos());

        sc.close();
    }

}
