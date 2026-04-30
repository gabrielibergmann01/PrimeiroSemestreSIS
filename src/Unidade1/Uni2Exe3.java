package Unidade1;

import java.util.Scanner;
//Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
public class Uni2Exe3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double raio;

        System.out.println("Digite o valor do raio:");
        raio = sc.nextDouble();
        

        double area = (Math.pow(raio, 2) * Math.PI);

        System.out.println("A area de circunferecia é:" + area);
        sc.close();
    }

}
