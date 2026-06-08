package Unidade6;

import java.util.Scanner;

public class Uni6Exe08 {
    Scanner sc = new Scanner(System.in);
    float[] vetor;
    int[] frequencia;

    public void tamVetor(){
        System.out.println("Qual o tamanho do vetor?");
        int tam = sc.nextInt();
        while (tam > 20) {
            System.out.println("Tamanho invalido! Digte um valor ate 20:");
            tam = sc.nextInt();
        }
        vetor = new float[tam];
        frequencia = new int[tam];
    }

    public void preencherVetor(){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número para posição "+i+":");
            vetor[i] = sc.nextFloat();
        }
    }

    public void verificar(){
        for (int i = 0; i < vetor.length; i++){
            int freq = 0;
            for (int j =0; j < vetor.length; j++){
                if (vetor[i] == vetor[j]){
                    freq++;
                }
            }frequencia[i] = freq;
        }
    }

    public void exibirVetor(){
        for (int i = 0; i < vetor.length; i++){
            System.out.print("  |");
            System.out.print(vetor[i]);
            System.out.print("|  ");
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++){
            boolean jaExibido = false;
            for (int j = 0; j < i; j++){
                if(vetor[j] == vetor[i]){
                    jaExibido = true;
                    break;
                }
            }
            if (!jaExibido){
                System.out.println("valor " + vetor[i] + " | frequencia " + frequencia[i]);
            }
        }
    }

    public Uni6Exe08(){

    }
    public static void main(String[] args) {
        Uni6Exe08 uni6Exe08 = new Uni6Exe08();

        uni6Exe08.tamVetor();
        uni6Exe08.preencherVetor();
        uni6Exe08.verificar();
        uni6Exe08.exibirVetor();
    }

}
