package Unidade5;
//
public class Uni5Exe04 {

    public static void main(String[] args) {
        
        double soma = 0;

        for (int i = 1; i <=20; i++){
            soma += (2*i + 1.0) / (i * (i + 1)); 
        }

        System.out.println(soma);
    }

}
