package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome;
        double precoCompra, precoVenda, percentualLucro;
        int cont10, cont20, cont15, cont25;
        int contPV = 0, contPC = 0;
        for(int i = 1; i <= 20; i++){

            System.out.println("Digite o nome da mercadoria:");
            nome = sc.nextLine();
            System.out.println("Digite o preco de compra:");
            precoCompra = sc.nextDouble();
            contPC++;
            System.out.println("Digite o preco de venda:");
            precoVenda = sc.nextDouble();
            contPV++;

            percentualLucro = ((precoCompra - precoVenda)/ precoCompra) * 100;

            if (percentualLucro < 10){

            }

        }

        sc.close();

    }

}
