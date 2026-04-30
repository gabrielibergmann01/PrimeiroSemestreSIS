package Unidade2;

import java.util.Scanner;

public class Uni2Exe9 {
    //Uma pessoa foi até uma casa de câmbio trocar dólares por reais.
    //  Para isto ela entregou um valor em dólares para o atendente. 
    // Considerando que o atendente tem a cotação do dólar, 
    // calcule quantos reais o atendente deve devolver para a pessoa.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valordolares;
        
        System.out.println("Quantos dolares voce quer trocar:");
        valordolares = sc.nextFloat();

        float total = (valordolares * 5.20f);
        System.out.printf("Você recebera %.2f reais", total);

         sc.close();
    }

}
