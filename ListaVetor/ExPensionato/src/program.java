import entitie.Aluno;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdAlunos = sc.nextInt();
        Aluno quartos[] = new Aluno[10];


        for(int i = 0; i<qtdAlunos; i++){
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Num quarto: ");
            int numQuarto = sc.nextInt();
            quartos[numQuarto] = new Aluno(nome, email);
        }

        for(int i=0; i<10; i++){
            if(quartos[i] != null) {
                System.out.println("Quarto " + i +" "+ quartos[i]);
            }
        }
    }
}
