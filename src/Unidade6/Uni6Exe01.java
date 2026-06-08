package Unidade6;

import java.util.Scanner;

public class Uni6Exe01 {
    Scanner sc = new Scanner(System.in);
    private int tamanho = 10;
    private int[] numero = new int[tamanho];

    public void lerNumeros(){
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o número "+i+":");
            numero[i] = sc.nextInt();
        }
    }

    public void escreverNumeros(){
        for (int i = numero.length - 1; i >= 0; i--){
            System.out.println(numero[i]);
        }
    }
    
    public Uni6Exe01 (){
    }

    public static void main(String[] args) {
        Uni6Exe01 uni6Exe01 = new Uni6Exe01();
        
        uni6Exe01.lerNumeros();
        uni6Exe01.escreverNumeros();

    }

}
