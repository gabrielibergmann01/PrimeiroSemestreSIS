package Unidade4;

import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 3 valores:");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        
        int menor = 0, medio = 0, maior = 0;

        if(valor1 <= valor2 && valor1 <= valor3){
           menor = valor1;
           if (valor2 <= valor3){
            medio = valor2;
            maior = valor3;
           }else {
            medio = valor3;
            maior = valor2;
           }
        }else if (valor2 <= valor1 && valor2 <= valor3){
            menor = valor2;
            if (valor1 <= valor3){
                medio = valor1;
                maior = valor3;
            }else {
                medio = valor3;
                maior = valor1;
            }
           }else if (valor3 <= valor1 && valor3 <= valor2){
            menor = valor3;
            if(valor1 <= valor2){
                medio = valor1;
                maior = valor2;
            }else {
                medio = valor2;
                maior = valor1;
            }
           }

           System.out.println("Selecione uma das opções para:\n"+
            "1 - Crescente\n"+
            "2 - Decrescente\n"+
            "3 - O maior no meio"
           );
           int opcao = sc.nextInt();

           switch (opcao) {
            case 1:
                System.out.println(menor+" "+ medio+" "+maior);
                break;
            case 2:
                System.out.println(maior +" "+medio+" "+ menor);
                break;
            case 3:
                System.out.println(medio+" "+maior+" "+menor);
                break;
           
            default:
                System.out.println("Opção invalida");
                break;
           }


        sc.close();
    }

}
