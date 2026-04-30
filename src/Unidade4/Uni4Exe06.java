package Unidade4;
//Faça um algoritmo que leia um caractere. Caso seja digitada a letra 'M' escreva “Masculino”. 
// Se for digitada a letra 'F' escreva “Feminino”. Se for informado 'I' escreva “Não Informado”. 
// Qualquer outra letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.

import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char caractere;

        System.err.println("Digite um caractere para informar seu sexo:");
        caractere = sc.next().toUpperCase().charAt(0);

        if (caractere == 'M'){
            System.out.println("Masculino");
        }else if (caractere == 'F'){
            System.out.println("Feminino");
        }else if (caractere == 'I'){
            System.out.println("Não informado");
        }else {
            System.err.println("Caractere invalido");
        }

        sc.close();
    }

}
