package Unidade5;

public class Uni5Exe11 {

    public static void main(String[] args) {
        
        int biscoito = 1;
        
        for(int i = 1; i <= 16; i++){
            if(i == 1){
                biscoito += 1;
            }else if(i == 2){
                biscoito = biscoito + 3;
            }else {
                biscoito = biscoito * 3;
            }

        }

       System.out.println("Total de Biscoitos quebrados: "+ biscoito);

    }

}
