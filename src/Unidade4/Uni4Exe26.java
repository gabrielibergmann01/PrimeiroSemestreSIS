package Unidade4;

import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n"+
            "T - Calcular a área de um triângulo de base b e altura h\n"+
            "Q - Calcular a área de um quadrado de lado l\n"+
            "R - Calcular a área de um retângulo de base b e altura h\n"+
            "C - Calcular a área de um círculo de raio r"
        );

        char opcao = sc.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digit a base e a altura do triangulo:");
                double base = sc.nextDouble();
                double altura = sc.nextDouble();
                double area = (base * altura)/2;
                System.out.println("A area do triangulo é: "+ area);
                break;
            case 'Q':
                System.out.println("Digite o lado do quadrado:");
                double lado = sc.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A area do quadrado é: "+ areaQuadrado);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retangulo:");
                base = sc.nextDouble();
                altura = sc.nextDouble();
                area = base * altura;
                System.out.println("A area do retangulo é: "+ area);
                break;
            case 'C':
                System.out.println("Digite o raio:");
                double raio = sc.nextDouble();
                area = Math.PI*Math.pow(raio, 2);
                System.out.println("A area do circulo é: "+ area);
                break;
        
            default:
                break;
        }

        sc.close();
    }

}
/*[INÍCIO]
   ↓
[Saída: mostrar menu]
   ↓
[Entrada: opcao]
   ↓
        ┌───────────────────────┐
        │ opcao == 'T' ?        │
        └───────────────────────┘
             ↓         ↓
           SIM        NÃO
            ↓          ↓
[Entrada: base, altura]  ┌───────────────────────┐
[Processo: área=b*h/2]   │ opcao == 'Q' ?        │
[Saída: área]            └───────────────────────┘
                             ↓         ↓
                           SIM        NÃO
                            ↓          ↓
                 [Entrada: lado]   ┌───────────────────────┐
                 [Processo: l*l]   │ opcao == 'R' ?        │
                 [Saída: área]     └───────────────────────┘
                                       ↓         ↓
                                     SIM        NÃO
                                      ↓          ↓
                         [Entrada: base, altura] ┌───────────────────────┐
                         [Processo: b*h]         │ opcao == 'C' ?        │
                         [Saída: área]           └───────────────────────┘
                                                      ↓         ↓
                                                    SIM        NÃO
                                                     ↓          ↓
                                            [Entrada: raio]   [FIM]
                                            [Processo: π*r²]
                                            [Saída: área]
                                                     ↓
                                                   [FIM] */