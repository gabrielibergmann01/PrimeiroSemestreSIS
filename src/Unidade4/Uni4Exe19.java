package Unidade4;
//Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado
//0, se os dois valores forem zero
//1, se os dois valores forem positivos
//2, se o x for negativo e o y, positivo 
//3, se os dois valores forem negativos
//4, se o x for positivo e o y, negativo Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o X:");
        float x = sc.nextFloat();
        System.out.println("Digite o Y:");
        float y = sc.nextFloat();

        if ( x == 0 && y == 0){
            System.out.println("Quadrante 0");
        }else if (x > 0 && y > 0){
            System.out.println("Quadrante 1");
        }else if (x > 0 && y < 0){
            System.out.println("Quadrante 2");
        }else if (x < 0 && y < 0){
            System.out.println("Quadrante 3");
        }else if (x < 0 && y > 0){
            System.out.println("Quadrante 4");
        }

        sc.close();
    }
}
/*[INÍCIO]
   ↓
[Entrada: x]
   ↓
[Entrada: y]
   ↓
      ┌──────────────────────────┐
      │ x == 0 E y == 0 ?        │
      └──────────────────────────┘
           ↓           ↓
         SIM          NÃO
          ↓            ↓
 [Saída: Q0]   ┌──────────────────────────┐
               │ x > 0 E y > 0 ?          │
               └──────────────────────────┘
                    ↓           ↓
                  SIM          NÃO
                   ↓            ↓
            [Saída: Q1]   ┌──────────────────────────┐
                          │ x > 0 E y < 0 ?          │
                          └──────────────────────────┘
                               ↓           ↓
                             SIM          NÃO
                              ↓            ↓
                       [Saída: Q2]   ┌──────────────────────────┐
                                     │ x < 0 E y < 0 ?          │
                                     └──────────────────────────┘
                                          ↓           ↓
                                        SIM          NÃO
                                         ↓            ↓
                                  [Saída: Q3]   ┌──────────────────────────┐
                                                │ x < 0 E y > 0 ?          │
                                                └──────────────────────────┘
                                                     ↓           ↓
                                                   SIM          NÃO
                                                    ↓            ↓
                                             [Saída: Q4]      [FIM] */