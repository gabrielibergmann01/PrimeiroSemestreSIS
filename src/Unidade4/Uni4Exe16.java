package Unidade4;

import java.util.Scanner;

//Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
//(considere que a idade entre homens e mulheres sempre serão diferentes). 
//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, 
//e o produto das idades do homem mais novo com a mulher mais velha.
public class Uni4Exe16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do homem 1:");
        int h1 = sc.nextInt();
        System.out.println("Digite4 a idade do homem 2:");
        int h2 = sc.nextInt();

        int homemVelho, homemNovo;

        if (h1 > h2){
            homemVelho = h1;
            homemNovo = h2;
        }else {
            homemNovo = h1;
            homemVelho = h2;
        }

        System.out.println("Digite a idade da mulher 1:");
        int m1 = sc.nextInt();
        System.out.println("Digite a idade da mulher 2:");
        int m2 = sc.nextInt();

        int mulherVelha, mulherNova;

        if (m1 > m2){
            mulherVelha = m1;
            mulherNova = m2;
        }else {
            mulherVelha = m2;
            mulherNova = m1;
        }

        int soma = homemVelho + mulherNova;
        int produto = homemNovo * mulherVelha;

        System.out.println("A soma é: "+ soma);
        System.out.println("E o produto é: "+ produto);

        sc.close();
    }

}
/*[INÍCIO]
   ↓
[Entrada: h1]
   ↓
[Entrada: h2]
   ↓
      ┌───────────────────────┐
      │ h1 > h2 ?             │
      └───────────────────────┘
           ↓         ↓
         SIM        NÃO
          ↓          ↓
[homemVelho=h1]   [homemVelho=h2]
[homemNovo=h2]    [homemNovo=h1]
          ↓
[Entrada: m1]
   ↓
[Entrada: m2]
   ↓
      ┌───────────────────────┐
      │ m1 > m2 ?             │
      └───────────────────────┘
           ↓         ↓
         SIM        NÃO
          ↓          ↓
[mulherVelha=m1]  [mulherVelha=m2]
[mulherNova=m2]   [mulherNova=m1]
          ↓
[Processo: soma = homemVelho + mulherNova]
   ↓
[Processo: produto = homemNovo * mulherVelha]
   ↓
[Saída: soma]
   ↓
[Saída: produto]
   ↓
[FIM] */