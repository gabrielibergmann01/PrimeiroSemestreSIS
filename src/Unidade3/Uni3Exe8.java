package Unidade3;

import java.util.Scanner;

//Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em 
// dólares para o atendente. Considerando que o atendente tem a cotação do dólar, descreva um programa 
// para calcular quantos reais o atendente deve devolver para a pessoa.
public class Uni3Exe8 {

    float valorDolares;

    public Uni3Exe8(float valorDolares){
        this.valorDolares = valorDolares;
    }

    public float trocando(){
        return valorDolares * 5.20f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos dolares vc quer trocar?");
        float valorDolares = sc.nextFloat();

        Uni3Exe8 construtor = new Uni3Exe8(valorDolares);

        System.out.printf("o valor é de: %.2f"+construtor.trocando());

        sc.close();
    }

}
