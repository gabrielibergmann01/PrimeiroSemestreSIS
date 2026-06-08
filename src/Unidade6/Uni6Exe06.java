package Unidade6;

import java.util.Scanner;

public class Uni6Exe06 {
    private Scanner sc = new Scanner(System.in);
    private double[] vetor;


    public void tamanhoVetor(){
        System.out.println("Digite o tamanho do vetor:");
        int tam = sc.nextInt();
        vetor =  new double[tam];
    }

    public void preencherVetor(){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número para posição "+i+":");
            vetor[i] = sc.nextDouble();
        }
    }

    private boolean encontrarValor(){
        System.out.println("Digite um valor para encontrar no vetor:");
        double n = sc.nextDouble();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == n){
                System.out.println("O número "+n+" está na posição: "+i);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("O valor não foi encontrado no vetor");
            encontrado = false;
            
        }return encontrado;
    }

    private void mostrarVetor(){
        for (int i =0; i < vetor.length; i++){
            System.out.print("  |");
            System.out.print(vetor[i]);
            System.out.print("|  ");
        }
    }

    public Uni6Exe06(){

    }
    public static void main(String[] args) {
        Uni6Exe06 uni6Exe06 = new Uni6Exe06();

        uni6Exe06.tamanhoVetor();
        uni6Exe06.preencherVetor();
        uni6Exe06.encontrarValor();
        uni6Exe06.mostrarVetor();
    }

}
