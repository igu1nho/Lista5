package br.inatel.cdg;

public class Funcionario {

    private int idF;
    private double salario;
    private int numF;

    public int getIdF() {
        return idF;
    }

    public void setIdF(int idF) {
        this.idF = idF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumF() {
        return numF;
    }

    public void setNumF(int numF) {
        this.numF = numF;
    }

    public Funcionario(int idF, int numF, double salario)
    {
        this.idF = idF;
        this.salario = salario;
        this.numF = numF;
    }
}
