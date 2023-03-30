import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha;
        senha = sc.nextInt();
        while(senha != 2002){
            System.out.println("Senha incorreta!");
            senha = sc.nextInt();
        }
        System.out.println("Senha Correta");
    }
}
