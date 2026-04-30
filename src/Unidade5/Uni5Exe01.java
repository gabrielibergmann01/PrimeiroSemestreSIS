package Unidade5;

import java.util.Scanner;

public class Uni5Exe01 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= 20; i++){
            System.out.println("Digite um número: "+i);
            int num = sc.nextInt();
            if (num % 2 == 0){
                System.out.println("O número é par: "+num);
            } else {
                System.out.println("O número é impar: "+num);
            }
        }
        sc.close();
    }

}
