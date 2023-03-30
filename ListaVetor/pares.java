import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qtd numero: ");
        int n = sc.nextInt();
        int vet[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite numero: ");
            vet[i] = sc.nextInt();
        }

        int qtd = 0;
        System.out.println("Numeros pares: ");
        for(int i=0; i<n; i++){
            if(vet[i]%2 == 0){
                System.out.println(vet[i]);
                qtd++;
            }
        }
        System.out.println("Qtd de pares: "+qtd);
    }
}
