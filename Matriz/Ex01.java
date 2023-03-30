import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Digite valor de n: ");
        int n = sc.nextInt();

        double[][] mat = new double[n][n];

        System.out.print("Digite valor da matriz:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Diagonal principal: ");
        for(int i=0; i< mat.length; i++){
           System.out.print(mat[i][i]+" ");

        }

        int neg = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] < 0){
                    neg++;
                }
            }
        }
        System.out.print("Qtd numeros negativos: "+neg);
    }
}
