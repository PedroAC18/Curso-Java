import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = 0;
        num = sc.nextDouble();
        if(num > 0.0){
            System.out.println("Número Positivo");
        }else{
            System.out.println("Número negativo");
        }

        sc.close();

    }
}
