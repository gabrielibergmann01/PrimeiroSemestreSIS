package Unidade6;

import java.util.Scanner;

public class Uni6Exe10 {
    private Scanner sc = new Scanner(System.in);
    private int[] vetor = new int[50];
    private int posicsoFim = 0;

    public Uni6Exe10() {
        int op;
        do {
            System.out.println("~~~MENU~~~");
            System.out.println("1 - Incluir Valor");
            System.out.println("2 - Pesquisar Valor");
            System.out.println("3 - Alterar Valor");
            System.out.println("4 - Excluir Valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar Valores");
            System.out.println("7 - Inverter Valores");
            System.out.println("8 - Sair do Sistema");
            System.out.println("Digite a opção:");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    incluirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarVetor();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    InverterValores();
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }

        } while (op != 8);

    }

    private void incluirValor() {

        if (posicsoFim < vetor.length) {
            System.out.println("Digite o número a ser inserido:");
            int numero = sc.nextInt();
            vetor[posicsoFim] = numero;
            System.out.println("Numero: " + numero + " inserido na posição: " + posicsoFim);
            posicsoFim++;
        } else {
            System.out.println("Vetor cheio");
        }

    }

    private int pesquisarValor() {

        System.out.println("Informe um numero");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < posicsoFim; i++) {
            if (vetor[i] == numero) {
                System.out.println("Numero " + numero + " encontrado na posição: " + i);
                encontrado = true;
                return i;
            }
        }
        if (!encontrado) {
            System.out.println("Numero não encontrado");
        }
        return -1;
    }

    private void alterarValor() {
        int posicao = pesquisarValor();
        if (posicao != -1){
            System.out.println("Digite um novo número: ");
            int numero = sc.nextInt();
            vetor[posicao] = numero;
            System.out.println("Substituindo o numero da posicao "+ posicao);
        }
    }

    private void excluirValor() {

        int posicao = pesquisarValor();
        if (posicao != -1){
            for(int i = posicao; i <posicsoFim-1;i++ ){
                vetor[i] = vetor[i+1];
            }
            posicsoFim--;
            System.out.println("Valor Excluído");
        }
    }

    private void InverterValores() {

        int temp=0;
        for(int i = 0; i < posicsoFim; i++){
            for(int j = 0; j < i; j++){
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        mostrarVetor();
    }

    private void ordenarValores() {

        int bolha;
        for(int i = 0; i < posicsoFim-1; i++){
            if(vetor[i] > vetor[i+1]){
                bolha = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = bolha;
                i =-1;
            }
        }
        System.out.println("Valores ordenados");
        mostrarVetor();
    }

    private void mostrarVetor() {
        System.out.println("Mostrando o vetor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("| ");
            System.out.print(vetor[i]);
            System.out.println(" |");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }

}
