package entitie;

public class bank {

    private int num_conta;
    private String nome;
    private double saldo;


    public bank(int num_conta, String nome, double saldo){
        this.num_conta = num_conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public bank(int num_conta, String nome){
        this.num_conta = num_conta;
        this.nome = nome;
        this.saldo = 0.0;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito){
        this.saldo += deposito;
    }

    public void saque(double saque){
        this.saldo -= saque + 5.0;
    }

    public String toString(){
        return "Dados da conta: \n" +
                "Numero da conta: " + this.num_conta +
                "\nTitular: "+ this.nome+
                "\nSaldo: " + this.saldo;

    }
}
