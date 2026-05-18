package Unidade5;

import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String nome;
        char resposta = 's';

        while (resposta == 's'){
            System.out.println("digite o nome do vendedor:");
            nome = sc.nextLine();
            sc.nextLine();
            System.out.println("Quantos produtos vendeu?");
            int quantProd = sc.nextInt();

            double totalVendas = 0;

            for (int i = 1; i <= quantProd; i++){
                System.out.println("Produto "+ i);
                System.out.println("Quantos vendeu?");
                double quantidade = sc.nextDouble();
                System.out.println("Qual valor do produto?");
                double preco = sc.nextDouble();

                totalVendas += (preco * quantidade);

            }

            double salario = totalVendas * 0.30;

            System.out.println("Funcionario: \n" + nome);
            System.out.println("Total de vendas: "+ totalVendas);
            System.out.println("Salário: "+ salario);

            System.out.println("Deseja digitar de outro funcionario? (n/s)");
            resposta = sc.next().charAt(0);

        }

        sc.close();

    }

}
