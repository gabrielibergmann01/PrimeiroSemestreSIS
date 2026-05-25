package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta = "s";
        int umDeNos =0, cpm22 = 0, skank =0, jotaQuest =0, opcao, maiorVotos= 0, totalVotos = 0; 
        double pUmDeNos, pCPM22, pSkank, pJotaQuest;

        while (resposta.equalsIgnoreCase("s")) {
            System.out.println("Selecione em qual rádio deseja votar: \n"+
                "1 - Um de Nós\n"+
                "2 - CPM22\n"+
                "3 - Skank\n"+
                "4 - Jota Quest"
            );
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    umDeNos++;
                    totalVotos++;
                    break;
                case 2:
                    cpm22++;
                    totalVotos++;
                    break;
                case 3: 
                    skank++;
                    totalVotos++;
                    break;
                case 4:
                    jotaQuest++;
                    totalVotos++;
                    break;
                default:
                    System.out.println("Resposta Invalida");
                    break;
            }

            System.out.println("\nVotos: \n"+
                "Um De Nós: "+ umDeNos+"\n"+
                "CPM22: "+cpm22+"\n"+
                "Skank: "+skank+"\n"+
                "Jota Quest: "+jotaQuest+"\n"
            );

            if (umDeNos > maiorVotos){
                maiorVotos = umDeNos;
                System.out.println("A rádio com maior votos é: Um De Nós com "+maiorVotos+" votos\n");
            }else if (cpm22 > maiorVotos){
                maiorVotos = cpm22;
                System.out.println("A rádio com maior votos é: CPM22 com "+maiorVotos+" votos\n");
            }else if (skank > maiorVotos){
                maiorVotos = skank;
                System.out.println("A rádio com maior votos é: Skank com "+maiorVotos+" votos\n");
            }else {
                maiorVotos = jotaQuest;
                System.out.println("A rádio com maior votos é: Jota Quest com "+maiorVotos+" votos\n");
            }

            pUmDeNos = (umDeNos * 100) / totalVotos;
            pCPM22 = (cpm22 * 100) / totalVotos;
            pSkank = (skank * 100)/ totalVotos;
            pJotaQuest = (jotaQuest * 100) / totalVotos;

            System.out.println("Percentual dos votos: \n"+
                "Um De Nós: "+pUmDeNos+"\n"+
                "CPM22: "+pCPM22+"\n"+
                "Skank: "+pSkank+"\n"+
                "Jota Quest: "+pJotaQuest+"\n"
            );

            System.out.println("Mais um voto? (s (SIM)/ n (NÃO))");
            resposta = sc.next();
        }

        sc.close();
    }

}
