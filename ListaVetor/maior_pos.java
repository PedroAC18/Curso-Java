import java.util.Scanner;

public class maior_pos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("QTd numeros: ");
        int n = sc.nextInt();

        double vet[] = new double[n];
        for(int i =0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int pos =0;
        for(int i =0; i<n; i++){
            if(vet[i] > maior){
                maior = vet[i];
                pos = i;
            }
        }

        System.out.println("Maior numero: "+maior+" na posicao "+pos);
    }
}
