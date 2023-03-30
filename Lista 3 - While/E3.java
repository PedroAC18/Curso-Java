import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alc = 0, gas= 0, di = 0;
        int cod;

        cod = sc.nextInt();
        while(cod != 4){
            if(cod == 1){
                alc++;

            } else if (cod == 2) {
                gas++;

            }else{
                di++;
            }
            cod = sc.nextInt();
        }

        System.out.println(alc);
        System.out.println(gas);
        System.out.println(di);
        sc.close();
    }
}
