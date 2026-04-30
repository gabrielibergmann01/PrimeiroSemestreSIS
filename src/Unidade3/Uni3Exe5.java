package Unidade3;

import java.util.Scanner;

//Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel 
// com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
// Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular 
// o gasto total da granja para marcar todos os seus frangos.
public class Uni3Exe5 {
    int quantGalinhas;
    float anelAlimento = 7.0f;
    float anelChip = 4.0f;

    public Uni3Exe5(int quantGalinhas, float anelAlimento, float anelChip){

        this.anelAlimento = anelAlimento;
        this.anelChip = anelChip;
        this.quantGalinhas = quantGalinhas;

    }
    public float valorTotal(){
        return (quantGalinhas * anelChip) + (quantGalinhas * anelAlimento);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int quantGalinhas;
        float anelAlimento = 7.0f, anelChip = 4.0f;

        System.out.println("Digite a quantidade de galinhas: ");
        quantGalinhas = sc.nextInt();

        Uni3Exe5 construtor = new Uni3Exe5(quantGalinhas,anelAlimento,anelChip);

        System.out.println("Seu gasto vai ser de: "+ construtor.valorTotal());

        sc.close();
    }

}
