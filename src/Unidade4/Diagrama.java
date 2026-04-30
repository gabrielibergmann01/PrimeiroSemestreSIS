package Unidade4;

import java.util.Scanner;

public class Diagrama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade");

        } else if (idade > 6)
            {
            System.out.println("Você é adolescente");
            }
            else
            {
                System.out.println("Você é criança");
            }

        sc.close();
    }

}
