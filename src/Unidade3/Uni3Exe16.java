package Unidade3;

import java.util.Scanner;

//Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais. 
// Considerando que alguém está pagando uma compra, faça um programa que determine e escreva o 
// número mínimo de notas que o caixa deve fornecer como troco. Escreva também o número de cada tipo de nota 
// a ser fornecido como troco. Suponha que o sistema monetário não utilize centavos.
public class Uni3Exe16 {

    private int valorTotal;
    private int valorPago;

    public Uni3Exe16(int valorTotal, int valorPago){
        this.valorPago = valorPago;
        this.valorTotal = valorTotal;
    }

    public int troco(){
        return this.valorPago - this.valorTotal;
    }

    public int notasCem(){
        return troco() / 100;
    }
    public int notasDez(){
        return (troco() % 100) / 10;
    }
    public int notasUm(){
        return troco() % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorPago, valorTotal;

        System.out.println("Valor total da compra:");
        valorTotal = sc.nextInt();
        System.out.println("Valor total dado pelo cliente:");
        valorPago = sc.nextInt();

        Uni3Exe16 construtor = new Uni3Exe16(valorTotal, valorPago);

        int totalNotas = construtor.notasCem() + construtor.notasDez() + construtor.notasUm();

        System.out.println("O número mínimo de nostas de troco é: "+totalNotas);
        System.out.println("Quantidade de notas de 100 necessarias: "+ construtor.notasCem());
        System.out.println("Quantidade de notas de 10 necessarias: "+ construtor.notasDez());
        System.out.println("Quantidade de notas de 100 necessarias: "+ construtor.notasUm());


        sc.close();
    }

}
