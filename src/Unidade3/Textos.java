package Unidade3;

public class Textos {
    public static void main(String[] args) {
        ///Maiuscula///
        String texto = "Aula de Introdução";
        texto = texto.toUpperCase();
        System.out.println(texto);

        ///Minuscula///
        texto = texto.toLowerCase();
        System.out.println(texto);

        String texto1 = "BANANA";
        String texto2 = "banana";

        boolean verdade = false;
        verdade = (texto1.toUpperCase().equalsIgnoreCase( texto2.toUpperCase()));
        System.out.println(verdade);

        verdade = texto1.equalsIgnoreCase(texto2);
    }

}
