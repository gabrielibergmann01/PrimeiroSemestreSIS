package Unidade4;

import java.util.Scanner;

//
public class Uni4Exe25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        System.out.println("Você deseja:\n"+
            "1 - Somar os números\n"+
            "2 - Diferença entre os dois números\n"+
            "3 - O produto entre os dois números\n"+
            "4 - Divisão entre os dois números"
        );

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                float soma = num1 + num2;
                System.out.println("A soma dos números é: "+ soma);
                break;
            case 2:
                float diferenca = Math.abs(num1 - num2);
                System.out.println("A diferença dos números é: "+ diferenca);
                break;
            case 3:
                float produto = num1 * num2;
                System.out.println("O produto dos números é: "+ produto);
                break;
            case 4:
                if (num1 == 0 || num2 == 0){
                    System.out.println("Não é possivel fazer a divisão dos números");
                }else {
                    float divisao = num1 / num2;
                    System.out.println("A divisão dos números é: "+ divisao);
                }
                break;
        
            default:
                System.out.println("Opção Invalida");
                break;
        }

        sc.close();
    }

}
/*[INÍCIO]
   ↓
[Entrada: num1]
   ↓
[Entrada: num2]
   ↓
[Saída: mostrar menu]
   ↓
[Entrada: opcao]
   ↓
        ┌───────────────────────┐
        │ opcao == 1 ?          │
        └───────────────────────┘
             ↓         ↓
           SIM        NÃO
            ↓          ↓
 [Saída: soma]   ┌───────────────────────┐
                 │ opcao == 2 ?          │
                 └───────────────────────┘
                      ↓         ↓
                    SIM        NÃO
                     ↓          ↓
          [Saída: diferença] ┌───────────────────────┐
                            │ opcao == 3 ?          │
                            └───────────────────────┘
                                 ↓         ↓
                               SIM        NÃO
                                ↓          ↓
                       [Saída: produto] ┌───────────────────────┐
                                       │ opcao == 4 ?          │
                                       └───────────────────────┘
                                            ↓         ↓
                                          SIM        NÃO
                                           ↓          ↓
                         ┌───────────────────────────────┐   [Saída:
                         │ num1 == 0 OU num2 == 0 ?      │   opção inválida]
                         └───────────────────────────────┘
                               ↓              ↓
                             SIM             NÃO
                              ↓               ↓
                 [Saída: erro divisão]   [Saída: divisão]
                              ↓
                            [FIM] */