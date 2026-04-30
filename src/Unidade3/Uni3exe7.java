package Unidade3;

import java.util.Scanner;

//Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, 
// garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, 
// faça um programa para calcular quantos litros de refrigerante ele comprou.
public class Uni3exe7 {

    float quantLata;
    float quantGarrafa;
    float quantGarrafaPet;

    public Uni3exe7(float quantLata, float quantGarrafa, float quantGarrafaPet){
       
        this.quantGarrafa = quantGarrafa;
        this.quantGarrafaPet = quantGarrafaPet;
        this.quantLata = quantLata;
    }

    public float  valorLitros(){
        return (this.quantGarrafa * 600) + (this.quantGarrafaPet * 2000)+ (this.quantLata * 350);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float quantLata;
        float quantGarrafa;
        float quantGarrafaPet;

        System.out.println("Digite quantas latas de 350ml você vai comprar:");
        quantLata = sc.nextFloat();
        System.out.println("Digite quantas garrafas de 600ml você vai comprar:");
        quantGarrafa = sc.nextFloat();
        System.out.println("Digite quantas garrafas de 2l você vai comprar:");
        quantGarrafaPet = sc.nextFloat();

        Uni3exe7 construtor = new Uni3exe7(quantLata, quantGarrafa, quantGarrafaPet);

        System.out.println("Você comprou "+construtor.valorLitros()+"l ");

        sc.close();
    }

}
