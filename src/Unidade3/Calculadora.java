package Unidade3;

public class Calculadora {

    int numero1, numero2, resultado;

    
    public Calculadora(){
        numero1 = 5;
        numero2 = 7;
        resultado = somar();
        System.out.println("Resultado: "+ resultado);

        numero1 = 4;
        numero2 = 5;
        resultado = somar();
        System.out.println("Resultado: "+ resultado);

        resultado = somaDoisValores(numero1, numero2);
        System.out.println(resultado);

        somaValores();
        System.out.println(resultado);
    }

    public int somar(){
        return numero1 + numero2;

    }

    public void somaValores(){
        resultado = numero1 + numero2;
    }

    public int somaDoisValores(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
