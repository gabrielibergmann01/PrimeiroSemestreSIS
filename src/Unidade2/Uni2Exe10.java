package Unidade2;

import java.util.Scanner;
//Leia um valor inteiro, que é o tempo de duração em segundos de um
//  determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundos, horas, minutos, resto;
        System.out.println("Digite o tempo em segundos:");
        segundos = sc.nextInt();

        horas = segundos / 3600;
        resto = segundos % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.printf("Tempo do evento: %d:%d:%d.",horas,minutos,segundos);

        sc.close();
    }
}
