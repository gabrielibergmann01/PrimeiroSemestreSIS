package Unidade3;
//Descreva um programa que a partir da distância percorrida e o do tempo gasto por um motorista durante
// uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível gasto na viagem, 
// sabendo que o automóvel faz 12 km por litro.

import java.util.Scanner;

public class Uni3Exe14 {
    double km, tempoGasto;

    public Uni3Exe14 (double km, double tempoGasto){
        this.km = km;
        this.tempoGasto = tempoGasto;
    }

    public double velocidadeMedia(){
        return km / tempoGasto;
    }
    public double combustivel(){
        return km / 12;
    }

    public static void main(String[] args) {
        double km, tempoGasto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida:");
        km = sc.nextDouble();
        System.out.println("Digite o tempo gasto:");
        tempoGasto = sc.nextDouble();

        Uni3Exe14 construtor = new Uni3Exe14(km, tempoGasto);

        System.out.println("Velocidade média: "+ construtor.velocidadeMedia());
        System.out.println("Quantidade de combustivel gasto: "+construtor.combustivel());

        sc.close();
    }
}
