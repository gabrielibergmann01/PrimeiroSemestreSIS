package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor o astolfo se nega a pagar?");
        double valorMax = sc.nextDouble();

        double distancia, valor = 0;
        int pedagios = 0, pedagioMaior = 0, distanciaMaior = 0;

        while (valor >= 0) {

            System.out.println("Digite o valor: (-1 para sair)");
            valor = sc.nextDouble();

            if(valor < 0){
                break;
            }else {
                pedagios++;
            }

            if (valor > valorMax) {
                pedagioMaior++;
            }
            System.out.println("Digite a distancia: (em KM)");
            distancia = sc.nextDouble();
            if (distancia > 150 && valor <= valorMax) {
                distanciaMaior++;
            }

        }
        System.out.println(pedagioMaior + " - trechos com valor acima do qual ele nega-se a pagar");
        System.out.println(distanciaMaior + " - trechos acima de 150km com valor aceito por ele");
        System.out.println(pedagios + " - Quantidade de trechos informados");
        sc.close();
    }

}
