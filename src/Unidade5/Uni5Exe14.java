package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome;
        double precoCompra, precoVenda, percentualLucro, lucro;
        double totalC = 0, totalV = 0;
        int cont10 = 0, cont10a20 = 0, cont25 = 0;

        for(int i = 1; i <= 20; i++){

            System.out.println("Digite o nome da mercadoria:");
            nome = sc.nextLine();
            System.out.println("Digite o preco de compra:");
            precoCompra = sc.nextDouble();
            System.out.println("Digite o preco de venda:");
            precoVenda = sc.nextDouble();

            percentualLucro = ((precoCompra - precoVenda)/ precoCompra) * 100;

            if (percentualLucro < 10){
                cont10++;
            }
            if (percentualLucro <= 20){
                cont10a20++;
            }
            if (percentualLucro > 20){
                cont25++;
            }

            totalC += precoCompra;
            totalV += precoVenda;

        }

        lucro = totalC - totalV;

        System.out.println("Menor que 10%: "+cont10);
        System.out.println("Entre 10% e 20%: "+cont10a20);
        System.out.println("Maior que 20%: "+cont25);

        System.out.println("Lucro ao total: "+ lucro);
        System.out.println("Lucro de compra: "+ totalC);
        System.out.println("Lucro de venda: "+ totalV);


        sc.close();

    }

}
