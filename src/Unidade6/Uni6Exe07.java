package Unidade6;

import java.util.Scanner;

public class Uni6Exe07 {
    private Scanner sc = new Scanner(System.in);
    private int[] vetor;

    public void tamanhoVetor(){
        System.out.println("Digite o tamanho do vetor:");
        int tam = sc.nextInt();
       
        while (tam > 20) {
            System.out.println("Digite um valor até 20:");
            tam = sc.nextInt();
            
        }vetor = new int[tam];
        
    }

    private boolean verificarVetor(int valor){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor){
                return true;
            }
        }
        return false;
    }

    private void preencherVetor(){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o número da posição "+i+":");
            int valor = sc.nextInt();
            while (verificarVetor(valor)) {
                System.out.println("O número já existe! Digite outro:");
                valor = sc.nextInt();
            }
            vetor[i] = valor;
        }
    }

    public void ordenarValor(){
         int bolha;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = -1;
            }
        }
        System.out.println("Valores ordenados");
    }

    public void mostrarVetor(){
        for (int i =0; i < vetor.length; i++){
            System.out.print("  |");
            System.out.print(vetor[i]);
            System.out.print("|  ");
        }
    }

    public Uni6Exe07(){
    }
    public static void main(String[] args) {
        Uni6Exe07 uni6Exe07 = new Uni6Exe07();

        uni6Exe07.tamanhoVetor();
        uni6Exe07.preencherVetor();
        uni6Exe07.ordenarValor();
        uni6Exe07.mostrarVetor();
    }

}
