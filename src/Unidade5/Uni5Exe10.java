package Unidade5;

public class Uni5Exe10 {

    public static void main(String[] args) {

        int soma =  0;
        String termo1 = "", termo2 = "";
        
        for (int i = 0; i <= 10000; i++) {
            for (int j = 0; j <= 10000; j++){

                //System.out.println( i + "+"+ j +"="+ (i+j));
                soma = i + j;
                termo1 = i+""+j;
                termo2 = ""+(int)Math.pow(soma, 2);

                if(termo1.equals(termo2)){
                    System.out.println(termo1 + " - "+termo2);
                }
            }
        }
      
    }

}
