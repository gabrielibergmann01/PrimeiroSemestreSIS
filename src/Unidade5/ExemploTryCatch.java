package Unidade5;

import java.util.Scanner;

public class ExemploTryCatch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;
        System.out.println("Digite um número:");

        try{
            num = sc.nextInt();
        }catch (Exception ex){
            System.out.println("Número Invalido");
            num = 0;
            ex.getMessage();
        }

        sc.close();

    }

}
