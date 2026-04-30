package Unidade4;

import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int quantHoras, salarioTotal, salarioExtra,  horasValor;

        System.out.println("Quantas horas você trabalhou?");
        quantHoras = sc.nextInt();
        System.out.println("Qual valor da sua hora?");
        horasValor = sc.nextInt();

        salarioTotal = quantHoras * horasValor;

        if (quantHoras > 160){
            salarioExtra = (quantHoras - 160) * (horasValor / 2);
            salarioTotal = salarioExtra + salarioTotal;
            System.out.println("Seu salário com horas extras: "+ salarioTotal);
        }else{
            System.out.println("Seu salário total sem horas extras é: "+ salarioTotal);
        }


        sc.close();

    }

    //[INÍCIO]
//   ↓
//[Entrada: quantHoras]
//   ↓
/*[Entrada: horasValor]
   ↓
[Processo: salarioTotal = quantHoras * horasValor]
   ↓
      ┌───────────────────────┐
      │ quantHoras > 160 ?    │
      └───────────────────────┘
           ↓         ↓
         SIM        NÃO
          ↓          ↓
[Processo:           [Saída:
salarioExtra =       salarioTotal]
(quantHoras-160) *   
(horasValor/2)]
          ↓
[Processo:
salarioTotal =
salarioTotal + salarioExtra]
          ↓
[Saída:
salario com extra]
          ↓
        [FIM] */

}
