package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 0;
        int totalManha, totalTarde, maiorProducao = 0, periodoMaiorProducao = 0, diaMaior = 0, maiorPeriodo = 0;
        float totalPecasDia = 0, valorRecbido = 0;
        String periodo = "";

        int resposta = 1;

        while (resposta == 1) {

            System.out.println("Digite o dia do mês de Abril:");
            dia = sc.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.println("Dia Invalido");

                System.out.println("Digite o dia do mês de Abril:");
                dia = sc.nextInt();
            }

            System.out.println("Quantas peças vc produziu no turno da manhã:");
            totalManha = sc.nextInt();
            System.out.println("Quantas peças vc produziu no turno da tarde:");
            totalTarde = sc.nextInt();

            totalPecasDia = totalManha + totalTarde;

            if (dia >= 1 && dia <= 15) {
                if (totalPecasDia > 100 && totalManha >= 30 && totalTarde >= 30) {
                    valorRecbido = totalPecasDia * 0.80f;
                } else {
                    valorRecbido = totalPecasDia * 0.50f;
                }
            } else {
                valorRecbido = (totalManha * 0.40f) + (totalTarde * 0.30f);
            }

            if (totalPecasDia > maiorProducao) {
                maiorProducao = (int) totalPecasDia;
                diaMaior = dia;
            }

            if (totalManha > periodoMaiorProducao){
                maiorPeriodo = totalManha;
                periodo = "Manhã";
            }
            if (totalTarde > periodoMaiorProducao) {
                maiorPeriodo = totalTarde;
                periodo = "Tarde";
            }
            
            System.out.println("Dia: "+ dia);
            System.out.println("Manhã: "+totalManha);
            System.out.println("Tarde: "+totalTarde);
            System.out.println("Valor recebido: "+ valorRecbido);

            System.out.println("Novo funcionario? (1.Sim/2.Não)");
            resposta = sc.nextInt();
            if (resposta == 2) {
                break;
            }

        }
            System.out.println("Dia da maior produção: " + diaMaior);
            System.out.println("Período de maior prodrução: " + periodo+"-"+maiorPeriodo);
        sc.close();
    }

}
