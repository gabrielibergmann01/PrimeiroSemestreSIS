package Unidade4;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2;
        char operador;

        System.out.println("Digite o numero 1");
        num1 = sc.nextFloat();
        System.out.println("Digite o numero 2");
        num2 = sc.nextFloat();
        System.out.println("Digite o operador:\n"+
        "+para somar\n"+
        "- para subtrair\n"+
        "* para multipplicar\n"+
        "/ para dividir\n"+
        "% para resto da divisão\n"
        );
        operador = sc.next().charAt(0);

        if (operador == '+'){

            somar(num1, num2);

        }else if (operador == '-'){
            diminuir(num1, num2);

        }else if (operador == '*'){
            multiplicar(num1, num2);

        }else if(operador == '/'){
            dividir(num1, num2);

        }else if(operador == '%'){
            resto(num1, num2);

        }else{
            System.out.println("Operador invalido");
        }

        

        sc.close();
    }

    private static void resto(float num1, float num2) {
        System.out.println("O resto é:" + (num1 % num2));

    }

    private static void dividir(float num1, float num2) {
                System.out.println("A divisão é:" + (num1 / num2));
    }

    private static void multiplicar(float num1, float num2) {
                System.out.println("A multiplicação é:" + (num1 * num2));
    }

    private static void diminuir(float num1, float num2) {
               System.out.println("A subtração é:" +( num1 - num2));
    }

    private static void somar(float num1, float num2) {
               System.out.println("A soma é:" + (num1 + num2));
    }

}
