package Unidade6;

import java.util.Scanner;

public class ExemploNome {

    public static void main(String[] args) {
        int tamanho = 10;
        String[] nomes = new String[tamanho];
        double[] nota = new double[tamanho];
        Scanner sc = new Scanner(System.in);

        for(int i =0; i < tamanho; i++){
            System.out.println("Digite o nome "+i);
            nomes[i] = sc.nextLine();
            System.out.println("Digite a nota: ");
            nota[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < tamanho; i++){
            System.out.println("\nPosição "+i);
            System.out.println("Nome: "+nomes[i]);
            System.out.println("nota: "+nota[i]);
        }          
        int posicaoMaiorNota = 0;
        double maiorNota = Double.MIN_VALUE;
        for (int i = 0; i <= tamanho; i++){
            if (nota[i] > maiorNota){
                maiorNota = nota[i];
                posicaoMaiorNota = i;
            }
        }
        System.out.println("aluno com maior nota: "+
            nomes[posicaoMaiorNota]
        );
        sc.close();
    }

}
