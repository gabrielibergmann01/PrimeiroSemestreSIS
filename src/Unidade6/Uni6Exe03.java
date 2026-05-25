package Unidade6;

public class Uni6Exe03 {
    private double[] valores = new double[12];

    public Uni6Exe03() {

    }

    public void lerValores() {
        System.out.println("Digite 12 numeros: ");
        for (int i = 0; i < valores[12]; i++) {
            System.out.println("Número " + i + ":");
        }
    }

    public void modificarValores() {
        for (int i = 0; i < 12; i++){
            if (i % 2 == 0){
                valores[i] = valores[i] + (valores[i] * 0.02);
                
            }else {
                valores[i] = valores[i] + (valores[i] * 0.05);
            }
        }
    }

    public void imprimirResultado(){
        for (int i = 0; i < 12; i++){
            System.out.println("Posição "+ i + " valor: "+ valores[i]);
        }
    }

    public static void main(String[] args) {
        Uni6Exe03 uni6Exe03 = new Uni6Exe03();
        uni6Exe03.lerValores();
        uni6Exe03.modificarValores();
        uni6Exe03.imprimirResultado();
    }

}
