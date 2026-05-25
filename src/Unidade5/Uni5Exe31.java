package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int divisor = 2;

        while (num > 1) {
            
            if (num % divisor == 0){
                System.out.println(num+"   "+divisor);
                num = num / divisor;
            }else {
                divisor++;
            }

        }

        sc.close();
    }

}
