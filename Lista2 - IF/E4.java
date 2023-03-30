import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hi, hf;

        System.out.print("Hora inicial: ");
        hi = sc.nextInt();

        System.out.print("Hora final: ");
        hf = sc.nextInt();

        if(hi == hf){
            System.out.println("Jogo durou 24h");
        }else if(hi > hf){
            int aux = 24 - (hi-hf);
            System.out.println("Jogo durou "+aux+"h");
        }else{
            System.out.println("Jogo durou "+(hf-hi)+"h ");
        }

        sc.close();
    }
}
