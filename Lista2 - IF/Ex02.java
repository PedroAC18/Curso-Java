import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
