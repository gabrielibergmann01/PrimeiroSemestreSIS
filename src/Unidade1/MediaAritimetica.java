package Unidade1;

import java.util.Scanner;

public class MediaAritimetica {

    public static void main(String[] args) {
        
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        float media = 0;

        Scanner usuario = new Scanner(System.in); 
        /*sempre abrir o scanner para imprimir a resposta do usuario para o pc */

        System.out.println("Digite sua primeira nota:");
        nota1 = usuario.nextFloat();
        System.out.println("Digite sua segunda nota:");
        nota2 = usuario.nextFloat();
        System.out.println("Digite sua terceira nota:");
        nota3 = usuario.nextFloat();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println("Sua média é:"+media);
        usuario.close();

    }

}
