package Unidade5;

import java.util.Scanner;

public class Uni5Exe21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double chico = 1.50, ze = 1.20;
        int anos = 0;

        while (ze <= chico){
            ze = ze + 0.03;
            chico = chico + 0.02;
            anos++;

        }

        System.out.println("Serão nescessarios "+ anos + " anos para que zé seja maior que chico");

        sc.close();
    }

}
