package entitie;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentoSalario(double porcentagem){
        salario += salario * porcentagem/100;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.nome + ", " + this.salario;
    }
}
