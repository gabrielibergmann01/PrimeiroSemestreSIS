package Unidade4;

import java.util.Scanner;

public class Familia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeMariaAlice;
        int idadeMariaFlor;
        int idadeJoseLeo;

        System.out.println("Digite a idade da Maria Alice:");
        idadeMariaAlice = sc.nextInt();
        System.out.println("Digite a idade da Maria Flor:");
        idadeMariaFlor = sc.nextInt();
        System.out.println("Digite aq idade do Jose leonardo:");
        idadeJoseLeo = sc.nextInt();

        if (idadeMariaAlice < idadeMariaFlor && idadeMariaAlice < idadeJoseLeo){
            System.out.println("A Maria Alice é a caçula");
        }else if (idadeMariaFlor < idadeMariaAlice && idadeMariaFlor < idadeJoseLeo){
            System.out.println("A Maris Flor é a caçula");
        }else {
            System.out.println("O José Leonardo é o caçula");
        }

        sc.close();

    }
}
