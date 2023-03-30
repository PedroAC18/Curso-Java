import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qtd de numeros: ");
        int qtd = sc.nextInt();

        double vet[] = new double[qtd];

        for(int i=0; i<qtd; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double soma = 0;
        System.out.println("Valores do vetor: ");
        for(int cont=0; cont<qtd; cont++){
            System.out.print(vet[cont]+" ");
            soma += vet[cont];
        }
        System.out.println();
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+soma/qtd);
    }
}
