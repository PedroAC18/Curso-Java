import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas: ");
        int qtd = sc.nextInt();

        String nome[] = new String[qtd];
        int idade[] = new int[qtd];
        double altura[] = new double[qtd];

        double soma = 0;

        for(int i=0; i<qtd; i++){
            System.out.println("Dados da "+ i +" pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            soma += altura[i];
        }

        System.out.println("Altura media: "+soma/qtd);
        int mIdade = 0;
        System.out.println("Pessoas menores de 16 anos: ");
        for(int cont=0; cont<qtd;cont++){
            if(idade[cont] < 16){
                System.out.println(nome[cont]);
                mIdade++;
            }
        }
        double percMenor = ((double)mIdade/qtd) * 100;
        System.out.println("Porcentagem: "+percMenor);

    }
}
