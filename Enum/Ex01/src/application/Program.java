package application;

import entities.HourContract;
import entities.Department;
import entities.Worker;
import  entities_enum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc =  new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite nome do setor: ");
        String dep = sc.nextLine();

        System.out.println("Digite dados do funcionario: ");

        System.out.print("Digite nome: ");
        String name = sc.nextLine();

        System.out.print("Digite nivel de experiencia: ");
        String exp = sc.nextLine();

        System.out.print("Digite salario base: ");
        double sal = sc.nextDouble();

        //Enum precisa usar .valueOf por ser enum e Department usa o "criador" dele
        Worker w = new Worker(name,  WorkerLevel.valueOf(exp), sal, new Department(dep));

        System.out.print("Digite qtd de contratos: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("Digite dados do contrato " + (i+1));
            System.out.print("Data (DD/MM/YYYY): ");
            Date data = sdf.parse(sc.next());
            System.out.print("Valor da hora: ");
            double val = sc.nextDouble();
            System.out.print("Duracao (horas): ");
            int h = sc.nextInt();
            HourContract contrato = new HourContract(data, val, h); //cria a entidade de contrato
            w.addContract(contrato);//adiciona o contrato ao funcionário
        }

        System.out.print("Digite mes e ano para calcular renda: (MM/YYYY)");
        String data2 = sc.next();
        int mes = Integer.parseInt(data2.substring(0,2));//pega os 2 primeiros digitos para se identificar o mês
        int ano = Integer.parseInt(data2.substring(3));//pega os digitos restantes pós /, que indica o ano
        double salTotal = w.income(mes, ano);
        System.out.println("Nome: " + w.getName());
        System.out.println("Departamento: " + w.getDepartment().getName());
        System.out.println("Salario do periodo de "+data2 +":" +salTotal);

    }

}
