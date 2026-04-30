package Unidade3;

import java.util.Scanner;

public class Uni3Exe2 {
    float valor;
    float desconto;
    //construtor
    public Uni3Exe2(float valor, float desconto){
        this.desconto = desconto;
        this.valor = valor;
    }

    public float totalDoDesconto(){
        //retorna quanto em dinheiro vai ser o desconto
        return this.valor * (this.desconto/100);
    }

    public float valorTotal(){
        //retorna o valor total com o desconto
        return this.valor - this.totalDoDesconto();
    }

    public static void main(String[] args) {
        float valor;
        float desconto =12.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do calçado:");
        valor = sc.nextFloat();
        
        Uni3Exe2 construtor = new Uni3Exe2(valor, desconto);
        System.out.println("O valor do desconto é de R$"+ construtor.totalDoDesconto());
        System.out.println("O preço dos calçados com o desconto é de R$"+ construtor.valorTotal());
        sc.close();
    }
}
