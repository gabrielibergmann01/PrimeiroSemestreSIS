package Unidade1;
import java.util.Scanner;

public class FuncoesDoMath {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //raiz quadrada
        double raiz = Math.sqrt(25);
        double num = 20;
        double raizDois = Math.sqrt(num);
        //elevar a potencia
        double numero1 = 2;
        double numero2 = 3;
        double potencia = Math.pow(numero1, numero2);
        //aredondar um numero
        double arredondado = Math.round(1.3);
        //Maior numero
        double maior = Math.max(10, 20);
        //qualuqer numero
        double aleatorio = Math.random();
        //valor de PI
        double pi = Math.PI; //3,14159
        //menor numero
        float menor = Math.min(10, 30);

        sc.close();
    }

}
