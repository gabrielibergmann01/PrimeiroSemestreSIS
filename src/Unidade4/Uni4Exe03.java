package Unidade4;

import java.util.Scanner;

//Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
public class Uni4Exe03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();

        if (valor1 > valor2){
            System.out.println("O valor "+valor1+" é maior");
        }else{
            System.out.println("O valor "+valor2+" é maior");
        }

        sc.close();
    }

 /*[INÍCIO]
   ↓
[Entrada: valor1]
   ↓
[Entrada: valor2]
   ↓
      ┌───────────────────────┐
      │ valor1 > valor2 ?     │
      └───────────────────────┘
           ↓         ↓
         SIM        NÃO
          ↓          ↓
[Saída:             [Saída:
valor1 é maior]     valor2 é menor]
          ↓
        [FIM] */
}
