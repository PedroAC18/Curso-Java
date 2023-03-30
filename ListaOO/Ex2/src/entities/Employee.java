package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return (grossSalary - tax);
    }

    public void increaseSalary(double percentage){
        double auxPerc = percentage / 100;
        double auxSal = (grossSalary-tax) +  grossSalary * auxPerc;
        System.out.println("New salary: " + auxSal);
    }

}
