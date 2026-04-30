package Unidade4;
//Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, 
//o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. 
//Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, 
//e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. 
//Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e 
//calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. 
//Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.

import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pagamentoEmDia, desconto;

        System.out.println("Qual valor da parcela?");
        float valorParcela = sc.nextFloat();
        System.out.println("Qual dia você está fazendo o pagamento?");
        int diaPagamento = sc.nextInt();

        if (diaPagamento <= 10){
            desconto = valorParcela * 0.10f;
            pagamentoEmDia =valorParcela - desconto;
            System.out.println("O pagamneto ganhou 10% de desconto, ficando em: "+ pagamentoEmDia);
        }else if (diaPagamento > 10 && diaPagamento <= 15) {

            System.out.println("Você perdeu o desconto da parcela");

        }else if (diaPagamento > 15){
            int diasAtraso = diaPagamento - 15;
            float pagamentoAtraso = valorParcela + (valorParcela * 0.20f * diasAtraso);
            System.out.println("O pagamento aumento 2% a cada dia, ficando em: "+ pagamentoAtraso);
        }

        sc.close();
    }

}
/*[INÍCIO]
   ↓
[Entrada: valorParcela]
   ↓
[Entrada: diaPagamento]
   ↓
      ┌──────────────────────────┐
      │ diaPagamento <= 10 ?     │
      └──────────────────────────┘
           ↓           ↓
         SIM          NÃO
          ↓            ↓
[Processo:        ┌──────────────────────────┐
calcular 10%]     │ diaPagamento <= 15 ?     │
[Saída: valor]    └──────────────────────────┘
                      ↓           ↓
                    SIM          NÃO
                     ↓            ↓
              [Saída:        ┌──────────────────────────┐
              sem desconto]  │ diaPagamento > 15 ?      │
                             └──────────────────────────┘
                                  ↓           ↓
                                SIM          NÃO
                                 ↓            ↓
                        [Processo: calcular multa]
                        [Saída: valor com atraso]
                                 ↓
                               [FIM] */