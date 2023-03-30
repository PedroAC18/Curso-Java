import java.util.Scanner;


public class negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai digitar: ");
        int qtd = sc.nextInt();

        int vet[] = new int[qtd];

        for(int cont=0; cont<qtd; cont++){
            System.out.print("Digite um numero: ");
            vet[cont] = sc.nextInt();
        }

        System.out.println("Numeros negativos:");
        for(int i=0; i<qtd; i++){
            if(vet[i] < 0){
                System.out.println(vet[i]);
            }
        }

        sc.close();
    }
}
