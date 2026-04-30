package Unidade3;

import java.util.Scanner;

//Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
//X centena(s)  Y dezena(s) K unidade(s)  
public class Uni3Exe15 {

    int num;

    public Uni3Exe15(int num){
        this.num = num;
    }

    public int centena(){
        return num / 100;
    }
    public int dezena(){
        return (num % 100) / 10;
    }
    public int unidade(){
        return num % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        Uni3Exe15 construtor = new Uni3Exe15(num);

        System.out.println(construtor.centena() + " Centena(s)");
        System.out.println(construtor.dezena() + " Dezena(s)");
        System.out.println(construtor.unidade() + " Unidade(s)");


        sc.close();
    }

}
