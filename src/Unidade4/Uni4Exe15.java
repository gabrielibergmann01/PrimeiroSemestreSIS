package Unidade4;

import java.util.Scanner;

//Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
//A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses. 
//Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. O seu algoritmo deve 
//solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
public class Uni4Exe15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Há quantos meses você foi admitido?");
        int meses = sc.nextInt();
       
        if (meses <= 12 && meses > 1){
          
            System.out.println("Você recebe 5% de reajuste");

        }   else if (meses >= 13 && meses <= 48){
               
                System.out.println("Você recebe 7% de reajuste");
        } else {
            System.out.println("Sem reajuste.");
        }

        sc.close();
    }
/*[INÍCIO]
   ↓
[Entrada: meses]
   ↓
      ┌──────────────────────────────┐
      │ meses <= 12 E meses > 1 ?    │
      └──────────────────────────────┘
           ↓              ↓
         SIM             NÃO
          ↓               ↓
[Saída: 5%]      ┌──────────────────────────────┐
                 │ meses >= 13 E meses <= 48 ?  │
                 └──────────────────────────────┘
                        ↓              ↓
                      SIM             NÃO
                       ↓               ↓
               [Saída: 7%]     [Saída: sem reajuste]
                       ↓
                     [FIM] */
}
