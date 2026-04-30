package Unidade4;

import java.util.Scanner;

//O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. 
// O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas 
// e a altura está em metros, de acordo com a fórmula: massa / altura ao quadrado
public class Uni4Exe21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        float altura = sc.nextFloat();
        System.out.println("Digite sua massa corporal:");
        float massa = sc.nextFloat();

        float indice = massa / (altura*altura);

        if (indice < 18.5){
            System.out.println("Magreza TOTAL");
        }else if (indice > 18.5 && indice < 24.9){
            System.out.println("Saudavel");
        }else if (indice > 25.0 && indice < 29.9){
            System.out.println("Sobrepeso");
        }else if (indice > 30 && indice < 34.9){
            System.out.println("Obesidade GRAU I");
        }else if (indice > 35 && indice < 39.9){
            System.out.println("Obesidade GRAU II (severa)");
        }else if (indice >= 40){
            System.out.println("Obesidade GRAU III (morbida)");
        }else {
            System.out.println("Invalido");
        }

        sc.close();
    }

}
