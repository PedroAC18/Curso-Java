package entities;

public class Student {

    public String name;
    public double n1, n2, n3;

    public double notaFinal(){
        return n1 + n2 + n3;
    }

    public void passou(){
        if(notaFinal() < 60.0){
            System.out.println("Nao passou, faltaram " + (60 - notaFinal()) + " pontos");
        }else{
            System.out.println("Passou com nota: " + notaFinal());
        }
    }
}
