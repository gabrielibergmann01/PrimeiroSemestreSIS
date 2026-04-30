package Unidade1;

import java.util.Scanner;

public class MediaPoderada {

    public static void main(String[] args) {
        //A média final será calculada pela seguinte fórmula:
        //Média Final = (Prova 1 * 0.20) + (Prova 2 * 0.30) + (Projeto Final * 0.30) + (Média Aritmética dos Demais Exercícios e Trabalhos Parciais * 0.20)
        
        float prova1;
        float prova2;
        float projeto;
        float exercícios1;
        float exercícios2;
        float exercícios3;
        float exercícios4;
        float exercícios5;
        float exercícios6;
        float exercícios7;
        float media;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova:");
        prova1 = sc.nextFloat();
        System.out.println("Digite a nota da segunda prova:");
        prova2 = sc.nextFloat();
        System.out.println("Digite a nota do projeto:");
        projeto = sc.nextFloat();
        System.out.println("Digite a nota do primeiro exercicio:");
        exercícios1 = sc.nextFloat();
        System.out.println("Digite a nota do segundo exercicio:");
        exercícios2 = sc.nextFloat();
        System.out.println("Digite a nota do terceiro exercicio:");
        exercícios3 = sc.nextFloat();
        System.out.println("Digite a nota do quarto exercicio:");
        exercícios4 = sc.nextFloat();
        System.out.println("Digite a nota do quinto exercicio:");
        exercícios5 = sc.nextFloat();
        System.out.println("Digite a nota do sexto exercicio:");
        exercícios6 = sc.nextFloat();
        System.out.println("Digite a nota do sétimo exercicio:");
        exercícios7 = sc.nextFloat();

        media = (prova1 * 0.20f) + (prova2 * 0.30f) + (projeto * 0.30f) + 
        (((exercícios1 + exercícios2 + exercícios3 + exercícios4 + exercícios5 + exercícios6 + exercícios7)/7) * 0.20f); 

        System.out.println("Sua média é de:" + media);
        sc.close();

    }
}
