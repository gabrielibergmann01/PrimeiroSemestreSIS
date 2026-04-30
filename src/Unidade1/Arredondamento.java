package Unidade1;
import java.text.DecimalFormat;

public class Arredondamento {

    public static void main(String[] args) {
        
        float num = 7.873254f;
        System.out.println("Nota"+ num);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Nota"+ df.format(num));
        
        //Ou
        System.out.printf("A nota é %.2f", num);
    }

}
