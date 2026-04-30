package Unidade4;
//Escreva um algoritmo para ler a idade de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS,
//GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, 
// e apenas irmãos se todas as idades forem diferentes.

import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do primeiro irmão:");
        int irmao1 = sc.nextInt();
        System.out.println("Digite a idade do segundo irmão:");
        int irmao2 = sc.nextInt();
        System.out.println("Digite a idade do terceiro irmão:");
        int irmao3 = sc.nextInt();

        if (irmao1 == irmao2 && irmao1 == irmao3){
            System.out.println("Trigemêos");
        } else if (irmao1 == irmao2 || irmao2 == irmao3 || irmao3 == irmao1){
            System.out.println("Gemêos");
        } else {
            System.out.println("Apenas irmãos");
        }

        sc.close();
    }

}
/*[INÍCIO]
   ↓
[Entrada: irmao1]
   ↓
[Entrada: irmao2]
   ↓
[Entrada: irmao3]
   ↓
      ┌──────────────────────────────┐
      │ i1 == i2 E i1 == i3 ?        │
      └──────────────────────────────┘
           ↓             ↓
         SIM            NÃO
          ↓              ↓
 [Saída: Trigêmeos]   ┌──────────────────────────────┐
                      │ i1==i2 OU i2==i3 OU i3==i1 ? │
                      └──────────────────────────────┘
                           ↓             ↓
                         SIM            NÃO
                          ↓              ↓
                [Saída: Gêmeos]   [Saída: Apenas irmãos]
                          ↓
                        [FIM] */