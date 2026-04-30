package Unidade4;
//Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
// Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; 
// suponha que não haja empates.

import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade da luluzinha:");
        int luluzinha = sc.nextInt();
        System.out.println("Digite a idade do zezinho:");
        int zezinho = sc.nextInt();
        System.out.println("Digite a idade do Marquinhos:");
        int marquinhos = sc.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha){
            System.out.println("Marquinhos é o caçula da família");
        } else if (zezinho < marquinhos && zezinho < luluzinha){
            System.out.println("Zezinho é o caçula da família");
        }else {
            System.out.println("Luluzinha é a caçula da família");
        }

        sc.close();
    }
}
