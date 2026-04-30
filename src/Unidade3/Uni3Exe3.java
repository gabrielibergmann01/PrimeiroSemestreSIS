package Unidade3;

import java.util.Scanner;

//Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina 
//e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
public class Uni3Exe3 {

    private float precoGasosa, valorPagamento;
    
    public Uni3Exe3  (float precoGasosa, float valorPagamento){
        this.precoGasosa  = precoGasosa;
        this.valorPagamento = valorPagamento;
    }

    public float totalLitros(){
       return  this.valorPagamento / this.precoGasosa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precoGasosa, valorPagamento;
        
        System.out.println("Digite o valor da gasolina: ");
        precoGasosa = sc.nextFloat();
        System.out.println("Digite o valor do pagamento(com virgula): ");
        valorPagamento = sc.nextFloat();

        Uni3Exe3 construtor = new Uni3Exe3(precoGasosa, valorPagamento);

        System.out.println("Foram colocados "+ construtor.totalLitros()+ "de gasolina");

        sc.close();
    }
}
