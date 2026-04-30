package Unidade1;
import java.util.Scanner;
public class AreaDaSalaInformada {
    public static void main(String[] args) {
        float frente = 0;
        float lateral = 0;

        Scanner teclado = new Scanner(System.in);
        /* Scanner = ler respostas e interagir com o terminal */
        
        System.out.println("Digite a metragem da frente da sala:");
        frente = teclado.nextFloat();
        System.out.println("Digite a metragem da lateral:");
        lateral = teclado.nextFloat();

        float area = frente * lateral;

        System.out.println("A metragem da sala é: "+area +"m²");

        /*o objeto teclado tem q ser fechado: */
        teclado.close();
    }
}
