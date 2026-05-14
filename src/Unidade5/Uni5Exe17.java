package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroInscricao = -1;
        int numeroInscricaoMaisAlto = 0;
        double altura = 0;
        double alturaMaisAlto = Double.MIN_VALUE;
        int numeroInscricaoMaisBaixo = 0;
        double alturMaisBaixo = Double.MAX_VALUE;
        double alturaTotalGrupo = 0;
        int totalInscricao = 0;

        while (numeroInscricao != 0) {
            System.out.println("Número da Inscrição:");
            numeroInscricao = sc.nextInt();
            if(numeroInscricao == 0){
                break;
            }
            System.out.println("Altura:");
            altura = sc.nextDouble();

            if (altura > alturaMaisAlto){
                alturaMaisAlto = altura;
                numeroInscricaoMaisAlto = numeroInscricao;
            }
            if (altura < alturMaisBaixo){
                alturMaisBaixo = altura;
                numeroInscricaoMaisBaixo = numeroInscricao;
            }

            alturaTotalGrupo += altura;
            totalInscricao++;
        }

        System.out.println("O atleta mais baixo tem "+ alturMaisBaixo+" e o seu número de inscrição é "+numeroInscricaoMaisBaixo);
        System.out.println("O atleta mais alto tem "+ alturaMaisAlto+" e o seu número de inscrição é "+numeroInscricaoMaisAlto);
        System.out.println("A altura média do grupo de atletas é: "+ (alturaTotalGrupo / totalInscricao));

        sc.close();

    }

}
