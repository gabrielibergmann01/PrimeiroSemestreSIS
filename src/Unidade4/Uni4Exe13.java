package Unidade4;
//Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas deste usuário 
//em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). 
//O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3),
//"SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). 
//Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c1, c2, c3;
        int contagem = 0;

        System.out.println("Digite sua primeira carta:");
        c1 = sc.nextInt();
        System.out.println("Digite sua segunda carta:");
        c2 = sc.nextInt();
        System.out.println("Digite sua terceira carta:");
        c3 = sc.nextInt();

        if (c1 == 1 || c1 == 2 || c1 == 3){
            contagem++;
            if (c2 ==  1 || c2 == 2 || c2 == 3){
                contagem++;
                if (c3 == 1 || c3 == 2 || c3 == 3){
                    contagem++;
                }
            }
        }

        if (contagem == 1){
            System.out.println("TRUCO");
        }else if (contagem == 2){
            System.out.println("SEIS");
        }else if (contagem == 3){
            System.out.println("NOVE");
        }else{
            System.out.println("Não fale truco ainda!");
        }

        sc.close();
    }

}
