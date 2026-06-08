package Unidade6;

import java.util.Scanner;

public class Uni6Exe05 {

    Scanner sc = new Scanner(System.in);
    private String[] perguntas = new String[] {
            "Gosta de música sertaneja?\r\n" +
                    "Gosta de futebol?\n" +
                    "Gosta de seriados?\n" +
                    "Gosta de redes sociais?\n" +
                    "Gosta da Oktoberfest?"
    };

    private String[] rapaz = new String[perguntas.length];
    private String[] moca = new String[perguntas.length];
    int afinidade = 0;

    public void respostaRapaz() {
        for (int i = 0; i >= perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Digite SIM, NAO ou IND:");
            rapaz[i] = sc.next();
        }
    }

    public void respostasMoca() {
        for (int i = 0; i >= perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Digite SIM, NAO ou IND:");
            moca[i] = sc.next();
        }
    }

    private void afinidade() {
        for (int i = 0; i < perguntas.length; i++) {
            if (rapaz[i].equalsIgnoreCase("Sim") && moca[i].equalsIgnoreCase("Sim")) {
                afinidade += 3;
            } else if (rapaz[i].equalsIgnoreCase("Nao") && moca[i].equalsIgnoreCase("Nao")) {
                afinidade += 3;
            } else if (rapaz[i].equalsIgnoreCase("Sim")
                    || rapaz[i].equalsIgnoreCase("Nao") && moca[i].equalsIgnoreCase("Ind")) {
                afinidade += 1;
            } else if (rapaz[i].equalsIgnoreCase("Ind") && moca[i].equalsIgnoreCase("Sim")
                    || moca[i].equalsIgnoreCase("Nao")) {
                afinidade += 1;
            } else if (rapaz[i].equalsIgnoreCase("Sim") && moca[i].equalsIgnoreCase("Nao")) {
                afinidade -= 2;
            } else if (rapaz[i].equalsIgnoreCase("Nao") && moca[i].equalsIgnoreCase("Sim")) {
                afinidade -= 2;
            } else if (rapaz[i].equalsIgnoreCase("Ind") && moca[i].equalsIgnoreCase("Ind")) {
                afinidade += 3;
            }
        }
    }

    public void mostraResultados() {
        if (afinidade >= 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10) {
            System.out.println("Vocês tem muita coisa em comum!");
        } else if (afinidade >= 5) {
            System.out.println("Talvez vocês não deem certo!");
        } else if (afinidade >= 0) {
            System.out.println("Vale um encontro");
        } else if (afinidade >= -9) {
            System.out.println("Melhor não perdem tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }

    public Uni6Exe05() {
    }

    public static void main(String[] args) {
        Uni6Exe05 uni6Exe05 = new Uni6Exe05();

        uni6Exe05.respostaRapaz();
        uni6Exe05.respostasMoca();
        uni6Exe05.afinidade();
        uni6Exe05.mostraResultados();
    }

}
