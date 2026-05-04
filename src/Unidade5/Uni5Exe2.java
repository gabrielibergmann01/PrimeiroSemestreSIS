package Unidade5;

public class Uni5Exe2 {

    public static void main(String[] args) {

        int totalPar =0;
        int totalImpar = 0;
        
        for (int i= 0; i<=100; i++){
            if ( i % 2 == 0){
                totalPar+=i;
                
            }else {
                totalImpar+=i;
               
            }
        } 
        System.out.println("A soma dos números pares é: "+ totalPar);
        System.out.println("A soma dos números impares é: "+ totalImpar);

    }
        
}
