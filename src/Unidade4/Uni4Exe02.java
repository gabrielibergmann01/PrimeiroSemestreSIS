package Unidade4;

import java.util.Scanner;

//Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
public class Uni4Exe02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor inteiro:");
        valor = sc.nextInt();

        if (valor %2 ==0){
            System.out.println("O número "+ valor +" é par");
        }else {
            System.out.println("O número "+ valor + " é ímpar");
        }

        sc.close();
    }
     /* [INÍCIO]
   ↓
[Entrada: valor]
   ↓
      ┌───────────────────────┐
      │ valor % 2 == 0 ?      │
      └───────────────────────┘
           ↓         ↓
         SIM        NÃO
          ↓          ↓
[Saída:             [Saída:
"é par"]            "é ímpar"]
          ↓
        [FIM]*/
}
