package Unidade6;

import java.util.Scanner;

public class Uni6EXe02 {

    private Scanner sc = new Scanner(System.in);
    private double[] valores = new double[12];
    private double media =0;

    public Uni6EXe02(){

    }

    public void lerValores(){
        for (int i = 0; i < 12; i++){
            System.out.println("Digite um número real:");
            valores[i] = sc.nextDouble();
        }
    }

    public void CalcularMedia(){
        double soma = 0;
        for (int i = 0; i < 12; i++){
            soma += valores[i];
        }
        media = soma / 12;
    }

    public void listaMaioresValores(){
        for (int i = 0; i < 12; i++){
            if (valores[i] >= media){
                System.out.println("O valor "+ valores[i] + " é maior que a média "+ media);
            }
        }
    }

    public static void main(String[] args) {
        Uni6EXe02 uni6eXe02 = new Uni6EXe02();
        uni6eXe02.lerValores();
        uni6eXe02.CalcularMedia();
        uni6eXe02.listaMaioresValores();

    }

}
