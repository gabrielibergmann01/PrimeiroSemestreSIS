package Unidade3;

import java.util.Scanner;

public class Uni3Exe01 {
    private int lagura, comprimento;

    public Uni3Exe01 (int largura, int comprimento){
        this.lagura = largura;
        this.comprimento = comprimento;
    }
    public int CalculaArea(){
        return this.lagura * this.comprimento;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largura, comprimento;

        System.out.println("Digite o valor da largura:");
        largura = sc.nextInt();
        System.out.println("Digite o valor do comprimento:");
        comprimento = sc.nextInt();

        Uni3Exe01 uni3Exe01 = new Uni3Exe01(largura, comprimento);
        int area = uni3Exe01.CalculaArea();
        System.out.println("A area é:" + area);
        sc.close();
    }


}
