package Unidade6;

import java.util.Scanner;

public class Uni6Exe09 {
    Scanner sc = new Scanner(System.in);
    private int[] sexo = new int[30];
    private int[] nota = new int[30];
    private int[] idade = new int[30];

    private void perguntas() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Feminino (1) ou Masculino (2)?");
            sexo[i] = sc.nextInt();
            System.out.println("uma nota para o cinema (zero até dez, valor inteiro)?");
            nota[i] = sc.nextInt();
            System.out.println("Sua idade? ");
            idade[i] = sc.nextInt();

        }
    }

    private int media(){
        int soma = 0;
        for (int i = 0; i < 30; i++){
            soma += nota[i];
        }
        int media = soma / 30;
        System.out.println("A média do cinema é: "+media);
        return media;
    }

    private void mediaHomens(){
        int soma = 0;
        int homens = 0;
        for (int i = 0; i < 30; i++){
            if (sexo[i] == 2){
                homens++;
                soma += nota[i];
            }else {
                System.out.println("Não é homem");
            }
           
        } int media = soma / homens;
            System.out.println("A média dos homens é: "+ media);
    }

    private void mediaMulheresNovas(){
        int soma = 0;
        int mulheres = 0;

        for (int i = 0; i < 30; i++){
            if (sexo[i] == 1 && idade[i] <= 25){
                soma += nota[i];
                mulheres++;
            }else {
                System.out.println("Não é mulher");
            }
        }
        int media = soma / mulheres;
        System.out.println("AQ média das mulheres novas é de: "+ media);
    }

    private void mediaMulheresVelhas(){
        int mulherVelhas = 0;
        for (int i = 0; i < 30; i++){
            if (sexo[i] == 1 && idade[i] >= 50){
              
                mulherVelhas++;
            }else {
                System.out.println("Não é mulher");
            }
        }
        System.out.println("Quantidade de mulheres acima de 50: "+mulherVelhas);
    }

    public Uni6Exe09() {

    }

    public static void main(String[] args) {
        Uni6Exe09 uni6Exe09 = new Uni6Exe09();

        uni6Exe09.perguntas();
        uni6Exe09.media();
        uni6Exe09.mediaHomens();
        uni6Exe09.mediaMulheresNovas();
        uni6Exe09.mediaMulheresVelhas();
    }

}
