import java.util.Scanner;

public class soma2Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int vetA[] = new int[n];
        int vetB[] = new int[n];
        int vetC[] = new int[n];

        System.out.println("Valores vetor 1");
        for(int i=0; i<n;i++){
            vetA[i] = sc.nextInt();
        }

        System.out.println("Valores vetor 2");
        for(int i=0; i<n;i++){
            vetB[i] = sc.nextInt();
        }

        for(int i=0; i<n;i++){
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("Valores vetor final");
        for(int i=0; i<n;i++){
            System.out.println(vetC[i]);
        }
    }

}
