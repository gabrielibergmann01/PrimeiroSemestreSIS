package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diaria = 50.0f, valorHospedagem = 0; 
        String nome;
        int op, contaEncerradas = 0,nHospedagem;
        do {

            System.out.println("MENU");
            System.out.println("1 - Encerrar hospedagem");
            System.out.println("2 - Quantidade de hospedagens encerradas");
            System.out.println("3 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    nome = sc.next();
                    System.out.println("Quantos dias vc se hospedou?");
                    nHospedagem = sc.nextInt();

                    if (nHospedagem < 15){
                        valorHospedagem = (diaria * nHospedagem) + (nHospedagem * 7.50f);
                    }else if (nHospedagem == 15){
                        valorHospedagem = (diaria * nHospedagem) + (nHospedagem * 6.50f);
                    }else if (nHospedagem > 15){
                        valorHospedagem = (diaria * nHospedagem) + (nHospedagem * 5.00f);
                    }

                    contaEncerradas++;

                    System.out.println(nome);
                    System.out.println("Total á pagar: "+ valorHospedagem);

                    break;
                case 2:
                    System.out.println("Contas Encerradas: "+ contaEncerradas);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            
        } while (op != 3);
        
        sc.close();
    }

}
