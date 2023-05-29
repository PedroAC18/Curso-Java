import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> cursoA = new HashSet<>();
        Set<Integer> cursoB = new HashSet<>();
        Set<Integer> cursoC = new HashSet<>();


        System.out.println("Quantidade alunos A: ");
        int n = sc.nextInt();
        for(int cont = 0; cont<n;cont++){
            System.out.println("Código aluno");
            int codA = sc.nextInt();
            cursoA.add(codA);
        }

        System.out.println("Quantidade alunos B: ");
        n = sc.nextInt();
        for(int cont = 0; cont<n;cont++){
            System.out.println("Código aluno");
            int codB = sc.nextInt();
            cursoB.add(codB);
        }

        System.out.println("Quantidade alunos C: ");
        n = sc.nextInt();
        for(int cont = 0; cont<n;cont++){
            System.out.println("Código aluno");
            int codC = sc.nextInt();
            cursoC.add(codC);
        }

        Set<Integer> totalAlunos = new HashSet<>(cursoA);
        totalAlunos.addAll(cursoB);
        totalAlunos.addAll(cursoC);
        System.out.println("Total alunos: "+totalAlunos.size());

        sc.close();

    }
}
