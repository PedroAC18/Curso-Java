package program;

import java.util.Scanner;
import entities.Student;

public class main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        Student st = new Student();

        System.out.print("Digite seu nome:");
        st.name = sc.nextLine();
        System.out.println("Digite suas 3 notas: ");
        st.n1 = sc.nextDouble();
        st.n2 = sc.nextDouble();
        st.n3 = sc.nextDouble();

        st.passou();
    }
}
