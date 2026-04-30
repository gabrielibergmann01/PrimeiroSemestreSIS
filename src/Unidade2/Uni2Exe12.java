package Unidade2;

import java.util.Scanner;
//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
// p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula,
// segundo a fórmula:


public class Uni2Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double X1, Y1, X2, Y2, distancia;
         System.out.println("Digite o valor de X do Ponto 1:");
         X1 = sc.nextDouble();
         System.out.println("Digite o valor de Y do Ponto 1:");
         Y1 = sc.nextDouble();
         System.out.println("Digite o valor de X do Ponto 2:");
         X2 = sc.nextDouble();
         System.out.println("Digite o valor de Y do Ponto 2:");
         Y2 = sc.nextDouble();

         distancia = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));

         System.out.printf("A distancia sobre os pontos 1 e 2 é de: %.4f", distancia);

        sc.close();
    }

}
