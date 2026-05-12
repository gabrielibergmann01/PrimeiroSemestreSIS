package Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double combustivel, quilometragem, media;
        double km = 0, litro = 0, mediaTotal = 0;

        System.out.println("Quantas paradas vc fez?");
        int paradas = sc.nextInt();

        for(int i = 1; i <= paradas; i++){

            System.out.println("Parada "+ i);
            System.out.println("Quilometragem:");
            quilometragem = sc.nextDouble();
            System.out.println("Combustivel:");
            combustivel = sc.nextDouble();

            media = quilometragem / combustivel;

            System.out.println("Média por litro: "+ media);

            km += quilometragem;
            litro += combustivel;
            
            mediaTotal =  km / litro;

           

        }

        System.out.println("Quilometragem média: "+ mediaTotal);
        

        sc.close();

    }

}
