public class App {
    public static void main(String[] args) throws Exception {
        float media ;
        
        float nota1 = 3;
        float nota2 = 5;
        media = (nota1 + nota2)/2;
        boolean provaSuficiencia = true;

        if (media >= 6 || provaSuficiencia){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
