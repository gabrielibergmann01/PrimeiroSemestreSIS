package Unidade4;

import java.util.Scanner;

//Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
public interface Uni4Exe08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        char letra = sc.next().toLowerCase().charAt(0);
        boolean vogal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
        if (vogal) {
            System.out.println("A letra é uma vogal");
        }else {
            System.out.println("Não é uma vogal");
        }

        sc.close();
    }

}
