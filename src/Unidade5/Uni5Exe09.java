package Unidade5;

import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomes18 = "";
        int cont = 0;

        System.out.println("Quantos alunos quer adicionar:");
        int alunos =  Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= alunos; i++) {

            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();

            System.out.println("Digite a idade do aluno:");
            int idade = Integer.parseInt(sc.nextLine());

            if (idade == 18) {
                nomes18 = nomes18 + nome + "  ";
            }

            if (idade > 20) {
                cont++;
            }

        }

        System.out.println("Lista de nomes que tem 18 anos: " + nomes18);
        System.out.println("Quantidade de nomes com idade acima de 20 anos: " + cont);

        sc.close();
    }

}
