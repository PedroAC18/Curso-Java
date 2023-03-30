import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cod, qtd;
        double preco;

        cod = sc.nextInt();
        qtd = sc.nextInt();

        if(cod == 1){
            preco = qtd * 4.0;
        }else if(cod == 2){
            preco = qtd * 4.5;
        }else if(cod == 3){
            perco = qtd * 5.0;
        }

        sc.close();
    }
}
