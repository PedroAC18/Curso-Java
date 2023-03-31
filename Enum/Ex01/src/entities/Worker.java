package entities;

import entities_enum.WorkerLevel;
import entities.HourContract;
import entities.Department;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }


    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int month, int year){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts){
            cal.setTime(c.getDate());//pega data do contrato e define como data do calendário
            int c_year  = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH); //mês começa em 0
            if(month == c_month && year == c_year){
                sum+= c.totalValue();
            }
        }
        return sum;
    }



}
