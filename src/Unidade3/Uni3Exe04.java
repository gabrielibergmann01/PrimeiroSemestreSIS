package Unidade3;

import java.util.Scanner;

//Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada
// (as notas tem pesos respectivos de 5, 3 e 2).
public class Uni3Exe04 {
    private float nota1, nota2, nota3;
    private float peso1 = 5;
    private float peso2 = 3;
    private float peso3 = 2;

    public Uni3Exe04(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;

    }

    public float mediaPonderada(){

        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3;
        float peso1 = 5;
        float peso2 = 3;
        float peso3 = 2;

        System.out.println("Digite sua primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.println("Digite sua terceira nota: ");
        nota3 = sc.nextFloat();

        Uni3Exe04 construtor = new Uni3Exe04(nota1, nota2, nota3, peso1, peso2, peso3);

        System.out.printf("Sua média é de: %.2f", construtor.mediaPonderada());

        sc.close();
    }

}
