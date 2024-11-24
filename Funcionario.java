import javax.swing.*;

public class Funcionario extends Pessoa{
    private int matricula;
    private String cargo;
    private double salario;

    public Funcionario(String data_nasc, int idade, String cpf, String nome, int matricula, String cargo, double salario){
        super(data_nasc, idade, cpf, nome);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario () {

    }
    @Override
    public void catchInfo () {
        super.catchInfo();

        this.cargo = JOptionPane.showInputDialog(null, "Insira seu cargo");
        this.salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira seu salario"));

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override

    public String toString () {
        return "\n" + '\'' + super.toString() + "\n" +
                "Matricula: " + matricula + '\'' + "\n" +
                "Cargo: " + cargo + '\'' + "\n" +
                "Salario: " + salario + "\n";

    }

}
