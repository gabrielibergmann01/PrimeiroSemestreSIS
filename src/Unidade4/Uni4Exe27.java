package Unidade4;

import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de chegada:");
        int hrChegada = sc.nextInt();
        System.out.println("Digite os minutos de chegada");
        int minChegada = sc.nextInt();
        System.out.println("Digite a hora de saida:");
        int hrSaida = sc.nextInt();
        System.out.println("Digite os minutos de saida:");
        int minSaida = sc.nextInt();

        int chegada = hrChegada * 60 + minChegada;
        int saida = hrSaida * 60 + minSaida;

        int tempo = saida - chegada;

        int horas = tempo / 60;
        int minutos = tempo % 60;

        if (horas == 0){
            horas = 1;
        }else if (minutos >= 30){
            horas++;
        }

        double preco = 0;

        switch (horas) {
            case 1:
            case 2:
                preco = horas * 5;
                System.out.println("Valor a pagar:"+preco);
                break;
            case 3:
            case 4:
                preco = (2 * 5) + (horas - 2) * 7.5;
                System.out.println("Valor a pagar: "+preco);
                break;
            case 5:
                preco = (2 * 5) + (2 * 7.5) + (horas - 4) * 10;
                System.out.println("Valor a pagar: "+ preco);
                break;
            default:
                System.out.println("Horas invalidas");
                break;
        }

        sc.close();
    }

}
